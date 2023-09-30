/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.Personel;

import java.util.ArrayList;

public class FabrikaTest {
    String name;
        ArrayList<Person> personelListesi = new ArrayList<>();

    public static void main(String[] args) {
        FabrikaTest fabrika = new FabrikaTest();
        fabrika.name = "Istanbul SDET firması.";

        Person person = new Engineer("Mühendis Ali"); //Upcasting--variable person is declared from base class type therefore it is polymorphic
        ((Engineer)person).universite = "Istanbul Teknik Ünv."; //Downcasting
        fabrika.personelListesi.add(person);

        person = new Teacher("Öğretmen Mehmet");
        fabrika.personelListesi.add(person);

        for (Person person1: fabrika.personelListesi){
            System.out.println(person1.showfInfo());
            person1.work(); //Parent class
            if(person1 instanceof Teacher){
                ((Teacher)person1).doExam(); //Downcasting
            }
            if(person1 instanceof Engineer){
                ((Engineer)person1).doDesign(); //Downcasting
                System.out.println("universite = " + ((Engineer) person1).universite);
            }
        }

    }
}
