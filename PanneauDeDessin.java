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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author ndzhi
 */
public class PanneauDeDessin extends JPanel implements Serializable {

    Dessin panD;

    public PanneauDeDessin() {
        this.panD = new Dessin();
    }

    public PanneauDeDessin(Dessin panD) {
        this.panD = panD;
    }

    public Dessin getPanD() {
        return panD;
    }

    public void setPanD(Dessin panD) {
        this.panD = panD;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figure a : this.getPanD().getMyDessin()) {
            a.dessinerFigure(g);
        }
    }

    public void ajouterAuPanneau(Figure f1) {
        this.getPanD().ajouterFigure(f1);
    }

    public void supprimerAuPanneau(Figure f1) {
        this.getPanD().supprimerFigure(f1);
    }

    public Figure accederAuElement(int index) {
        try {
            return panD.getElement(index);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Ce element n'existe pas");
        }
    }

    

}
