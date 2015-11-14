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
public class Taulukkomuunnin {
    public static void main(String[] args){
        
        int[]taulukko=new int[]{2, 12, 21, 5, -3, -15};
        int[]taulukko2=Etsi.vastaluku(taulukko);
      
         for(int i=0; i<taulukko2.length; i++ ){
            System.out.print(taulukko2[i]+" ");
        }
       
    }
}
