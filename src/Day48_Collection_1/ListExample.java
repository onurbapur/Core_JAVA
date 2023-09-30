/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day48_Collection_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ankara");
        names.add("Kayseri");
        names.add("Konya");
        names.add("İzmir");

        for (String name: names){
            System.out.println(name);
        }
        System.out.println("------------------------");

        List<String> iller = new LinkedList<>(); //List interface tipinde oluşturulduğundan List interfaceni implmenet eden diğer yapılara geçiş esnekliği vardır.
       // List<String> iller = new ArrayList<>(); // List interface içerisinde ortak olan metodlarda bir değişikliğe gitmeden Collection tipini rahatlıkla değiştirebiliriz

        iller.add("London");
        iller.add("Hamburg");
        iller.add("New york");

        iller.add(1,"Paris");
        for (String il: iller){
            System.out.println(il);
        }

        System.out.println("--------------------");
        LinkedList<String > lnkList = new LinkedList<>(); //LinkList tipinde oluşturulduğundan LinkListe özel metodları kullanabiliriz.

        lnkList.add("Ahmet");
        lnkList.add("Ali");
        lnkList.add("Mehmet");
        System.out.println("Link list");
        for (String eleman: lnkList){
            System.out.println("eleman = " + eleman);
        }

        lnkList.push("Veli");//Listenin en üstüne eleman ekler. LinkListe özel bir metod.
        //lnkList.pollLast();
        System.out.println("After push");
        for (String eleman: lnkList){
            System.out.println("eleman = " + eleman);
        }


        String[] illerArray = iller.toArray(new String[iller.size()]); //Converts ArrayList to Array
        String[] illerLnkArray = lnkList.toArray(new String[lnkList.size()]); //Converts LinkedList to Array

        Collections.sort(lnkList); //Collection frameworkünün sort metodu. Parametre olarak gönderilen bir collectionu sıralar.
        System.out.println("After sort");
        for (String eleman: lnkList){
            System.out.println("eleman = " + eleman);
        }

        Collections.shuffle(lnkList); //Collection frameworkünün shuffle metodu. Parametre olarak gönderilen bir collectionın elemanlarının sırasını rastgele karıştırır
        System.out.println("--------------------");
        System.out.println("After shuffle");
        for (String eleman: lnkList){
            System.out.println("eleman = " + eleman);
        }
    }
}
