package Day23_ReadingUserInput;

import java.util.Scanner;

public class WhileInput {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);

        double toplam = 0;
        double sayi = 0;
        int counter = 0;

        while (true){
            counter++;
            System.out.print(counter +". sayıyı giriniz : ");
            sayi = veriGir.nextDouble();
            toplam+= sayi;
            if (counter == 5){
                break;
            }
        }

        System.out.println("Girilen sayıların toplamı = " + toplam);
    }

}
