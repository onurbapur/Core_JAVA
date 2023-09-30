/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection_3.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        System.out.println("Queue-Kuyruk and works FIFO-Fist In First Out.");

        Queue<String> sira = new LinkedList<>();
        ArrayList<String> islemYapilanlar = new ArrayList<>();

        sira.offer("Ahmet"); // Kuyruk doluysa bile hata vermez.
        sira.add("Mehmet"); //Eğer kuyruk doluysa hata verir.
        sira.offer("Hasan");
        sira.offer("Veli");
        sira.offer("Ziya");
        sira.offer("Ali");
        sira.offer("Adnan");
        sira.offer("Hayati");
        sira.offer("Feyza");

        System.out.println("İlk sıradakinin kim olduğu bilgisini veriri : " + sira.peek());
        String siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        siradaki = sira.poll();
        islemYapilanlar.add(siradaki);

        //.element() Kuyrukta olmayan bir eleman istenirse hata fırlatır.
       // System.out.println(sira.element()); //like peek() method. it gives the first element info. Unlike peek() if the queue is empty it throws an exception NoSuchElementException


        sira.remove("Adnan");//Sıranın başındaki elemanı işlem yapmadan sıradan çıkarır.
        System.out.println(sira.poll());//İşlem yapmak üzere sıradaki ilk elemanı verir ve listeden çıkartır.
        System.out.println(sira.peek());//Sıradaki elemanın bilgisini verir ama listeden çıkartmaz.


        System.out.println("Sıra bekleyenlerin listesi");
        System.out.println("---------------------------");
        sira.forEach((e)-> System.out.println(e));

        System.out.println("---------------------------");
        System.out.println("İşlem yapılanların listesi");
        islemYapilanlar.forEach((eleman)-> System.out.println(eleman));

    }
}
