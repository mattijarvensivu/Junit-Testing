/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko4;

/**
 *
 * @author H4102
 */
public class Työntekijä {
    private String nimi;
    private String asema;
    private double palkka;

    public Työntekijä(String nimi, String asema, double palkka) {
        this.nimi = nimi;
        this.asema = asema;
        this.palkka = palkka;
    }

    @Override
    public String toString() {
        return "Ty\u00f6ntekij\u00e4{" + "nimi=" + nimi + ", asema=" + asema + ", palkka=" + palkka + '}';
    }

    public String getAsema() {
        return asema;
    }

    public void setAsema(String asema) {
        this.asema = asema;
    }

    public double getPalkka() {
        return palkka;
    }

    public void setPalkka(double palkka) {
        this.palkka = palkka;
    }

 
    
    
}
