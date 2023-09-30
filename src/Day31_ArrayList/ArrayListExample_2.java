package Day31_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample_2 {
    public static void main(String[] args) {
        //Creation of Array List
        ArrayList<String> arabalar = new ArrayList<>();

        arabalar.add("Honda");
        arabalar.add("Toyota");

        System.out.println("arabalar = " + arabalar);
        System.out.println("arabalar.size() = " + arabalar.size());

        ArrayList<String> sehirler = new ArrayList<>(Arrays.asList("Ankara","Bursa"));
        System.out.println("sehirler = " + sehirler);


        ArrayList<String> sehirler1 = new ArrayList<>(sehirler);
        System.out.println("sehirler1 = " + sehirler1);

        sehirler.add("Diyarbakır");
        System.out.println("sehirler = " + sehirler);

        sehirler1.add("Elazığ");
        System.out.println("sehirler1 = " + sehirler1);

        sehirler1.remove(1); //remove an element by index
        System.out.println("sehirler1 = " + sehirler1);

        sehirler1.remove("Elazığ"); //remove an element bye object
        System.out.println("sehirler1 = " + sehirler1);

        sehirler1.clear(); //remove all elements of ArrayList object
        System.out.println("sehirler1 = " + sehirler1);

        System.out.println("sehirler = " + sehirler);
        sehirler.set(1,"Kayseri"); //Update the element of given index
        System.out.println("sehirler = " + sehirler);

        System.out.println("sehirler.contains(\"Ankara\") = " + sehirler.contains("Ankara")); //search for an element
        System.out.println("sehirler.contains(\"Balıkesir\") = " + sehirler.contains("Balıkesir"));

        ArrayList<String > cities = new ArrayList<>(Arrays.asList("Ankara","Kayseri"));

        sehirler.removeAll(cities); //Remove the collection from Array List
        System.out.println("sehirler = " + sehirler);

        System.out.println("sehirler.removeAll(Arrays.asList(\"Ankara\")) = " + sehirler.removeAll(Arrays.asList("Ankara")));
        System.out.println("sehirler = " + sehirler);

        sehirler1.add("Kayseri");
        sehirler1.add("Adana");
        sehirler1.add("Çorum");
        sehirler1.add("Yozgat");

        sehirler.add("Çankırı");
        sehirler.add("Uşak");
        sehirler.add("Yozgat");
        sehirler.add("Adana");

        System.out.println("sehirler1 = " + sehirler1);
        System.out.println("sehirler = " + sehirler);

        sehirler1.retainAll(sehirler);
        System.out.println("sehirler1- after retainAll() = " + sehirler1);

        sehirler1.addAll(sehirler);
        System.out.println("sehirler1 after addAll() = " + sehirler1);

    }
}
