/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.STACK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StackReversingArray {
    public static void main(String[] args) {
        ArrayList<String> arrColors = new ArrayList<>();
        arrColors.add("Red");
        arrColors.add("Brown");
        arrColors.add("Yellow");
        arrColors.add("Green");
        arrColors.add("Blue");

        System.out.println("Initial ArrayList : " + arrColors);

        Stack<String> stackColors = new Stack<>();

        for (String eleman : arrColors){
            stackColors.push(eleman);
        }

        ArrayList<String > reverseArrayList = new ArrayList<>();
        int size = stackColors.size();
        for (int i = 0; i < size; i++) {
            reverseArrayList.add(stackColors.pop());
        }
        System.out.println("Reverse ArrayList : " + reverseArrayList);

        Collections.reverse(arrColors);
        System.out.println("arrColors = " + arrColors);
    }
}
