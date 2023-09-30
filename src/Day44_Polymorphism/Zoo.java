/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism;

import java.util.ArrayList;

public class Zoo {
   private String name;
   private final ArrayList<Cat> cats;
   private final ArrayList<Dog> dogs;
   private final ArrayList<Duck> ducks;

   public Zoo(String name){
       this.name = name;
       this.cats = new ArrayList<>();
       this.dogs = new ArrayList<>();
       this.ducks = new ArrayList<>();
   }
   public Zoo(String name, ArrayList<Cat> cats, ArrayList<Dog> dogs, ArrayList<Duck> ducks) {
        this.name = name;
        this.cats = cats;
        this.dogs = dogs;
        this.ducks = ducks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public ArrayList<Duck> getDucks() {
        return ducks;
    }

    public void addCat(Cat cat){
       System.out.println(cat.getName() + " isimli kedi hayvanat bahçesine eklendi.");
       cats.add(cat);
    }
    public void addDog(Dog dog){
        System.out.println(dog.getName() + " isimli köpek hayvanat bahçesine eklendi.");
        dogs.add(dog);
    }
    public void addDuck(Duck duck){
        System.out.println(duck.getName() + " isimli ördek hayvanat bahçesine eklendi.");
       ducks.add(duck);
    }

}
