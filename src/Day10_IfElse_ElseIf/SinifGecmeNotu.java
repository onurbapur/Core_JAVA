package Day10_IfElse_ElseIf;

import java.util.Scanner;

public class SinifGecmeNotu {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        int dersNotu = 0;
        char gecmeNotu = 'F';

        System.out.println("Sınıf geçme notu hesaplama.");
        System.out.println("---------------------------");
        System.out.println();
        System.out.print("Ders notunuzu giriniz(0-100) ---> "  );
        dersNotu = veriGir.nextInt();

        if (dersNotu >= 0 && dersNotu <= 100){
            System.out.println("Girilen ders notu = " + dersNotu );
            if (dersNotu >= 90){
                gecmeNotu = 'A';
            } else if (dersNotu >= 80) {
                gecmeNotu = 'B';
            } else if (dersNotu >= 70) {
                gecmeNotu = 'C';
            } else if (dersNotu >= 60) {
                gecmeNotu = 'D';
            } else {
                gecmeNotu = 'F';
            }
            if(gecmeNotu == 'F'){
                System.out.println("Sınıfta kaldınız notunuz =  " + gecmeNotu);

            }else {
                System.out.println("Geçme notunuz = " + gecmeNotu);
            }

        } else {
            System.out.println("Girilen ders notu = " + dersNotu );
            System.out.println("Girdiğiniz ders notu hatalıdır. 0 - 100 arası bir not değeri giriniz. ");
        }
    }

}
