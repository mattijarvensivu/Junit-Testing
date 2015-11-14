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
public class lähtöjärjestys {
    
     public static void main (String[] args)
  {
      
    int[] järjestys = new int[46]; 
    int x;

    for (int i=1; i <= 45; i++) 
    {
      x = 1+ (int) (Math.random() * 45); 

      while (järjestys[x]!=0)
      {
        x = 1+ (int) (Math.random() * 45); 
       
      }           		

     
  järjestys[x]=1;

 
System.out.println((i)+(" Lähtijä ")+("numero ") +x);
  
        
   }

  
}
  }  
  
     
