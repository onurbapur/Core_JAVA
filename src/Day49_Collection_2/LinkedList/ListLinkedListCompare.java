/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListCompare {
    public static void main(String[] args) {
        LinkedList<String> linkedList1= new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");

        LinkedList<String> linkedList2= new LinkedList<>();
        linkedList2.add("Red");
        linkedList2.add("Green");
        linkedList2.add("Black");
        linkedList2.add("Orange");

        //comparison output in linked list
        LinkedList<String> linkedListResult = new LinkedList<>();
        for (String e : linkedList1)
            //if() version
           /* if (linkedList2.contains(e)){
                linkedListResult.add("Yes");
            } else linkedListResult.add("No");*/

            //Ternary version
            linkedListResult.add(linkedList2.contains(e) ? "Yes" : "No");
        System.out.println(linkedListResult);
    }
}
