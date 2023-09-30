/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection_2;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Aslan");
        vector.add("Kaplan");
        vector.add("Kedi");
        vector.add("Köpek");
        vector.add("Kuş");
        vector.add("Balık");
        vector.add("Sincap");
        vector.add("Akrep");
        vector.add("Kaplan");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");
        vector.add("Köpek");

        System.out.println("Vector: " + vector);
        for (String eleman:vector){
            System.out.println(eleman);
        }
        System.out.println("vector.size() = " + vector.size());
        System.out.println("vector.capacity() = " + vector.capacity());

        System.out.println("vector.get(2) = " + vector.get(2));
        System.out.println("vector.contains(\"Köpek\") = " + vector.contains("Köpek"));
        System.out.println("vector.indexOf(\"Kedi\") = " + vector.indexOf("Kedi"));
        System.out.println("vector.firstElement() = " + vector.firstElement());
        System.out.println("vector.lastElement() = " + vector.lastElement());

        System.out.println("vector = " + vector);
        vector.remove("Köpek");
        System.out.println("vector = " + vector);

        //Remove all occurrence of given object in the list.
        vector.removeIf(eleman-> eleman.equals("Köpek"));
        System.out.println("vector = " + vector);

        Iterator<String> itr = vector.iterator();
        //Remove all occurrence of given object in the list  by iterator
        while (itr.hasNext()){
            if(itr.next().equals("Kaplan")){
                itr.remove();
            }
        }
        System.out.println("vector = " + vector);

        System.out.println("vector.capacity() = " + vector.capacity());
        vector.trimToSize();
        System.out.println("vector.capacity() after vector.trimToSize() = " + vector.capacity());

    }
}
