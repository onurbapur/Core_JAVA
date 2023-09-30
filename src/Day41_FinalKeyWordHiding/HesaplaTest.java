/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class HesaplaTest {
    public static void main(String[] args) {
        HesaplaSubClass hesap = new HesaplaSubClass();

        double result =  hesap.kdvHesapla(100);
        System.out.println("Result = " + result);

        double result1 =  hesap.kdvHesapla(100.0);
        System.out.println("Result1 = " + result1);

    }
}
