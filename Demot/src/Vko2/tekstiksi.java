package Vko2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maza
 */
import java.util.Scanner;

public class tekstiksi {

    static Scanner lukija = new Scanner(System.in);
       
    public static void main(String[] args) {
        int numero=0;
System.out.print("Syötä arvosanasi");
 numero = lukija.nextInt();
        
 
        if (numero == 0) {
            System.out.print("Hylätty");
        }
       else if (numero == 1) {
            System.out.print("Välttävä");
        }
      else  if (numero == 2) {
            System.out.print("Tyydyttävä");
        }
      else if (numero == 3) {
            System.out.print("Hyvä");
        }
       else if (numero == 4) {
            System.out.print("Kiitettävä");
        }
       else if (numero == 5) {
            System.out.print("Erinomainen");
        } 
    
        else {
            System.out.print("Virhe! Syötä arvosana väliltä 0-5");

        }
    }

}
