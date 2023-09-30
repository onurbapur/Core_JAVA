/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.ArrayList;

public class ListArrayListUpdate {
    public static void main(String[] args) {
        System.out.println("Updating and removing an element in to given index.");
        // List<String> colors = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        colors.add(2,"Yellow");
        System.out.println(colors);

       /* colors.remove(3);//Removing an object from a list by accessing its index
        System.out.println(colors);*/

        colors.remove("Orange");//Removing an object from a list by accessing Object itself
        System.out.println(colors);

    }
}
