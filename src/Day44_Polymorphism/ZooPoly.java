/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism;

import java.util.ArrayList;

public class ZooPoly {
    private String name;
    private final ArrayList<Animal> animals;

    public ZooPoly(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public ZooPoly(String name, ArrayList<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
}
