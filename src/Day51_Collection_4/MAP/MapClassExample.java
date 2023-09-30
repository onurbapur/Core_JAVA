/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.MAP;

import java.util.HashMap;
import java.util.Map;

public class MapClassExample {
    public static void main(String[] args) {
        Map<Integer,PersonKisi> kisiListeMap = new HashMap<>();

        PersonKisi personKisi = new PersonKisi(1234,"Ahmet Falanca","İstanbul","Hasan");

        kisiListeMap.put(personKisi.getTCNO(),personKisi);

       /* kisiListeMap.put(3466,new PersonKisi(3466,"Hasan Smith","Kayseri","Ahmet"));
        kisiListeMap.put(9865,new PersonKisi(9865,"John Taylor","New York","Smith"));*/

        personKisi = new PersonKisi(3466,"Hasan Smith","Kayseri","Ahmet");
        kisiListeMap.put(personKisi.getTCNO(),personKisi);

        personKisi = new PersonKisi(9865,"John Taylor","New York","Smith");
        kisiListeMap.put(personKisi.getTCNO(),personKisi);

        System.out.println("kisiListeMap.get(1234) = " + kisiListeMap.get(1234));

        System.out.println("kisiListeMap.size() = " + kisiListeMap.size());

        for (Map.Entry<Integer,PersonKisi> entryPerson : kisiListeMap.entrySet()){
            System.out.print(entryPerson.getKey());
            System.out.print("- "+entryPerson.getValue().getName());
            System.out.println("- "+entryPerson.getValue().getFatherName());
        }
    }
}
