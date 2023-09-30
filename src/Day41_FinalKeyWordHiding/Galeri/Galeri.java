/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding.Galeri;

import java.util.ArrayList;

public class Galeri {
    public ArrayList<Sedan>  sedanAraclar = new ArrayList<>(); // can hold type Sedan
    public ArrayList<Kamyonet>  kamyonetAraclar = new ArrayList<>(); // can hold type Kamyonet
    public  ArrayList<Vehicle> galeriAraclar = new ArrayList<>(); // can hold type Vehicle and its sub classes

    public ArrayList tipsizArray = new ArrayList<>();// can hold any objects


    public void  aracEkleSedan(Sedan arac){
        sedanAraclar.add(arac);
    }
    public void  aracEkleKamyonet(Kamyonet arac){
        kamyonetAraclar.add(arac);
    }

    public void aracEkle(Vehicle vehicle){
        galeriAraclar.add(vehicle);
    }
    public  void aracTipsizEkle(Object obj){
        tipsizArray.add(obj);
    }
}
