/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vko6;

/**
 *
 * @author H4102
 */
public class PeliGUI {

    private int voittajaNro;
    private String[] viimeValinnat;

    public void setViimeValinnat(String[] viimeValinnat) {
        this.viimeValinnat = viimeValinnat;
    }
    

    public String[] annaViimeValinnat() {

        return viimeValinnat;

    }

    public void pelaaKierros() {
        // sopimus 1=kivi 2=paperi 3=sakset
        int val1 = Integer.parseInt(viimeValinnat[0]);
        int val2 = Integer.parseInt(viimeValinnat[1]);
        if(val1==val2){
            voittajaNro=0;
        } else
            voittajaNro=1;
        
    }

    public int annaVoittaja() {
        return voittajaNro;
    }
}
