package Day11_SwitchCase;
import java.util.Scanner;

public class SwitchHesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Switch case yapısı ile basit bir hesap makinesi.");
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("=== Hesap Makinesi ===");
        System.out.println("İşlem operatörleri----: '+', '-', '*','/' ");
        System.out.println();

        Scanner islemGir = new Scanner(System.in);
        Scanner sayiGir = new Scanner(System.in);
        String islemOperatoru;
        int sayi1 = 0;
        int sayi2 = 0;
        int sonuc = 0;

        System.out.print("İşlem operatörünüzü giriniz (+, -, *, /) ---> ");
        islemOperatoru = islemGir.nextLine();

        System.out.print("Birinci sayıyı giriniz ---> ");
        sayi1 = sayiGir.nextInt();

        System.out.print("İkinci sayıyı giriniz ---> ");
        sayi2 = sayiGir.nextInt();

        if (sayi1 != 0 && sayi2 != 0){ // Hem sayi1 hem de sayi2 0'dan farklı olmalıdır.
            switch (islemOperatoru){
                case "+":
                    sonuc = sayi1 + sayi2;
                    break;
                case "-":
                    sonuc = sayi1 - sayi2;
                    break;
                case "*":
                    sonuc = sayi1 * sayi2;
                    break;
                case "/":
                    sonuc = sayi1 / sayi2;
                    break;
                default:
                    System.out.println("Yanlış bir operatör girdiniz!");
            }
            System.out.println("Sonuç = " + sonuc);
        } else System.out.println("Girdiğiniz sayılar 0 dan farklı olmalıdır!");






    }
}
