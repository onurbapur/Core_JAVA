/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_AbstractClass;

public abstract class HesapMakinesi {
    protected double sonuc;
    public abstract void hesapla(int a, int b);
    public abstract void hesapla(double a, double b);
    public abstract void printSonuc();

    public void myinfo(){
        System.out.println("Ben bir abstract sınıfım");
    }
}
