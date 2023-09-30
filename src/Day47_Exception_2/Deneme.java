/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2;

public class Deneme {
    public void bekleBiraz(int saniye) throws InterruptedException {

        // Thread enters into sleeping state
        System.out.println("Thread in çalışmasını durdurmak için " + saniye + " bekliyorum.");
        Thread.sleep(saniye * 1000);

        // Thread interrupting itself
        Thread.currentThread().interrupt();

        System.out.println("Thread in çalışmasını durdurdum...");
        // check if the Thread is interrupted
        if (Thread.interrupted()) {
            // Throwing InterruptedException
            throw new InterruptedException();
        }

        //saniye * milisaniye = saniye parametre olarak gönderdiğimiz
        // saniye kadar programın çalışmasını durdurur.
    }
    public int bolme(int sayiA, int sayiB) throws Exception{
        int result = 0;
        try {
            result =sayiA / sayiB ;
        }catch (ArithmeticException art){
            throw new ArithmeticException();
        }

        return result;
    }
}
