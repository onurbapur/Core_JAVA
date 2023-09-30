/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayListAdd {
    public static void main(String[] args) {
        System.out.println("Inserting an element in to given index.");
       // List<String> colors = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);
        colors.add(0,"Pink");
        System.out.println("Printing list after adding 0 index an element of Pink.");
        System.out.println(colors);

        System.out.println("Traversing list by internal for...each loop");//Lambda expression
        colors.forEach((eleman)-> {
            System.out.println(eleman);
            System.out.println(eleman.toUpperCase());
        });

        System.out.println("Traversing list by for...each loop");
        for (String eleman: colors){
            System.out.println(eleman);
        }

        System.out.println("Traversing list by for... loop");
        for (int i = 0; i < colors.size() ; i++) {
            System.out.println(colors.get(i));
        }

        Iterator iterator = colors.iterator();
        System.out.println("Traversing list by Iterator interface.");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
