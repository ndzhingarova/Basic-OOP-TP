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
 * @author usager
 */
public class Cercle extends Figure {

    private Point centre;
    private double rayon;

// Constructeur sans argument, initialise le centre au point (0,0) et le rayon à 10
    public Cercle() {
        this(new Point(), 10);
        this.couleur = Color.ORANGE;
        

    }
// Constructeur qui reçoit le centre et le rayon

    public Cercle(Point centre, double rayon) {
        this(centre.getAbscisse(), centre.getOrdonnee(), rayon);
        this.couleur = Color.BLUE;
    }
// Constructeur qui reçoit les coordonnées du centre et le rayon

    public Cercle(double abscisse, double ordonnee, double rayon) {
        Point a = new Point(abscisse, ordonnee);
        this.centre = a;
        this.rayon = rayon;
        this.couleur = Color.red;
        this.visible = true;
    }
// Getters and setters début

    public Point getCentre() {
        return centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
// Getters and setters fin
    // Méthode qui reçoit un objet Point et qui définit si le point est à l’intérieur du cercle.
    @Override
    public boolean Contient(Point point1) {
        return point1.DistanceEntre2Points(centre) <= rayon;
    }

// Methode qui calcule puis retourne la surface du cercle (PI*rayon2).
    @Override
    public double getSurface() {
        return (Math.PI * Math.pow(rayon, 2.0));

    }
// Méthode pour convertir un cercle en chaîne de caractères.

    @Override
    public String toString() {
        return "[" + centre.toString() + ";" + getRayon() + "]";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Cercle) {
//            return this.getSurface() == ((Cercle) obj).getSurface();
//        } else {
//            return false;
//        }
//    }
    @Override
    public int hashCode() {
        return (int) (this.getRayon() * 31) - this.hashCode();
    }

    @Override
    public int compareTo(Object o) throws ClassCastException {
        if (!(o instanceof Cercle)) {
            throw new ClassCastException("A cercle object expected.");
        } else if (this.getSurface() < ((Cercle) o).getSurface()) {
            return -1;
        } else if (this.getSurface() > ((Cercle) o).getSurface()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void dessinerFigure(Graphics g) {
        g.setColor(this.getCouleur());
        g.drawOval((int) centre.getAbscisse(), (int) centre.getOrdonnee(), (int) rayon, (int) rayon);
    }
}
