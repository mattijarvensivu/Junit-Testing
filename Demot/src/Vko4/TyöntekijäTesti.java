/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko4;

/**
 *
 * @author H4102
 */
public class TyöntekijäTesti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Työntekijä eka = new Työntekijä("mikko","Koodari",5000);
        System.out.println(eka);
        Johtaja toka = new Johtaja("Volvo", 500, "Keijo", "Johtaja", 10000);
        System.out.println(toka);
        toka.setAuto("ford");
        System.out.println(toka);
    }
}
