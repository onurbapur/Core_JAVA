package Day26_Array;

public class AccessElementOfAnArray {
    public static void main(String[] args) {
        String[] ogrListesi = {"Ahmet","Mehmet","Merry"};
        int[] sayilar = {1,5,7,6,8};

        System.out.println("2.Öğrenci : " + ogrListesi[1]);
        System.out.println("3.Öğrenci : " + ogrListesi[2]);
        System.out.println("1.Öğrenci(UpperCase) : " + ogrListesi[0].toUpperCase());
        System.out.println();
        System.out.println("3. Sayı : " + sayilar[2]);
        System.out.println("5. Sayı : " + sayilar[4]);

        System.out.println("2.sayı * 4.sayı = " + (sayilar[1] * sayilar[3]));

        System.out.println(ogrListesi);
        System.out.println(sayilar);

        System.out.println("Eleman sayısı = " + ogrListesi.length);
        System.out.println("2. Elemanı : " + ogrListesi[(ogrListesi.length-2)] );
        System.out.println("Son eleman : " + ogrListesi[ogrListesi.length-1]);


//        System.out.println(ogrListesi[ogrListesi.length]); //ArrayIndexOutOfBoundsException
//        System.out.println(ogrListesi[7]); //ArrayIndexOutOfBoundsException

        System.out.println("ogrListesi[0].contains(\"Ali\") = " + ogrListesi[0].contains("Ali"));
    }
}
