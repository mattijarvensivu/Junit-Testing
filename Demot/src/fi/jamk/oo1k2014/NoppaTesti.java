/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.oo1k2014;

/**
 *
 * @author H4102
 */
public class NoppaTesti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Noppa Noppa1 = new Noppa();
        Noppa Noppa2 = new Noppa();
        Noppa Noppa3 = new Noppa();
        HuijariNoppa huijarinnoppa1 = new HuijariNoppa();
        HuijariNoppa huijarinnoppa2 = new HuijariNoppa();
        HuijariNoppa huijarinnoppa3 = new HuijariNoppa();

        while (Noppa1.silmaluku + Noppa2.silmaluku + Noppa3.silmaluku != 18) {
            System.out.println("Noppa1 " + Noppa1.Heita());
            System.out.println("Noppa2 " + Noppa2.Heita());
            System.out.println("Noppa3 " + Noppa3.Heita() + "\n");
        }
        while (huijarinnoppa1.silmaluku + huijarinnoppa2.silmaluku + huijarinnoppa3.silmaluku != 18) {
            System.out.println("Huijarinoppa1 " + huijarinnoppa1.Heita());
            System.out.println("Huijarinoppa2 " + huijarinnoppa2.Heita());
            System.out.println("Huijarinoppa3 " + huijarinnoppa3.Heita() + "\n");
        }

        System.out.println("ykkösiä: " + Noppa.getYkkösiä());
        System.out.println("Heittoja: " + Noppa1.getNopanheittoja());
        System.out.println("Huijari heittoja: " + huijarinnoppa1.getHuijariheittoja());
    }
}
