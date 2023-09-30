package Day22_RandomMathDateClasses;

import java.util.Random;

public class RandomSayi {
    public static void main(String[] args) {
         //1-100  arasında Random sayı üretme
        Random rastgeleSayi = new Random(); //Random class'ından rastgeleSayi adında bir obje oluşturduk.

        int baslangic = 1; // 1 dahil - inclusive
        int bitis = 101; //101 dahil değil - exclusive

        int uretilenSayi= 0;
        int sayac = 0;

        do {
            sayac++;
            uretilenSayi = rastgeleSayi.nextInt(bitis - baslangic) + baslangic; //
            System.out.println("ÜretilenSayi = " + uretilenSayi);
            if (uretilenSayi == 100){ //...sayıyı üretip üretmediğini kontrol ediyoruz.100 sayısı üretildiyse loop u sonlandırıyoruz.
                System.out.println(sayac + " adet rastgele sayı üretildi.");
                break;
            }
        }while (uretilenSayi > 0);
    }
}
