/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.MAP;

import java.util.HashMap;
import java.util.Map;

public class MapExampleTCNO {
    public static void main(String[] args) {
        Map<Integer,String> listeTCNO = new HashMap<>();
        listeTCNO.put(12345,"Ahmet Falanca");
        listeTCNO.put(2346,"Ahmet Falanca");
        listeTCNO.put(98765,"Hasan Can");
        listeTCNO.put(56777,"Ziya Smith");

        System.out.println("listeTCNO.get(98765) = " + listeTCNO.get(98765));

    }
}
