/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection_3.Queue;

import java.util.ArrayList;
import java.util.Queue;

public class Kasiyer implements Runnable {//Runnable interface multi-thread yapılar kurgulamak için implement edilmelidir.
    public Queue queue = null;//Müşteri listesinin bulunduğu queue için kullanılacak kasiyere ait queue
    private ArrayList islemler = new ArrayList<>();//Kasiyerin işlemleri için kullanılacak ArrayList
    public String name; //Kasiyerin adı

    public Kasiyer(Queue queue, String name){//Müşteriler queue su ve kasiyer adı parametreleri
        this.queue = queue;
        this.name = name;
    }
    public void islemYaz(){//Kasiyerin yaptığı işlemleri yazan metod
        System.out.println(islemler);
    }

    //Multi thread çalışacak kod run() metodu içerisindeki kod.
    @Override
    public void run() {
        try {
            while (queue.size() > 0){//Müşteri queue da müşteri olduğu sürece çalış
                int sure = 1000 + (int) (Math.random() * 5000);//Herbir kasiyerin müşteri işlemleri için harcadığı rastgele bir süre(1-10 saniye arası)
                String islemKisi ="";
               // String islemKisi = queue.peek().toString();//Queue nun sıra bekleyen ilk elemanının bilgisini verir.
                islemKisi= queue.poll().toString(); //Queue nun sıra bekleyen ilk elemanını işlem yapmak için bir kasiyer alır.


                //Simulasyon olarak kasiyerlerin o anda hangi müşteri ile ilgili işlem yaptığı yazdırılır.
                System.out.println(this.name + " Müşteri : " + islemKisi + " işlemi yapılıyor." + " -Süre : " + (sure/1000) + " saniye");
                Thread.sleep(sure); //Simülasyon için rastgele belirlenen sürede işlem yapan kasiyere ait Thread bekler.
                islemler.add(islemKisi); //Worker işlem yaptığı müşteriyi kendi işlemler ArrayList ine ekler.
            }
            //Worker queue de hiç müşteri kalmadığında yaptığı işlemleri yazar
            System.out.print(this.name + " - " ); //Kasiyerin adı
            islemYaz(); //Kasiyerin yaptığı işlemlerin listesi
        }
        catch (InterruptedException exception){{
            exception.printStackTrace();
        }
       }
    }
}
