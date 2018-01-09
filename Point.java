/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

/**
 *
 * @author ndzhi
 */
public class Point {

    private double abscissa;
    private double ordinate;

    // constructor with no values
    public Point() {
        this(0, 0);
    }

    // constructor with abscissa
    public Point(double abscisse) {
        this(abscisse, 0);
    }

    // constructor with abscissa and ordonate
    public Point(double abscisse, double ordonnee) {
        this.abscissa = abscisse;
        this.ordinate = ordonnee;
    }

    public double getAbscissa() {
        return abscissa;
    }

    // Getters and setters 
    public void setAbscissa(double abscisse) {
        this.abscissa = abscisse;
    }

    public double getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(double ordonnee) {
        this.ordinate = ordonnee;
    }
    // Getters and setters fin

    // Method to compare two points
    public boolean Compare(Point point2) {
        return (abscissa == point2.abscissa) && (ordinate == point2.ordinate);
    }

    // Method to convert a point in String
    public String ConvertToString() {
        return "(" + abscissa + "," + ordinate + ")";
    }

    // Method to mesure the distance between two points
    public double DistanceEntre2Points(Point point2) {
        return Math.sqrt(Math.pow((abscissa - point2.getAbscissa()), 2) + Math.pow(ordinate - point2.getOrdinate(), 2));
    }

    // Methode to mesure the distance between the point and (0,0)
    public double DistanceEntrePointDOrigine() {
        Point origine = new Point();
        return this.DistanceEntre2Points(origine);
    }

}
