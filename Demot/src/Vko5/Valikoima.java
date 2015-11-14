/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author H4102
 */
public class Valikoima {

    List<Tuote> tuote = new ArrayList<>();//luodaan tuotelista

    public void lisaaTuoteValikoimaan(Tuote tuote) {
        this.tuote.add(tuote);
    }

    public void poistaTuoteValikoimasta(int tuotenumero) {
        Tuote x = getTuote(tuotenumero);
        if (x != null) {
            this.tuote.remove(x);
        } else {
            System.out.println("Ei löytynyt poistettavaa tuotetta!");
        }
    }

    public Tuote getTuote(int tuotenumero) {
        Tuote x= null;
        for (Tuote tuote1 : tuote) {
            if (tuote1.getTuotenumero() == tuotenumero) {
                return tuote1;
            }

        }
        return x;

    }

    public void tulosta() {
        System.out.println("Tuote" + tuote.toString());
    }
}
