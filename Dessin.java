/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author usager
 */
public class Dessin implements Serializable{

    private ArrayList<Figure> myDessin;

// Constructeur sans arguments, le dessin pourra contenir jusqu’à 10 figure
    public Dessin() {
        this(10);
    }
// Constructeur qui définit le nombre maximum de figures que le dessin peut contenir. 

    public Dessin(int numFigures) {
        myDessin = new ArrayList<>(numFigures); //new Cercle[numCercle];
    }

    public ArrayList<Figure> getMyDessin() {
        return myDessin;
    }

    // Une methode pout ajouter des figures
    public void ajouterFigure(Figure f) {
        int i = 0;
        myDessin.add(f);
        System.out.println("La figure avec des coordonees " + myDessin.get(i).toString() + " a ete ajouter à votre dessin de "
                + myDessin.size() + " elements");
    }
    //Si il'y a plusieurs figures il supprime le premièr

    public void supprimerFigure(Figure f1) {
        if (myDessin.indexOf(f1) > -1) {
            System.out.println("La figure avec des coordonee " + f1 + " a ete supprimer");
            myDessin.remove(f1);
        } else {
            System.out.println("La figure n'existe pas");
        }
    }

    // Cette methode est pour affichage
    public void afficherDessin() {
        for (int i = 0; i < myDessin.size(); i++) {
            System.out.println("L'element " + i + " de votre dessin est " + myDessin.get(i));
            System.out.println("Sa surface est " + myDessin.get(i).getSurface());
        }
    }
    // Cette methode trie les figures dans le dessin en ordre croissante selon leur surface. 

    public void trierLesFiguresSurface() {
        myDessin.sort(Figure.SurfaceComparator);
    }

    // cette methode reçoit un objet Point et qui nous dit si le point est à l’intérieur d’au moins un des figures du dessin ;
    public boolean pointAInterieur(Point p1) {
        boolean isInterieur = false;
        for (Figure a : myDessin) {
            if (a.Contient(p1)) {
                isInterieur = true;
            }
        }
        return isInterieur;
    }
// Cette methode calcule la surface totale du dessin

    public double calculerSurfaceTotal() {
        double surfaceTotal = 0;
        for (Figure a : myDessin) {
            surfaceTotal += a.getSurface();
        }
        return surfaceTotal;
    }

    public Figure getElement(int i) {
        try {
            return myDessin.get(i);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Ce element n'existe pas");
        }
    }
    
    public void sauvegarder(String nomFichier) {
        try (FileOutputStream f1 = new FileOutputStream(nomFichier); ObjectOutputStream ob1 = new ObjectOutputStream(f1)) {
            ob1.writeObject(this);
            System.out.println("Le dessin est sauvegardé dans " + nomFichier);
        } catch (IOException ex) {
            System.out.println("ERREUR d'E/S");
            ex.printStackTrace();
        }
    }
    
    public void ouvrir (String nomFichier) {
        Dessin a;
        try (FileInputStream f2 = new FileInputStream(nomFichier); ObjectInputStream ob2 = new ObjectInputStream(f2)){
            a = (Dessin)ob2.readObject();
            System.out.println("Le dessin de fichier " + nomFichier);
            a.afficherDessin();
        } catch (Exception e) {
            System.out.println("ERREUR d'E/S");
            e.printStackTrace();
        }
    }
}
