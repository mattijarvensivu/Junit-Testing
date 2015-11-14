/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko4;

/**
 *
 * @author H4102
 */
public class Johtaja extends Työntekijä {
    
    private String auto;
    private double bonus;

    public Johtaja(String auto, double bonus, String nimi, String asema, double palkka) {
        super(nimi, asema, palkka);
        this.auto = auto;
        this.bonus = bonus;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Johtaja{" + "auto=" + auto + ", bonus=" + bonus + '}'
               + super.toString();
    }
    
}
