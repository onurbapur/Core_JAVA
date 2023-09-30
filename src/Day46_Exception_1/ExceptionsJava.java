/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day46_Exception_1;

import java.util.Scanner;

public class ExceptionsJava {
    public static void main(String[] args) {
        System.out.println("Exception handling in Java.");
        Scanner scanner = new Scanner(System.in);

        int sayiA = 12;
        int sayiB = 0;
        int sonuc = 0;
        int toplam = 0;
        boolean devam = true;
        String str = null;

        int[] sayilar ={1,3,4};

        try {
            System.out.println(sayilar[5]); //sayilar dizisinin olmayan bir indexindeki değeri yazdırmaya çalışıyoruz.
        }
        catch (ArrayIndexOutOfBoundsException hata){//Bir dizinin sınırları dışındaki bir indexine erişmek istersek hata oluşur ve burada bu hatayı yakalamış olduk.
            System.out.println("İndex ile ilgili bir hata oluştu!");
        }
        while (devam){
            System.out.print("Bir sayı giriniz : ");
            sayiB = scanner.nextInt();
            if(sayiB == 1000){
                devam = false;//Programı bitir.
            }
            try {
              // sonuc = sayiA / sayiB; //Sıfır a bölünme hatasının oluşabileceği bir durum olduğundan bizim bu hatayı denetlememiz lazım
                sonuc = hesapla(sayiA,sayiB);
                System.out.println(str.length()); //Değeri null olabilecek bir string nesnesi üzerinde bir işlem yapmamız gerekirse mutlaka denetlememiz ve hatayı yakalamız gerekir
            }
            catch (ArithmeticException aritmetikHata){
                System.out.println("Bir hata oluştu!!!");
                System.out.println("Lütfen 0'dan büyük bir sayı giriniz!");
                //System.out.println(aritmetikHata.getMessage());
               // aritmetikHata.printStackTrace(); //Oluşan hatanın ne tür  bir hata olduğu ve kod içerisinde bu hatanın hangi satır/larda bulunduğu gibi bilgiler verir.
            }
            catch (NullPointerException nullHata){
                str = "";
                System.out.println("(String)Bir hata oluştu!!!");
            }
            catch (Exception genelHata){
                System.out.println("Bilinmeyen bir hata oluştu!!!");
            }
            toplam += sayiB;
            System.out.println("Toplam = " + toplam);
        }
    }
    public static int hesapla(int sayi1, int sayi2){
        return sayi1/sayi2; // hata burada oluşsa da metodun çağrıldığı yerde denetleniyorsa hata yönetimi orada yapılabilir.
    }
}