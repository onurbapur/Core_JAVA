/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListGetFirstLast {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Pink");
        linkedList.add("orange");

        // print original list
        System.out.println("Original linked list:" + linkedList);

        // Find first element of the List
        Object first_element = linkedList.getFirst();
        System.out.println("First Element is: "+first_element);

        // Find last element of the List
        Object last_element = linkedList.getLast();
        System.out.println("Last Element is: "+last_element);
    }
}
