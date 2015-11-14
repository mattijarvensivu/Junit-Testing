/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko3;

/**
 *
 * @author maza
 */
public class Jäsen {

    public Jäsen() {
    }

    public Jäsen(int jäsennro, String nimi, int bonusrahaa) {
        jäsenNumero = jäsennro;
        jäsenNimi = nimi;
        bonusRahakertymä = bonusrahaa;
    }

    public Jäsen(int jäsennro, String nimi) {
        jäsenNumero = jäsennro;
        jäsenNimi = nimi;
        bonusRahakertymä = 20;

    }
    private int jäsenNumero;

    public void setJäsenNumero(int jäsenNumero) {

        this.jäsenNumero = jäsenNumero;
    }

    public int getJäsenNumero() {
        return jäsenNumero;
    }
    private String jäsenNimi;

    public void setJäsenNimi(String jäsenNimi) {
        this.jäsenNimi = jäsenNimi;
    }

    public String getJäsenNimi() {
        return jäsenNimi;
    }
    private int bonusRahakertymä;

    public void setBonusRahakertymä(int bonusRahakertymä) {
        this.bonusRahakertymä = bonusRahakertymä;
    }

    public int getBonusRahakertymä() {
        return bonusRahakertymä;
    }

    public void lisääBonusta(int lisäys) {

        bonusRahakertymä = lisäys + bonusRahakertymä;

    }

}
