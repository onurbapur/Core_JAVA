/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_AbstractClass;

public class HesapCikart extends HesapMakinesi {
    @Override
    public void hesapla(int a, int b) {
        sonuc = a-b;
        printSonuc();

    }

    @Override
    public void hesapla(double a, double b) {
        sonuc = a-b;
        printSonuc();
    }

    @Override
    public void printSonuc() {
        System.out.println("Çıkarma sonucu = " + sonuc);
    }
}
