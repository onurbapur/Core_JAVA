package Day23_ReadingUserInput;

import java.util.Scanner;

public class InputNameAndAge {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);

        System.out.print("Lütfen adınızı yazınız : ");
        String name = veriGir.next(); //Kalvyeden bir kelime okur. Birden fazla kelime girilirse sadece ilk kelimeyi okur

        veriGir.nextLine(); //Klavye buffer(hafıza) alanında daha önceden kalan bir veri varsa o veriyi okur ve hafızayı boşaltır.

       /* String geriKalanlar = veriGir.nextLine();
        System.out.println("geriKalanlar = " + geriKalanlar);*/

        System.out.print("Lütfen yaşınızı giriniz : ");
        int age = veriGir.nextInt();

        System.out.println("Merhaba " + name + " " + age + " yaşındasınız.");

    }
}
