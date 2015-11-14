/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.oo1k2014;

/**
 *
 * @author maza
 */
public class Pakka {

    boolean Jaettu[] = new boolean[52];
    Kortti Kortit[] = new Kortti[52];

    public Pakka() {
        int k = 0;
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 13; i++) {
                Kortit[k] = new Kortti(j, i);
                Jaettu[k] = false;
                k++;
            }
        }
    }

    public Kortti annaKortti() {

        int x = (int) (Math.random() * 52);

        while (Jaettu[x] != false) {
            x = (int) (Math.random() * 52);

        }

        Jaettu[x] = true;

        return Kortit[x];
    }

    public void kokoa() {
        for (int i = 0; i < Jaettu.length; i++) {
            Jaettu[i] = false;

        }
    }
}
