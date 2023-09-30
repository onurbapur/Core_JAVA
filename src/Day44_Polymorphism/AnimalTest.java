/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
      Zoo zoo1 = new Zoo("Darıca yarı özel hayvanat bahçesi");

      Cat cat1 = new Cat();
      cat1.setName("Tekir");
      cat1.setAge(4);
      cat1.setColor("White");

      Cat cat2 = new Cat("Pamuk",3,"Gray");
      Dog dog1 = new Dog("Karabaş",12,"Black");
      Dog dog2 = new Dog("Aslan",3,"Brown");
      Duck duck = new Duck("Donald",3,"White");
      Duck duck1 = new Duck("Varyemez",5,"Black");

      System.out.println(cat1.showInfo());
      cat1.sound();
      System.out.println("--------------------");

      System.out.println(dog1.showInfo());
      dog1.sound();
      System.out.println("--------------------");

      System.out.println(duck.showInfo());
      duck.sound();
      System.out.println("--------------------");

      zoo1.addCat(cat1);
      zoo1.addCat(cat2);

      zoo1.addDog(dog1);
      zoo1.addDog(dog2);

      zoo1.addDuck(duck);
      zoo1.addDuck(duck1);

      System.out.println();
      System.out.println(zoo1.getName() + " bulunan kedilerin listesi aşağıdadır.");
      for (Cat cat: zoo1.getCats()){
          System.out.println(cat.showInfo());
          cat.sound();
          System.out.println("--------------------");
      }
      System.out.println();

      System.out.println(zoo1.getName() + " bulunan köpekler listesi aşağıdadır.");
      for (Dog dog: zoo1.getDogs()){
          System.out.println(dog.showInfo());
          dog.sound();
          System.out.println("--------------------");
      }
      System.out.println();

    }
}
