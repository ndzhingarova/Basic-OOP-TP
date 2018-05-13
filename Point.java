/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

import java.io.Serializable;

/**
 *
 * @author ndzhi
 */
public class Point implements Serializable{

    private double abscisse;
    private double ordonnee;

    // Constructeur sans fournir des valeurs initiales
    public Point() {
        this(0, 0);
    }

    // Constructeur en fournissant la valeur initiale de l'abscisse
    public Point(double abscisse) {
        this(abscisse, 0);
    }

    // Constructeur en fournissant les deux valeurs initiales
    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public double getAbscisse() {
        return abscisse;
    }

    // Getters and setters début
    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    // Getters and setters fin
    // Methode pour comparaison de deux points
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return (this.getAbscisse() == ((Point) obj).getAbscisse()) && (this.getOrdonnee() == ((Point) obj).getOrdonnee());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) ((this.getAbscisse() * 31) + this.getOrdonnee());
    }

    // Methode pour convertir la pointe en chaîne de caratere

    @Override
    public String toString() {
        return "(" + abscisse + "," + ordonnee + ")";
    }
    

    // Methode pour mesurer la distance entre deux pointes
    public double DistanceEntre2Points(Point point2) {
        return Math.sqrt(Math.pow((abscisse - point2.getAbscisse()), 2) + Math.pow(ordonnee - point2.getOrdonnee(), 2));
    }

    // Methode pour mesurer la disatnce entre la pointe et la pointe d'origine
    public double DistanceEntrePointDOrigine() {
        Point origine = new Point();
        return this.DistanceEntre2Points(origine);
    }

}
