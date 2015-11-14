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
public class Kortti {

    public Kortti(int maa, int arvo) {
        this.maa = maa;
        this.arvo = arvo;
    }

    public int maa;
    public int arvo;

    public int getMaa() {
        return maa;
    }

    public void setMaa(int maa) {
        this.maa = maa;
    }

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    @Override
    public String toString() {
        return "Kortti{" + "maa=" + maa + ", arvo=" + arvo + '}';
    }

}
