/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListClone {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList <> ();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("Original linked  list: " + linkedList);

        //Cloning a LinkedList
        LinkedList<String > newc1 = new LinkedList <> ();
        newc1 = (LinkedList)linkedList.clone();
        System.out.println("Cloned linked list: " + newc1);
    }
}
