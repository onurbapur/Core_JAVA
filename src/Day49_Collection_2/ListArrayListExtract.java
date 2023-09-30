/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.ArrayList;
import java.util.List;

public class ListArrayListExtract {
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

        System.out.println("Printing of sublist after extracted from original list.");
        List<String> exctractedList = colors.subList(0,3);//fromIndex Inclusive but toIndex Exclusive
        System.out.println(exctractedList);
    }
}
