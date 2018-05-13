/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author ndzhi
 */
public class TP01_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Class Point Constructeurs
        Point p1 = new Point();
        Point p2 = new Point(3);
        Point p3 = new Point(3, 2);
        Point p4 = new Point(300, 200);
        System.out.println("Vous avez creer la point " + p1);
        System.out.println("Vous avez creer la point " + p2);
        System.out.println("Vous avez creer la point " + p3);
        System.out.println("Vous avez creer la point " + p4);
        System.out.println();

        // Class Point Methods
        // Comparer
        if (p2.equals(p3)) {
            System.out.println("Les points " + p1 + " et " + p2 + "sont egaux.");
        } else {
            System.out.println("Les points " + p1 + " et " + p2 + "ne sont pas egaux.");
        }
        System.out.println();

        // Mesurer la distance entre 2 points
        System.out.println("La distance entre " + p2 + " et " + p3 + " est " + p2.DistanceEntre2Points(p3));
        System.out.println();

        // Mesurer la distance entre un point et le point d'origine
        System.out.println("La distance entre " + p4 + " et le point d'origine " + " est " + p4.DistanceEntrePointDOrigine());
        System.out.println();

        // Class Cercle Constructeurs
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle(p4, 200);
        Cercle c3 = new Cercle(150, 250, 300);
        System.out.println();

        System.out.println("Vous avez creer la point " + c1);
        System.out.println("Vous avez creer la point " + c2);
        System.out.println("Vous avez creer la point " + c3);
        System.out.println();

        // Class Cercle Methods
        // getSurface
        System.out.println("La surface du cercle " + c2 + " est " + c2.getSurface());
        System.out.println("La surface du cercle " + c3 + " est " + c3.getSurface());
        System.out.println();

        // definir si un point est dans un cercle
        if (c3.Contient(p3)) {
            System.out.println("Le point " + p3 + " est situe dans le cercle " + c3);
        } else {
            System.out.println("Le point " + p3 + " n'est pas situe dans le cercle " + c3);
        }
        System.out.println();

        // Creation des cercle pour le dessin
        Cercle abc = new Cercle(100, 100, 20);
        Cercle def = new Cercle(100, 100, 30);
        Cercle ghi = new Cercle(50, 50, 50);
        Cercle jkl = new Cercle(50, 120, 130);
        Cercle mno = new Cercle(50, 60, 60);
        Cercle pqr = new Cercle(70, 50, 100);
        Cercle stu = new Cercle(50, 120, 40);
        Cercle vwx = new Cercle(50, 120, 20);
        System.out.println();

        // Class Dessin Constructeur
        Dessin d1 = new Dessin();
        Dessin d2 = new Dessin(25);
        System.out.println("Vous avez creer un dessin avec " + d1.getMyDessin().size() + " elements");
        System.out.println("Vous avez creer un dessin avec " + d2.getMyDessin().size() + " elements");
        System.out.println();

        // Class Dessin Methodes
        // ajouter
        d1.ajouterFigure(abc);
        d1.ajouterFigure(def);
        d1.ajouterFigure(ghi);
        d1.ajouterFigure(jkl);
        d1.ajouterFigure(mno);
        d1.ajouterFigure(pqr);
        d1.ajouterFigure(stu);
        d1.ajouterFigure(vwx);
        System.out.println();
        d1.afficherDessin();
        System.out.println();
        
        d1.sauvegarder("dessin1.txt");
        d2.ouvrir("dessin1.txt");
        
        /*
        
        Rectangle r1 = new Rectangle(p4, 100, 100);
        Rectangle r2 = new Rectangle(p4, 100, 200);
        Rectangle r3 = new Rectangle(p4, 200, 250);
        Rectangle r4 = new Rectangle(p4, 200, 300);
        
        PanneauDeDessin niki = new PanneauDeDessin(d1);
        niki.ajouterAuPanneau(r1);
        niki.ajouterAuPanneau(r2);
        niki.ajouterAuPanneau(r3);
        niki.ajouterAuPanneau(r4);
        niki.supprimerAuPanneau(r3);
        niki.ajouterAuPanneau(c3);
        niki.ajouterAuPanneau(c2);
        niki.ajouterAuPanneau(c1);
        
        JFrame fenetre =  new JFrame("Figure geometries");
        fenetre.getContentPane().add(niki,BorderLayout.CENTER);
        //la dimension de la fenetre
        fenetre.setSize(600, 600);
        //rendre visible la fenetre
        fenetre.setVisible(true);

        // Supprimer
        d1.supprimerFigure(jkl);
        d1.supprimerFigure(mno);
        d1.supprimerFigure(vwx);
        System.out.println();
        d1.afficherDessin();
        System.out.println();

        // tri de tableau
        d1.trierLesFiguresSurface();
        System.out.println("Votre tableau apres tri selon la surface");
        d1.afficherDessin();
        System.out.println();

        // definir si un point est dans un des cercle dans le tableau
        if (d1.pointAInterieur(p4)) {
            System.out.println("Le point " + p4 + " est situe dans votre dessin ");
        } else {
            System.out.println("Le point " + p4 + " n'est pas situe dans votre dessin ");
        }
        System.out.println();

        // calculation de surface total
        System.out.println("La surface total de votre dessin est " + d1.calculerSurfaceTotal());
        
       */
        
        
    }
}
