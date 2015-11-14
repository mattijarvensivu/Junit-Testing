/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko7;

/**
 *
 * @author H4102
 */
public class Valuutta {
    
    private String nimi;
    private double valuuttakurssi;

    public Valuutta(String nimi, double valuuttakurssi) {
        this.nimi = nimi;
        this.valuuttakurssi = valuuttakurssi;
    }
    
    

    public String getNimi() {
        return nimi;
    }

    public double getValuuttakurssi() {
        return valuuttakurssi;
    }
        
    
}
