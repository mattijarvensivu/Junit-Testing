/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko5;

/**
 *
 * @author H4102
 */
public class Tuote {
   private int Tuotenumero=0;
    private String Nimi;
    private double Hinta=0;
    private static int numero=1;
    
    public Tuote(String nimi, double hinta){
        this.Nimi=nimi;
        this.Hinta=hinta;
        this.Tuotenumero=Tuote.numero;
    }

    public int getTuotenumero() {
        return Tuotenumero;
    }

    public void setTuotenumero(int Tuotenumero) {
        this.Tuotenumero = Tuotenumero;
    }

    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String Nimi) {
        this.Nimi = Nimi;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Tuote.numero = numero;
    }

   
    public double getHinta() {
        return Hinta;
    }

    @Override
    public String toString() {
        return "Tuote{" + "Tuotenumero=" + Tuotenumero + ", Nimi=" + Nimi + ", Hinta=" + Hinta + '}';
    }

    
   
       
        
    }

