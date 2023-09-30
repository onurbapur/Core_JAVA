/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListDisplayIndexElement {
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
        for(int index=0; index < linkedList.size(); index++)
        {
            System.out.println("Element at index " + index + ": " + linkedList.get(index));
        }
    }
}
