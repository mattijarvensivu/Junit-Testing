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
public class JäsenTesti {

    public static void main(String[] args) {
        Jäsen Jäsen1;
        Jäsen1 = new Jäsen();
        Jäsen1.setJäsenNumero(1234);
        System.out.println("Jäsennumero: " + Jäsen1.getJäsenNumero());
        Jäsen1.setJäsenNimi("Pekka");
        System.out.println("Nimi:" + Jäsen1.getJäsenNimi());
        Jäsen1.setBonusRahakertymä(0);
        System.out.println("Bonusrahaa kertynyt " + Jäsen1.getBonusRahakertymä() + ("€"));
        Jäsen1.lisääBonusta(3);
        System.out.println("Bonusrahaa lisäyksen jälkeen" + Jäsen1.getBonusRahakertymä() + ("€"));

        Jäsen Jäsen2;
        Jäsen2 = new Jäsen();
        Jäsen2.setJäsenNumero(4321);
        System.out.println("Jäsennumero: " + Jäsen2.getJäsenNumero());
        Jäsen2.setJäsenNimi("Tuomas");
        System.out.println("Nimi:" + Jäsen2.getJäsenNimi());
        Jäsen2.setBonusRahakertymä(0);
        System.out.println("Bonusrahaa kertynyt " + Jäsen2.getBonusRahakertymä() + ("€"));
        Jäsen2.lisääBonusta(5);
        System.out.println("Bonusrahaa lisäyksen jälkeen " + Jäsen2.getBonusRahakertymä() + ("€"));

        Jäsen Jäsen3 = new Jäsen(3214, "Juha", 50);
        System.out.println("Jäsennumero: " + Jäsen3.getJäsenNumero());
        System.out.println("Nimi:" + Jäsen3.getJäsenNimi());
        System.out.println("Bonusrahaa kertynyt " + Jäsen3.getBonusRahakertymä() + ("€"));

        Jäsen Jäsen4 = new Jäsen(6969, "Janne");
        System.out.println("Jäsennumero: " + Jäsen4.getJäsenNumero());
        System.out.println("Nimi:" + Jäsen4.getJäsenNimi());
        System.out.println("Bonusrahaa kertynyt " + Jäsen4.getBonusRahakertymä() + ("€"));
    }

}
