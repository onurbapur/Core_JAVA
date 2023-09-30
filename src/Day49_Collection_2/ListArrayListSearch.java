/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.ArrayList;

public class ListArrayListSearch {
    public static void main(String[] args) {
        System.out.println("Searching an element in to given list.");
        // List<String> colors = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        System.out.println(colors.contains("White"));// it returns true or false

        if(colors.contains("White")){
            System.out.println("Found the element in the list.");
            System.out.println("Index of element: " + colors.indexOf("White"));
            System.out.println(colors.get(colors.indexOf("White")));
        }else System.out.println("Element not found in the list!");
    }
}
