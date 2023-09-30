/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism;

import java.util.Collections;

public class AnimalTestPoly {
    public static void main(String[] args) {
        ZooPoly zooPoly = new ZooPoly("Darıca yarı özel hayvanat bahçesi");

        Animal animal;//Polymorphic variable can hold reference of sub-classes objects

        animal = new Cat("Pamuk",3,"Gray");
        zooPoly.addAnimal(animal);
        animal = new Cat("Mahur",4,"Foggy");
        zooPoly.addAnimal(animal);

        animal = new Dog("Karabaş",12,"Black");
        zooPoly.addAnimal(animal);
        animal = new Dog("Aslan",3,"Brown");
        zooPoly.addAnimal(animal);

        animal = new Duck("Donald",3,"White");
        zooPoly.addAnimal(animal);
        animal = new Duck("Varyemez",5,"Black");
        zooPoly.addAnimal(animal);

        animal = new Bird("Cici kuş", 2,"Yellow");
        zooPoly.addAnimal(animal);

        animal = new Lion("King", 15, "Golden");
        zooPoly.addAnimal(animal);

        animal = new Turtle("Ninja",45,"Brown");
        zooPoly.addAnimal(animal);
        System.out.println(zooPoly.getName() + " hayvanların listesi.");

        //Collections.shuffle metodunun polymorphism ile bir alakası yok.
        Collections.shuffle(zooPoly.getAnimals());//Parametre olarak gönderilen dizi elamanlarını rastgele karıştırır.

        for (Animal animal1: zooPoly.getAnimals()){
            System.out.println("Hayvan türü   : " + animal1.getClass().getSimpleName());
            System.out.println(animal1.showInfo());
            animal1.sound(); //Method overriding-runtime polymorphism
            System.out.println("--------------------------------");
        }
    }
}
