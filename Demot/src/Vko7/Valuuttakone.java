/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko7;

/**
 *
 * @author H4102
 */
public class Valuuttakone {

    private Valuutta[] valuutta;

    public Valuuttakone() {
        valuutta = new Valuutta[4];
        valuutta[0] = new Valuutta("Euro", 1);
        valuutta[1] = new Valuutta("Ruotsin kruunu", 10.4);
        valuutta[2] = new Valuutta("Norjan kruunu", 8.3);
        valuutta[3] = new Valuutta("Yhdysvaltain dollari", 1.25);

    }
}
