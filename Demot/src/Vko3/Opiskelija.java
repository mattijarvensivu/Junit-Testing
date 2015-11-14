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
public class Opiskelija{
    public Opiskelija(){this(0,"Testi", "Testi");}
    public Opiskelija(int opintonumero,String Etunimi, String Sukunimi ){
        OpiskelijaNumero=opintonumero;
        EtuNimi=Etunimi;
        SukuNimi=Sukunimi;
        
        
    }
    private int OpiskelijaNumero;

    public void setOpiskelijaNumero(int Numero) {

        this.OpiskelijaNumero = Numero;
    }

    public int getOpiskelijaNumero() {
        return OpiskelijaNumero;
    }
    private String EtuNimi;

    public void setEtuNimi(String firstname) {
        this.EtuNimi = firstname;
    }

    public String getEtuNimi() {
        return EtuNimi;
    }
    private String SukuNimi;

    public void setSukuNimi(String Surname) {
        this.SukuNimi = Surname;
    }

    public String getSukuNimi() {
        return SukuNimi;
    }
    public String Tulostus(){
        String tiedot;
        tiedot = "\nopiskelijanumero:"+OpiskelijaNumero + "\n" +"Etunimi:"+ EtuNimi+ "\n"+ "Sukunimi:"+ SukuNimi;
        return tiedot;

    }
}