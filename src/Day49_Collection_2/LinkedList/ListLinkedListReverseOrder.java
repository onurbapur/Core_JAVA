/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class ListLinkedListReverseOrder {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Pink");
        linkedList.add("Orange");

        // print original list
        System.out.println("Original linked list:" + linkedList);

        Iterator<String> it = linkedList.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
