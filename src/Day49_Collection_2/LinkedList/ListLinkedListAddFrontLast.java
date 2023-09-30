/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListAddFrontLast {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        System.out.println("Original linked list:" + linkedList);

        // Add an element to front of LinkedList- if the element added successfully returns true
        linkedList.offerFirst("Pink");
        System.out.println("Final linked list:" + linkedList);

        // Add an element at the end of a linked list- if the element added successfully returns true
        linkedList.offerLast("Blue");
        System.out.println("Final linked list:" + linkedList);
    }
}
