/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.SET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetArrayListUnique {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Ali");
        namesList.add("Yusuf");
        namesList.add("Adnan");
        namesList.add("Hasan");
        namesList.add("Mehmet");
        namesList.add("Mehmet");
        namesList.add("Mehmet");
        namesList.add("Mehmet");
        namesList.add("Ali");
        namesList.add("Ali");
        namesList.add("Ahmet");
        namesList.add("Ahmet");
        namesList.add("Ahmet");
        namesList.add("Mehmet");

        System.out.println("namesList = " + namesList);

        Set<String> uniqueList = new HashSet<>(namesList);
        System.out.println("uniqueList = " + uniqueList);
    }
}
