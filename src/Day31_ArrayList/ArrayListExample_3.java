package Day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample_3 {
    public static void main(String[] args) {
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("Pazar");
        gunler.add("Salı");
        gunler.add("Cuma");
        gunler.add("Pazar");

        System.out.println("gunler.indexOf(\"Salı\") = " + gunler.indexOf("Salı"));
        System.out.println("gunler.lastIndexOf(\"Pazar\") = " + gunler.lastIndexOf("Pazar")); //Aynı veriden birden fazla varsa en son bulduğunun index numarasını döndürür

        System.out.println("gunler.indexOf(\"Pazar\") = " + gunler.indexOf("Pazar"));

    }
}
