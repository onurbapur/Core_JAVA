/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.ArrayList;

public class ListArrayListAddTwo {
    public static void main(String[] args) {
        System.out.println("Joining Two List list.");
        // List<String> colors1 = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println("\n List-1 "+ colors);

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Amber");
        colors2.add("Turkuaz");
        colors2.add("Brown");
        colors2.add("Blue");
        colors2.add("Grey");
        System.out.println("\n List-2 " + colors2);

        ArrayList<String > joinedList = new ArrayList<>();

        //Classic known way of traversing an arrayList and adding the element to joined arrayList
       /* for (String eleman: colors){
            joinedList.add(eleman);
        }
        for (String eleman: colors2){
            joinedList.add(eleman);
        }*/

        //Using .addAll() method of the ArrayList Class Data Structure
        joinedList.addAll(colors);
        joinedList.addAll(colors2);
        System.out.println("\n Joined List " + joinedList);
    }
}
