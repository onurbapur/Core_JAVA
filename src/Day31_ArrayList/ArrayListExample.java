package Day31_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("ArrayList in Java.");
        ArrayList<String> arabalar = new ArrayList<String>(20);
        System.out.println("arabalar.size() = " + arabalar.size());
        System.out.println("arabalar.isEmpty() = " + arabalar.isEmpty());

        arabalar.add("Mercedes");
        arabalar.add("BMW");
        arabalar.add("Şahin");

        arabalar.add(1,"Wolksvagen");
        System.out.println("arabalar = " + arabalar);

        System.out.println("arabalar.get(2) = " + arabalar.get(2));

        arabalar.set(2,"TOGG"); //update the vaue of element given index.
        System.out.println("arabalar = " + arabalar);

        arabalar.remove(1);
        System.out.println("arabalar = " + arabalar);
        arabalar.remove("Şahin");
        System.out.println("arabalar = " + arabalar);
        System.out.println("arabalar.get(1) = " + arabalar.get(1));

        arabalar.add("Austin");
        System.out.println("arabalar = " + arabalar);

        Collections.sort(arabalar);

        System.out.println("arabalar = " + arabalar);

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(-23);
        sayilar.add(25);
        sayilar.add(0);
        sayilar.add(-1);
        sayilar.add(50);

        int[] numbers = {3,4,12,4};
        String[] sehirlerArr = {"Ankara","İzmir","Kayseri"};

        ArrayList<String> sehirlerList = new ArrayList<>(Arrays.asList("Ankara","Istanbul","Adana"));

        System.out.println("sehirlerList = " + sehirlerList);

        System.out.println("sayilar = " + sayilar);
        Collections.sort(sayilar);
        System.out.println("sayilar(Sorted)= " + sayilar);
    }
}
