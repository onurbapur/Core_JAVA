package Day31_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilyaProgram {
    public static MobilyaClass mobilyaBul(ArrayList<MobilyaClass> magaza, String name){
       for (MobilyaClass mobilya : magaza){
           if(mobilya.name.equals(name)){
               return mobilya;
           }
       }
        return null;
    }

    public static void main(String[] args) {
        MobilyaClass mobilyaObj1= new MobilyaClass();
        mobilyaObj1.name = "Masa";
        mobilyaObj1.renk = "Kahve";
        mobilyaObj1.materyal = "Ahşap";
        mobilyaObj1.fiyat = 5000;
        System.out.println("mobilyaObj1.name = " + mobilyaObj1.name);
        System.out.println("mobilyaObj1.renk = " + mobilyaObj1.renk);
        System.out.println("mobilyaObj1.materyal = " + mobilyaObj1.materyal);
        System.out.println("mobilyaObj1.fiyat = " + mobilyaObj1.fiyat);

        System.out.println("-------------------------------------");

        MobilyaClass mobilyaObj2 = new MobilyaClass("Berjer","Bej","Ahşap",1000);
        System.out.println("mobilyaObj2.name = " + mobilyaObj2.name);
        System.out.println("mobilyaObj2.renk = " + mobilyaObj2.renk);
        System.out.println("mobilyaObj2.materyal = " + mobilyaObj2.materyal);
        System.out.println("mobilyaObj2.fiyat = " + mobilyaObj2.fiyat);

        System.out.println(mobilyaObj1.showInfo());
        System.out.println("---------------------------");
        System.out.println(mobilyaObj2.showInfo());

        ArrayList<MobilyaClass> magaza = new ArrayList<>();
        magaza.add(mobilyaObj1);
        magaza.add(mobilyaObj2);

      //  System.out.println("magaza = " + magaza);
        System.out.println();
        System.out.println("For each");
        for (MobilyaClass mobilya : magaza ){
            System.out.println("Magazadaki mobilyalar : " + mobilya); //mobilya.toString()
        }

        System.out.println();
        System.out.println("For each");
        for (MobilyaClass mobilya : magaza ){
            System.out.println("mobilya.name = " + mobilya.name);
            System.out.println("mobilya.renk = " + mobilya.renk);
            System.out.println("mobilya.materyal = " + mobilya.materyal);
            System.out.println("mobilya.fiyat = " + mobilya.fiyat);
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mağazada arayacağınız ürünün adını giriniz : ");
        String urunAdi = scanner.nextLine();

        System.out.println("mobiltaBul() metodu");
        if(mobilyaBul(magaza,urunAdi) != null){
            System.out.println("mobilyaBul(magaza,\"Masa\").name = " + mobilyaBul(magaza, urunAdi).name);
            System.out.println("mobilyaBul(magaza,\"Masa\").materyal = " + mobilyaBul(magaza, urunAdi).materyal);
        }else System.out.println("Kayıt bulunamadı!");

    }
}
