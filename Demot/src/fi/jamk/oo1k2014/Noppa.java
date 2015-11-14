/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.oo1k2014;

/**
 *
 * @author H4102
 */
public class Noppa {

     static int ykkösiä=0;
     static int Nopanheittoja = 0;
    int silmaluku = 0;

    public Noppa(){
    
    }
    public int getNopanheittoja() {
        return Nopanheittoja;
    }

    public static int getYkkösiä() {
        return ykkösiä;
    }

    public double Heita() {
         Nopanheittoja++;
        double vastaus;
        
        vastaus = annaSilmät();
        if (silmaluku == 1) {
            ykkösiä++;
        }
        return vastaus;
  
    }
    
    
    public double annaSilmät() {
       
    

        double Tulos = Math.random();
        if (Tulos <= 0.16667) {
            silmaluku = 1;
        }
        if (Tulos <= 0.33333 && Tulos > 0.16667) {
            silmaluku = 2;
        }
        if (Tulos <= 0.5 && Tulos > 0.33333) {
            silmaluku = 3;
        }
        if (Tulos <= 0.66667 && Tulos > 0.5) {
            silmaluku = 4;
        }
        if (Tulos <= 0.833334 && Tulos > 0.666667) {
            silmaluku = 5;
        }
        if (Tulos <= 1 && Tulos > 0.833334) {
            silmaluku = 6;
        }
        return silmaluku;
    }
}
