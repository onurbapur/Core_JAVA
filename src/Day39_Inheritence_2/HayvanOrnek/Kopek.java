/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2.HayvanOrnek;

public class Kopek extends Hayvan{

    @Override
    public void move() {
        super.move();
        System.out.println("Gerekirse de koşabilirim.");
    }
    public void havla(){
        System.out.println("Hav...hav!");
    }


    @Override
    public Hayvan mySelf(Hayvan hayvan) {
        hayvan.name = "Köpek klası";
        return new Kurbaga(); //Kurbaga is an Animal. Hayvan sınıfından miras aldığından ortak(covariant) bir tip olarak
    }
}
