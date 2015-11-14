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
public class OpiskelijaTesti {

    public static void main(String[] args) {
        Opiskelija Opiskelija1;
        Opiskelija1 = new Opiskelija();
        Opiskelija1.setOpiskelijaNumero(1234);
        Opiskelija1.setEtuNimi("Pekka");
        Opiskelija1.setSukuNimi("Koivisto");

        System.out.println("Tiedot:" + Opiskelija1.Tulostus());

        Opiskelija Opiskelija2;
        Opiskelija2 = new Opiskelija();
        Opiskelija2.setOpiskelijaNumero(4212);
        Opiskelija2.setEtuNimi("Tuomas");
        Opiskelija2.setSukuNimi("Haapanen");
        System.out.println("Tiedot:" + Opiskelija2.Tulostus());//Toimii ilmeisseti noinkin

        Opiskelija Opiskelija3;
        Opiskelija3 = new Opiskelija();
        Opiskelija3.setOpiskelijaNumero(1278);
        Opiskelija3.setEtuNimi("Heikki");
        Opiskelija3.setSukuNimi("Seppänen");
        System.out.println("Tiedot:" + Opiskelija3.Tulostus());
        
        Opiskelija Opiskelija4= new Opiskelija(3817, "Matti","Tuomioja" );
        System.out.println("Tiedot:" + Opiskelija4.Tulostus());
        
        OpiskelijaRyhmä Opiskelija5;
        Opiskelija5= new OpiskelijaRyhmä("IIO13S2", Opiskelija3, new Opiskelija[20]);
        Opiskelija5.Lisääopiskelija(Opiskelija4);
        Opiskelija5.Lisääopiskelija(Opiskelija3);
        
        System.out.println("Tiedot:" + Opiskelija5.Tulostus());
        
        
//Opiskelija5.Lisääopiskelija();
        /*System.out.println(*/Opiskelija5.getTaulukko();
    }

}
