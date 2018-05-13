/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Comparator;

/**
 *
 * @author ndzhi
 */
public class Rectangle extends Figure {

    private Point sommet;
    private double largeur;
    private double hauteur;

    public Rectangle(Point sommet, double largeur, double hauteur) {
        this.sommet = sommet;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.couleur = Color.GREEN;
        this.visible = true;
    }
    

    @Override
    public double getSurface() {
        return largeur * hauteur;
    }

    @Override
    public boolean Contient(Point point1) {
        boolean isInAbs = (sommet.getAbscisse() <= point1.getAbscisse()) && (point1.getAbscisse() <= (sommet.getAbscisse() + largeur));
        boolean isInOrd = (sommet.getOrdonnee() >= point1.getOrdonnee()) && (point1.getOrdonnee() >= (sommet.getOrdonnee() - hauteur));
        return isInAbs && isInOrd;
    }

    @Override
    public void dessinerFigure(Graphics g) {
        g.setColor(this.getCouleur());
        g.drawRect((int)sommet.getAbscisse(), (int)sommet.getOrdonnee(), (int)largeur, (int)hauteur);
    }

    @Override
    public String toString() {
        return sommet + ", " + largeur + "cm, " + hauteur + "cm";
     }
    
    
}
