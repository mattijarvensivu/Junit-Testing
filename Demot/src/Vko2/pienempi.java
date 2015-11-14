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
public class pienempi {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        int luku1;
        int luku2;

        System.out.print("Anna 1. luku: ");
        luku1 = lukija.nextInt();
        System.out.print("Anna 2. luku: ");
        luku2 = lukija.nextInt();
        System.out.print("Pienempi luvuista on ");
        System.out.println(Etsi.pienempi(luku1, luku2));

    }
}
