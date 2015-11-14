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
 
public class harj1 {
  public static void main(String[] args) {
 
	  System.out.println("Syötä kateetin pituus ");
 
	   String kateetti;
           
           Scanner scanIn = new Scanner(System.in);
           kateetti = scanIn.nextLine();
           
         System.out.println("Syötä kateetin pituus ");
 
	   String kateetti2;
           
           kateetti2 = scanIn.nextLine();
           scanIn.close();
           double x =Double.parseDouble(kateetti);
           double y =Double.parseDouble(kateetti2);
           double z = Math.sqrt(x*x + y*y);
           System.out.println(z); 
}
}