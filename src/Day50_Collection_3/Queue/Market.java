/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection_3.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Market {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new ArrayBlockingQueue(100); //Multi-thread ortamlarda tutarızlık yaşamamak için thread-safe bir queu kullanıyoruz

        //Multi-thread çalışacak kasiyer nesnelerini oluşturuyoruz.
        //Parametre olarak herbir kasiyer müşteri listesini(queue) alacak
        //Ayrıca herbir kasiyer için ayırt edici bir isim de belirleyeceğiz
        Kasiyer kasiyer1 = new Kasiyer(queue,"Worker-1");
        Kasiyer kasiyer2 = new Kasiyer(queue,"Worker-2");
        Kasiyer kasiyer3 = new Kasiyer(queue,"Worker-3");
        Kasiyer kasiyer4 = new Kasiyer(queue,"Worker-4");
        Kasiyer kasiyer5 = new Kasiyer(queue,"Worker-5");
        Kasiyer kasiyer6 = new Kasiyer(queue,"Worker-6");
        Kasiyer kasiyer7 = new Kasiyer(queue,"Worker-7");

        //Markette kasalar önünde işlem sırası bekleyen müşteriler
        queue.add("Ahmet");
        queue.add("Hasan");
        queue.add("Ali");
        queue.add("Adnan");
        queue.add("Hayati");
        queue.add("Mehmet");
        queue.add("Fatma");
        queue.add("Zeki");
        queue.add("Mustafa");

        //Herbir kasiyeri paralel işlem(multi-thread) yapmaları için çalıştırıyoruz.
        new Thread(kasiyer1).start();
        new Thread(kasiyer2).start();
        new Thread(kasiyer3).start();
        new Thread(kasiyer4).start();
        new Thread(kasiyer5).start();
        new Thread(kasiyer6).start();
        new Thread(kasiyer7).start();
    }
}
