/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

/**
 *
 * @author usager
 */
public class Circle {

    private Point centre;
    private double radius;

// Constructor without arguments
    public Circle() {
//        this.centre = new Point();
//        this.rayon = 0.0;
        this(new Point(), 10);
    }
// Constructor with centre and radius

    public Circle(Point centre, double rayon) {
//        this.centre = centre;
//        this.rayon = rayon;
        this(centre.getAbscissa(), centre.getOrdinate(), rayon);
    }
// constructor with coordonates and radius

    public Circle(double abscisse, double ordonnee, double rayon) {
        Point a = new Point(abscisse, ordonnee);
        this.centre = a;
        this.radius = rayon;

    }
// Getters and setters 

    public Point getCentre() {
        return centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRadius(double rayon) {
        this.radius = rayon;
    }
// Getters and setters fin

// Method to calculate the surface
    public double getSurface() {
        return (Math.PI * Math.pow(radius, 2.0));

    }
// Method to convert a circle in String

    public String ConvertToString() {
        return "[" + centre.ConvertToString() + ";" + getRadius() + "]";
    }
// method to determine if a point is situated in the circle

    public boolean Contain(Point point1) {
        //return point1.Comparer(point1, cercleb.getCentre());
        //double a = cercleb.getRayon() - cercleb.centre.getAbscisse();
        //double b = cercleb.getRayon() - cercleb.centre.getOrdonnee();
        //return point1.getAbscisse()<= (cercleb.getRayon()- xxxx ) && point1.getOrdonnee() <= cercleb.getRayon();
        return point1.DistanceEntre2Points(centre) <= radius;
    }

    // @Override the method equals pour compare two circles
    public boolean equals(Circle obj) {
        boolean result;
        if (obj == null ) {
            result = false;
        } else {
           result = centre.Compare(obj.getCentre()) && (radius == obj.getRadius());
        }
        return result;

    }

    

}
