/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko2;

/**
 *
 * @author maza
 */
public class Etsi {

    public static int pienempi(int eka, int toka) {
        int s;

    if (eka < toka)
      s=eka;
    else
      s=toka;

    return s;

    }

    public static int[] vastaluku(int[] taulukko) {
        for(int i=0; i<taulukko.length; i++){
           taulukko[i] =taulukko[i]*(-1);
                    
        }
         return taulukko;   
        
    }
    
    public static void main(String[] args) {

    }

}
