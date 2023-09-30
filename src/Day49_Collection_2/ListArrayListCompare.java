/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.ArrayList;

public class ListArrayListCompare {
    public static void main(String[] args) {
        System.out.println("Comparing two given list.");
        // List<String> colors1 = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println("\n List-1 "+ colors);

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Brown");
        colors2.add("White");
        colors2.add("Grey");
        System.out.println("\n List-2 " + colors2);

        ArrayList<String > resultList = new ArrayList<>();

        for(String eleman:colors){
            resultList.add(colors2.contains(eleman) ? "Yes": "No");
        }
        System.out.println(resultList);
    }
}
