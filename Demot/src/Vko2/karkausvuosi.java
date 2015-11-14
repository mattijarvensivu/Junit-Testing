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
public class karkausvuosi {
    static Scanner lukija = new Scanner(System.in);
       
    public static void main(String[] args) {
    int vuosiluku=0;
    System.out.print("Anna vuosiluku");
    vuosiluku=lukija.nextInt();
    if(vuosiluku%4==0 && vuosiluku%100!=0){ 
       System.out.print("On karkausvuosi"); 
    }
    else if (vuosiluku%400==0){
        System.out.print("On karkausvuosi");
    }
    else{
        System.out.print("Ei ole karkausvuosi");
    }
    
}
}
