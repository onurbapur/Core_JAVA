/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.ArrayList;
import java.util.List;

public class ListAddExample {
    public static void main(String[] args) {
        System.out.println("ArrayList add() method example.");
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("İstanbul");
        cities.add("London");
        cities.add("Paris");
        cities.add("Zurih");
        cities.add("London");

        System.out.println(cities);
        cities.add(0,"Ankara");
        System.out.println(cities);
    }

}
