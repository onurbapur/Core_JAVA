/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_AbstractClass;

public class HesapMakinesiTest {

    public static void main(String[] args) {
        HesapToplama toplama = new HesapToplama();
        HesapCikart cikart = new HesapCikart();
        HesapCarp carp = new HesapCarp();


        toplama.hesapla(3,6);
        cikart.hesapla(45,23);
        carp.hesapla(3,6);

        HesapMakinesi add = new HesapToplama();
        HesapMakinesi substract = new HesapCikart();
        HesapMakinesi multiply = new HesapToplama();

        add.hesapla(23,2);
        add.printSonuc();

        substract.hesapla(45,12);
        substract.printSonuc();

        multiply.hesapla(5,6);
        multiply.printSonuc();

    }


}
