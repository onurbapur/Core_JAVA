/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2;

public class DenemeTest {
    public static void main(String[] args) throws Exception {
        Deneme deneme = new Deneme();
        try {
            deneme.bekleBiraz(2);
            //Thread.currentThread().interrupt();

        }catch (InterruptedException hata){
            System.out.println("interrupted");
            hata.printStackTrace();
        }

        System.out.println("Bölme sonucu = " + deneme.bolme(120, 10));

    }
}
