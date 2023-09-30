package Day21_MemoryManGarbageCol;

public class GarbageCollectionTest {

    public static void main(String[] args)  {
        GCTest test1 = new GCTest();
        GCTest test2 = new GCTest();
        GCTest test3 = new GCTest();
        test3 = new GCTest();
        test3 = new GCTest();
        test3 = new GCTest();

        test1.age = 35;
        test1.name = "Ahmet Falanca";

        test2.age = 55;
        test2.name = "Hasan Falana";

        test3.age = 65;
        test3.name = "Joerge Smith";

        System.out.println(test1.name);
        System.out.println(test2.name);
        System.out.println(test3.name);

        //By assigning 'null' to reference variables, they lost their reference to objects in heap
       /* test1 = null;
        test2 = null;
        test3 = null;*/

        //Creating mass amount of object within the loop.
        //When the loop finished all object created within the loop
        // are going to be eligible for garbage collection.
        for (int i = 0; i < 5; i++) {
            GCTest obj; //obj is a local variable. Outside the loop it is no longer happen to be.
            obj = new GCTest("Ahmet Falanca");
        }

        System.gc(); //Calling garbage collector, but it is not guaranty to be worked

    }

}