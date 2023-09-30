/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1213);
        sayilar.add(8768768);

        int toplam=0;
        for(Integer number: sayilar){
            System.out.println("number = " + number);
            toplam += number;
        }
        System.out.println("---------------------------");
        for(Object number: sayilar){
            System.out.println("number = " + number);
            toplam += (Integer) number;
        }
        System.out.println("toplam = " + toplam);

        System.out.println("******************");

        ArrayList havuz = new ArrayList<>(); //Arraylistler sadece referans tipler saklayabilir.

        havuz.add(1233); //primitive veri olsa bile otomatik olarak Autoboxing özelliği nedeniyle ilgili Wrapper class tipine dönüştürülür.
        havuz.add("Ankara");//" " içindeki ifade zaten String class ından olduğundan bir dönüştürmeye gerek yok.
        havuz.add(1213.434);//primitive veri olsa bile otomati olarak Autoboxing özelliği nedeniyle ilgili Wrapper class tipine dönüştürülür.


        //Java da bütün referans tipler Object class ından miras alırlar. O yüzden Object Class ı hepsinin Parent ı yani atasıdır.
        //Dolayısıyla diğerlerinin referansını tutar.
        for (Object obj: havuz){
            System.out.println("obj = " + obj);
        }

        double sonuc = 0;
        for (Object obj: havuz){
            System.out.println("obj = " + obj);
            if(obj instanceof Integer){//Subclass tipini bulup ilgili tipine cast ediyoruz.
                sonuc +=(Integer) obj;
            }
            if(obj instanceof Double){
                sonuc +=(Double) obj;
            }
            if (obj instanceof String){
                System.out.println("((String) obj).toUpperCase() = " + ((String) obj).toUpperCase());
            }
        }
        System.out.println("sonuc = " + sonuc);

    }
}
