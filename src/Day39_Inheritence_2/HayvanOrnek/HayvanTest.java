/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2.HayvanOrnek;

public class HayvanTest {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek();
        kopek1.name = "Cony";
        kopek1.renk = "Beyaz";
        kopek1.yas = 3;
     //   kopek1.yasamYeri = "Deniz"; //Hata verir-Final tanımlandığından yeni veri atanamaz

        Kurbaga kurbaga = new Kurbaga();
        kurbaga.name = "Kermit";
        kurbaga.renk = "Kahverengi";
        kurbaga.yas = 12;

        kopek1.move();
        kopek1.eat();
        kopek1.havla();
        System.out.println("--------------------");
        kurbaga.move();
        kurbaga.eat();
        kurbaga.virak();

        System.out.println(Sabitler.YASAM_YERI);
        double hesapKdav = 100 * Sabitler.KDV_ORANI;
        int haftaninIlkGunu = Sabitler.PAZARTESI;
    }
}
