/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListAddFirstLast {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        System.out.println("Original linked list:" + linkedList);
        // Add an element at the beginning
        linkedList.addFirst("White");

        // Add an element at the end of list
        linkedList.addLast("Pink");
        System.out.println("Final linked list:" + linkedList);
    }
}
