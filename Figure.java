/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author ndzhi
 */

// La classe figure doit etre une classe parce que ell possede des attributs
// La classe figure doit etre abstraite parce que on peut pas modifier un methode pour tous les subclass. Ils vont etre specifiques
public abstract class Figure implements Comparable<Object>, Serializable{
    protected boolean visible;
    protected Color couleur;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    
    public abstract double getSurface();
    public abstract boolean Contient(Point point1);
    public abstract void dessinerFigure(Graphics g);

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Figure) {
            return this.getSurface() == ((Figure) obj).getSurface();
        } else {
            return false;
        }
    }

      @Override
    public int compareTo(Object o) throws ClassCastException {
        if (!(o instanceof Figure)) {
            throw new ClassCastException("A figure object expected.");
        }
        if (this.getSurface() < ((Figure) o).getSurface()) {
            return -1;
        } else if (this.getSurface() > ((Figure) o).getSurface()) {
            return 1;
        } else {
            return 0;
        }
    }
   
    
    
     public static Comparator<Figure> SurfaceComparator = new Comparator<Figure>() {
        @Override
        public int compare(Figure o1, Figure o2) {
             if (o1.getSurface() < o2.getSurface()) {
                return -1;
            } else if (o1.getSurface() > o2.getSurface()) {
                return 1;
            } else {
                return 0;
            }
        }
        

    };
    
    
}
