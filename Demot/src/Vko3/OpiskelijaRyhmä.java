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
public class OpiskelijaRyhmä {

    private String Ryhmä;
    private Opiskelija kontaktiopiskelija;
    private Opiskelija[] Taulukko;

    public OpiskelijaRyhmä(String Rhmä, Opiskelija kontaktioppilas, Opiskelija[] Taulu) {
        Ryhmä = Rhmä;
        kontaktiopiskelija = kontaktioppilas;
        Taulukko = Taulu;
    }

    public Opiskelija[] getTaulukko() {
        return Taulukko;
    }

    public void setTaulukko(Opiskelija[] Taulukko) {
        this.Taulukko = Taulukko;
    }

    public String getRyhmä() {
        return Ryhmä;
    }

    public void setRyhmä(String Ryhmä) {
        this.Ryhmä = Ryhmä;
    }

    public Opiskelija getKontankiopiskelija() {
        return kontaktiopiskelija;
    }

    public void setKontankiopiskelija(Opiskelija kontankiopiskelija) {
        this.kontaktiopiskelija = kontankiopiskelija;
    }

    public String Tulostus() {
        String tiedot="";
        for (int i = 0; i < Taulukko.length; i++) {
            if (Taulukko[i] != null) {
                tiedot+=Taulukko[i].Tulostus();
            }

        }
        tiedot = "\nkontaktiopiskelija:" + kontaktiopiskelija.getEtuNimi() + " " + kontaktiopiskelija.getSukuNimi() + "\n" + "Ryhmä:" + Ryhmä;
        return tiedot;

    }

    public void Lisääopiskelija(Opiskelija Oppilas) {

        for (int i = 0; i < Taulukko.length; i++) {
            if (Taulukko[i] == null) {
                Taulukko[i] = Oppilas;
                break;




            }
        }

    }
}
