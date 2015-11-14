/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko2;

import java.util.Scanner;

/**
 *
 * @author maza
 */
public class mäkihyppypisteet {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        int maksimi = 0;
        int minimi = 1000;
        int yht = 0;
        int[] tuomari = new int[5];
        for (int i = 0; i < 5; i++) {

            System.out.print(("Tuomarin ") + (i + 1) + (" pisteet"));
            tuomari[i] = lukija.nextInt();

            if (tuomari[i] >= 0 && tuomari[i] <= 20) {
                yht = tuomari[i] + yht;

                if (tuomari[i] > maksimi) {
                    maksimi = tuomari[i];
                }
                if (tuomari[i] < minimi) {
                    minimi = tuomari[i];
                }
            } else {
                System.out.print("virheelliset pisteet");
            }
        }
        System.out.print(("Yhteispisteet") + (yht - maksimi - minimi));
    }

}
