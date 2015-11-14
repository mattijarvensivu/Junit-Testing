/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.oo1k2014;

/**
 *
 * @author maza
 */
public class Käsi implements Arvioitava {

    Kortti Käteni[] = new Kortti[5];

    public Käsi(Pakka Kortit) {
        for (int i = 0; i < Käteni.length; i++) {
            Käteni[i] = Kortit.annaKortti();
        }

    }

  
    

    @Override
    public String toString() {
String Tulostus="";
        for (int i = 0; i < Käteni.length; i++) {
          Tulostus =  Tulostus + Käteni[i].toString()+"\n";
              
        }
return Tulostus;
    }

    @Override
    public int annaArvo() {
        return annaArvo();

    }

}
