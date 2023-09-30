/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListAddTwoLinkedList {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> linkedList1 = new LinkedList <> ();

        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        System.out.println("List of first linked list: " + linkedList1);

        LinkedList<String> linkedList2 = new LinkedList <> ();
        linkedList2.add("Red");
        linkedList2.add("Green");
        linkedList2.add("Black");
        linkedList2.add("Pink");
        System.out.println("List of second linked list: " + linkedList2);

        // Let join above two list
        LinkedList <String> a = new LinkedList <> ();
        a.addAll(linkedList1);
        a.addAll(linkedList2);
        System.out.println("New linked list: " + a);
    }
}
