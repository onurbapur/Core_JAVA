/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public class AnimalTest {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tekir",10,"White");
        Fish fish = new Fish("Nemo",3,"Silver");
        Bird bird = new Bird("Cici kuş",5,"Yellow");
        Frog frog = new Frog("Kermit",12,"Greenish");
        Anfibi anfibi = new Anfibi("Anfibi",67,"Black");

        System.out.println(fish.printInfo());
        fish.dive();
        fish.eat();
        fish.swim();
        fish.sleep();
        System.out.println("----------------------------");
        System.out.println(cat1.printInfo());
        cat1.eat();
        cat1.sleep();
        cat1.run();
        cat1.fourLegsRun();

        System.out.println("----------------------");
        System.out.println(bird.printInfo());
        bird.eat();
        bird.sleep();
        bird.fly();
        bird.run();
        bird.fourLegsRun();

        System.out.println("--------------------");
        System.out.println(frog.printInfo());
        frog.run();
        frog.eat();
        frog.fourLegsRun();

        System.out.println("--------------------");
        System.out.println(anfibi.printInfo());
        anfibi.eat();
        anfibi.sleep();
        anfibi.swim();
        anfibi.run();

        System.out.println("IRunnable.speed = " + IRunnable.speed);
        IRunnable.staticBirMetod();
    }

}
