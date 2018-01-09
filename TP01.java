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
public class TP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Class Point Constructors
        Point p1 = new Point();
        Point p2 = new Point(3);
        Point p3 = new Point(3, 2);
        Point p4 = new Point(3, 2);
        System.out.println("You have created a point " + p1.ConvertToString());
        System.out.println("You have created a point " + p2.ConvertToString());
        System.out.println("You have created a point " + p3.ConvertToString());
        System.out.println("You have created a point " + p4.ConvertToString());
        System.out.println("");

        // Class Point Methods
        // Compare
        if (p2.Compare(p3)) {
            System.out.println("The points " + p1.ConvertToString() + " and " + p2.ConvertToString()
                    + "are equals");
        } else {
            System.out.println("The points " + p1.ConvertToString() + " and " + p2.ConvertToString()
                    + "are not equals");
        }
        System.out.println("");

        // Mesure the distance between 2 points
        System.out.println("The distance between " + p2.ConvertToString() + " and " + p3.ConvertToString() + " is " + p2.DistanceEntre2Points(p3));
        System.out.println("");

        // Mesure the distance between a point and (0,0)
        System.out.println("The distance between " + p4.ConvertToString() + " et le point d'origine " + " is " + p4.DistanceEntrePointDOrigine());
        System.out.println("");

        // Class Circle Constructors
        Circle c1 = new Circle();
        Circle c2 = new Circle(p1, 10);
        Circle c3 = new Circle(10, 20, 15);
        System.out.println("");

        System.out.println("You have created a point " + c1.ConvertToString());
        System.out.println("You have created a point " + c2.ConvertToString());
        System.out.println("You have created a point " + c3.ConvertToString());
        System.out.println("");

        // Class Circle Methods
        // getSurface
        System.out.println("The surface of the circle " + c2.ConvertToString() + " is " + c2.getSurface());
        System.out.println("The surface of the circle " + c3.ConvertToString() + " is " + c3.getSurface());
        System.out.println("");

        // check if a point is in a circle
        if (c3.Contain(p3)) {
            System.out.println("The point " + p3.ConvertToString() + " is in the circle " + c3.ConvertToString());
        } else {
            System.out.println("The point " + p3.ConvertToString() + " is not in the circle " + c3.ConvertToString());
        }
        System.out.println("");

        // Creation of circles for drawing
        Circle abc = new Circle(10, 10, 2);
        Circle def = new Circle(10, 10, 3);
        Circle ghi = new Circle(5, 5, 5);
        Circle jkl = new Circle(5, 12, 13);
        Circle mno = new Circle(5, 6, 6);
        Circle pqr = new Circle(7, 5, 10);
        Circle stu = new Circle(5, 12, 4);
        Circle vwx = new Circle(5, 12, 2);
        System.out.println("");

        // Class Drawing Constructors
        Drawing d1 = new Drawing();
        Drawing d2 = new Drawing(25);
        System.out.println("You have created a drawing with " + d1.getMyDessin().length + " elements");
        System.out.println("You have created a drawing with " + d2.getMyDessin().length + " elements");
        System.out.println("");

        // Class Drawing Methodes
        // add
        d1.addCircle(abc);
        d1.addCircle(def);
        d1.addCircle(ghi);
        d1.addCircle(jkl);
        d1.addCircle(mno);
        d1.addCircle(pqr);
        d1.addCircle(stu);
        d1.addCircle(vwx);
        System.out.println("");
        d1.visualizeDrawing();
        System.out.println("");

        // delete
        d1.deleteCircle(jkl);
        d1.deleteCircle(mno);
        d1.deleteCircle(vwx);
        System.out.println("");
        d1.visualizeDrawing();
        System.out.println("");

        // sort
        d1.sortCirclesSurface();
        System.out.println("Your drawing after sort");
        d1.visualizeDrawing();
        System.out.println("");

        // definir si un point est dans un des cercle dans le tableau
        if (d1.pointAInterieur(p4)) {
            System.out.println("The point " + p4.ConvertToString() + " is in your drawing ");
        } else {
            System.out.println("The point " + p4.ConvertToString() + " is not in your drawing ");
        }
        System.out.println("");

        // calculation de surface total
        System.out.println("The total surface of your drawing is " + d1.calculerSurfaceTotal());

    }
}
