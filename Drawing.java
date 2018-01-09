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
public class Drawing {

    private Circle[] myDessin;

// Constructor without arguments, the drawing could have just 10 circles
    public Drawing() {
        this(10);
    }
// Constructor which defines the size of the drawing 

    public Drawing(int numCercle) {

        myDessin = new Circle[numCercle];

    }

    public Circle[] getMyDessin() {
        return myDessin;
    }

// Methode which adds circles on the first position available, does not check if this circle already exists
    public void addCircle(/*double a, double b, double c*/Circle c1) {
        int i = 0;
        while (myDessin[i] != null && i < myDessin.length) {
            i++;
        }
        myDessin[i] = c1;//new Cercle(a, b, c);////
        System.out.println("The circle with coordinates " + myDessin[i].ConvertToString() + " was added to you drawing " + myDessin.length + " elements");
    }
    //Method to delete a circle in the drawing. If there are multiple circles with the same coordinates and radius it will delete all
    //two versions one pointing to an object another using the coordinates and radius


    public void deleteCircle(/*double a, double b, double c*/Circle c1) {
        //Cercle aSupprimer = new Cercle(a, b, c);
        boolean match = false;
        for (int i = 0; i < myDessin.length; i++) {
            if (/*aSupprimer*/c1.equals(myDessin[i])) {
                System.out.println("The circle with coordinates " + myDessin[i].ConvertToString() + " was deleted");
                myDessin[i] = null;
                match = true;
            }
        }
        if (match == false) {
            System.out.println("This circle does not exist");
        }
    }

    // Method to visualize the array
    public void visualizeDrawing() {
        for (int i = 0; i < myDessin.length; i++) {
            if (myDessin[i] != null) {
                System.out.println("The element " + i + " of your drawing " + myDessin[i].ConvertToString());
                System.out.println("The surface is " + myDessin[i].getSurface());
            } else {
                System.out.println("The element " + i + " is empty");
            }
        }
    }
    // Methode to sort the circles in the drawing by growing surface. The empty positions go to the end

    public void sortCirclesSurface() {
        for (int i = 0; i < myDessin.length - 1; i++) {
            Circle temp;
            for (int j = i + 1; j < myDessin.length; j++) {
                if ((myDessin[i] != null)) {
                    if (myDessin[j] != null) {
                        if (myDessin[i].getSurface() > myDessin[j].getSurface()) {
                            temp = myDessin[i];
                            myDessin[i] = myDessin[j];
                            myDessin[j] = temp;
                        }
                    }
                } else {
                    myDessin[i] = myDessin[j];
                    myDessin[j] = null;
                }
            }
        }
    }

    // Methode to check if a point is in at least one of the circles in the drawing
    public boolean pointAInterieur(Point a) {
        boolean pointAInterieur = false;
        int i = 0;
        while (i < myDessin.length) {
            if (myDessin[i] != null && myDessin[i].Contain(a)) {
                pointAInterieur = true;
            }
            i++;
        }
        return pointAInterieur;
    }
// Method to calculate the total surface of the drawing(sum of all circles surfaces

    public double calculerSurfaceTotal() {
        double surfaceTotal = 0;
        for (int i = 0; i < myDessin.length; i++) {
            if (myDessin[i] != null) {
                surfaceTotal += myDessin[i].getSurface();
            }
        }
        return surfaceTotal;
    }
}
