/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1;

import java.util.ArrayList;

public class Firin {
    private int derece;
    private int sure;
    private ArrayList<SadeKek> tepsi = new ArrayList<>();

    public Firin(int derece, int sure) {
        this.derece = derece;
        this.sure = sure;
        this.tepsi = tepsi;
    }

    public Firin() {

    }

    public int getDerece() {
        return derece;
    }

    public void setDerece(int derece) {
        this.derece = derece;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public ArrayList<SadeKek> getTepsi() {
        return tepsi;
    }

    public void setTepsi(ArrayList<SadeKek> tepsi) {
        this.tepsi = tepsi;
    }

    public void tepsiyeEkle(SadeKek kek){
        tepsi.add(kek);
    }

    public void pisir(){
        System.out.println("Derece : " + getDerece());
        System.out.println("Süre   : " + getSure());

        int i = 0;
        for (SadeKek kek: tepsi){
            /*if(i == 0 ) System.out.println("Üst tepside " + tepsi.get(i).getName()+  " pişiyor");
            if(i == 1 ) System.out.println("Alt tepside " + tepsi.get(i).getName()+  " pişiyor");*/

            if(i == 0 ) System.out.println("Üst tepside " + kek.getName() +  " pişiyor");
            if(i == 1 ) System.out.println("Alt tepside " + kek.getName() +  " pişiyor");
            i++;
        }
    }
    @Override
    public String toString() {
        return "Firin{" +
                "derece=" + derece +
                ", sure=" + sure +
                ", tepsi=" + tepsi +
                '}';
    }
}
