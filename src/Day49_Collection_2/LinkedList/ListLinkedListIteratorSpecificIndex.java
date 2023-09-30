/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class ListLinkedListIteratorSpecificIndex {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
// set Iterator at specified index
        Iterator itr = linkedList.listIterator(1);

        // print list from second position
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
