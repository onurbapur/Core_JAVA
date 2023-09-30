/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.MAP;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("Map--- Key Value pair.");
        Map<String,Integer> citiesMap = new HashMap<String,Integer>();

        //Key field must be unique.
        //Value field may be duplicate
        citiesMap.put("Ankara",6);
        citiesMap.put("İstanbul",34);
        citiesMap.put("İzmir",35);
        citiesMap.put("Bilecik",11);//-Entry (key,value)

        System.out.println("hashMap = " + citiesMap);
        //Traversing a map with for each
        for (Map.Entry<String,Integer> cityEntry: citiesMap.entrySet()){
           // System.out.println("cityEntry = " + cityEntry); //Prints key and value set
          //  System.out.println("cityEntry.getKey() = " + cityEntry.getKey()); //Prints key
          //  System.out.println("cityEntry.getValue() = " + cityEntry.getValue());//Prints value
        }
        System.out.println("citiesMap.get(\"Ankara\") = " + citiesMap.get("Ankara"));

        System.out.println("citiesMap.get(\"Bilecik\") = " + citiesMap.get("Bilecik"));

    }
}
