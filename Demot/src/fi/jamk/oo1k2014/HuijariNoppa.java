/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.oo1k2014;

/**
 *
 * @author H4102
 */
public class HuijariNoppa extends Noppa {
   
    public HuijariNoppa(){
        
    }
     int huijariheittoja = 0;

    public int getHuijariheittoja() {
        return huijariheittoja;
    }

  
    
    @Override
 public double Heita() {
     
     double vastaus;
      
        huijariheittoja++;
        vastaus = annaSilmät();
        
          if (silmaluku == 1) {
            ykkösiä++;
        }
        
        return vastaus;
        
}
        
    
    @Override
   public double annaSilmät() {
       
   
        double Tulos = Math.random();
        if (Tulos <= 0.14 ) {
            silmaluku = 1;
        }
        if (Tulos <= 0.28 && Tulos > 0.14) {
            silmaluku = 2;
        }
        if (Tulos <= 0.42 && Tulos > 0.28) {
            silmaluku = 3;
        }
        if (Tulos <= 0.56 && Tulos > 0.42) {
            silmaluku = 4;
        }
        if (Tulos <= 0.70 && Tulos > 0.56) {
            silmaluku = 5;
        }
        if (Tulos <= 1 && Tulos > 0.70) {
            silmaluku = 6;
        }
        
        return silmaluku;
       
    }
    
    
}
