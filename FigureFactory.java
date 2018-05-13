/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01_p1_nikoletatsvetkova;

/**
 *
 * @author ndzhi
 */ //"Cercle 40 30 20" "Rectangle 20 50 70 100"
public class FigureFactory {

    public static Figure getFigure(String order) throws Exception {
        try {
            int[] nombreEspace;
            if (order.startsWith("Cercle")) {
                nombreEspace = new int[3];
                nombreEspace[0] = order.indexOf(' ', 7);
                nombreEspace[1] = order.indexOf(' ', nombreEspace[0]);
                nombreEspace[2] = order.indexOf(' ', nombreEspace[1]);
                double param1 = Double.parseDouble(order.substring(nombreEspace[0], (nombreEspace[1] - 1)));
                double param2 = Double.parseDouble(order.substring(nombreEspace[1], (nombreEspace[2] - 1)));
                double param3 = Double.parseDouble(order.substring(nombreEspace[2], (order.length() - 1)));
                if (nombreEspace[0] != 0) {
                    return new Cercle();
                } else if (nombreEspace[1] != 0) {
                    return new Cercle(param1, 0, 10);
                } else if (nombreEspace[2] != 0) {
                    return new Cercle(param1, param2, 10);
                } else {
                    return new Cercle(param1, param2, param3);
                }
            } else if (order.startsWith("Rectangle")) {
                nombreEspace = new int[4];
                nombreEspace[0] = order.indexOf(' ', 7);
                nombreEspace[1] = order.indexOf(' ', nombreEspace[0]);
                nombreEspace[2] = order.indexOf(' ', nombreEspace[1]);
                nombreEspace[3] = order.indexOf(' ', nombreEspace[2]);
                double param1 = Double.parseDouble(order.substring(nombreEspace[0], (nombreEspace[1] - 1)));
                double param2 = Double.parseDouble(order.substring(nombreEspace[1], (nombreEspace[2] - 1)));
                double param3 = Double.parseDouble(order.substring(nombreEspace[2], (nombreEspace[3] - 1)));
                double param4 = Double.parseDouble(order.substring(nombreEspace[3], (order.length() - 1)));
                if (nombreEspace[0] != 0) {
                    return new Rectangle(new Point(param1), 10, 10);
                } else if (nombreEspace[1] != 0 && nombreEspace[2] != 0) {
                    return new Rectangle(new Point(param1, param2), param3, 10);
                } else {
                    return new Rectangle(new Point(param1, param2), param3, param4);
                }
            }
        } catch (Exception e) {
            throw new Exception("Vous devez choisir un Rectangle ou un Cercle et entrer les donnees numerique");
        }
        return null;
    }
}
