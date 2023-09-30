package Day16_Method1;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void sayiTopla(int aSayisi, int bSayisi){
        System.out.println("Metod çağrıldı...");
        System.out.println("Toplam = " + (aSayisi + bSayisi));
    }

    public static void ucSayiTopla(int a, int b, int c){
        System.out.println("Üç sayı toplayan metod.");
        System.out.println("Toplam = " + (a+b+c));
    }

    public static void main(String[] args) {
        Scanner klavye  = new Scanner(System.in);
        sayiTopla(1995,45);

        int sayi1,sayi2;
        System.out.print("Birinci sayıyı giriniz ---> ");
        sayi1 = klavye.nextInt();

        System.out.print("İkinci sayıyı giriniz ---> ");
        sayi2 = klavye.nextInt();
        //Method called
        sayiTopla(sayi1,sayi2);

        //Method called
        ucSayiTopla(12,34,56);
    }


}
