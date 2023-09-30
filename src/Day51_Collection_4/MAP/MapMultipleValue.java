/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMultipleValue {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> aracMarkaListe = new HashMap<>();

        aracMarkaListe.put("Honda",new ArrayList<String >());
        aracMarkaListe.get("Honda").add("Accord");
        aracMarkaListe.get("Honda").add("Civic");
        aracMarkaListe.get("Honda").add("Jazz");

        aracMarkaListe.put("Toyota",new ArrayList<String >());
        aracMarkaListe.get("Toyota").add("Corolla");
        aracMarkaListe.get("Toyota").add("Avensis");
        aracMarkaListe.get("Toyota").add("Yaris");

        aracMarkaListe.put("Ford",new ArrayList<String >());
        aracMarkaListe.get("Ford").add("Mustang");
        aracMarkaListe.get("Ford").add("Mondeo");

        System.out.println(aracMarkaListe);

        aracMarkaListe.get("Toyota").forEach(eleman -> System.out.println(eleman));
        System.out.println("-----------------------------------");
        System.out.println("For each traversing");

        //Printing all brands and their sub models
        for(Map.Entry<String,ArrayList<String >> elemanKey: aracMarkaListe.entrySet()){//Prints brand-loop
            System.out.println("Araç markası/Modelleri");
            System.out.println("----------------------");
            System.out.println(elemanKey.getKey().toUpperCase());
            for (String eleman : aracMarkaListe.get(elemanKey.getKey())){//Prints sub models
                System.out.println("\t-" + eleman);
            }
        }

        System.out.println();
        System.out.println("Printing a specific brand its sub models");
        for (String eleman : aracMarkaListe.get("Toyota")){
            System.out.println(eleman);
        }
    }
}
