/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.SET;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> setList = new HashSet<>();
        setList.add("Ahmet");
        setList.add("Mehmet");
        setList.add("Ahmet");
        setList.add("Veli");
        setList.add("Hatice");
        setList.add("Mehmet");

        System.out.println("setList = " + setList);

    }
}
