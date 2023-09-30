package Day11_SwitchCase;

import java.util.Scanner;

public class AdvancedSwitchCase {
    public static void main(String[] args) {
        Scanner ayBilgis = new Scanner(System.in);

        int number = 1;
        String month = "";
        String mevsim = "";

        System.out.print("Lütfen klavyeden 1 ile 12 arasında bir ay değeri giriniz---> ");
        number = ayBilgis.nextInt();

        switch (number) {
            case 1:
                month = "Ocak";
                break;
            case 2:
                month = "Şubat";
                break;
            case 3:
                month = "Mart";
                break;
            case 4:
                month = "Nisan";
                break;
            case 5:
                month = "Mayıs";
                break;
            case 6:
                month = "Haziran";
                break;
            case 7:
                month = "Temmuz";
                break;
            case 8:
                month = "Ağustos";
                break;
            case 9:
                month = "Eylül";
                break;
            case 10:
                month = "Ekim";
                break;
            case 11:
                month = "Kasım";
                break;
            case 12:
                month = "Aralık";
                break;
            default:
                System.out.println("Yanlış ay bilgisi girdiniz 1-12 arası bir ay bilgisi giriniz!");
        }
        if (month != "") {
            System.out.println("Klavyeden girdiğiniz ay = " + month);
        }

        //Advanced Switch Case
        switch (number) {
            case 1 -> month = "Ocak";
            case 2 -> month = "Şubat";
            case 3 -> month = "Mart";
            case 4 -> month = "Nisan";
            case 5 -> month = "Mayıs";
            case 6 -> month = "Haziran";
            case 7 -> month = "Temmuz";
            case 8 -> month = "Ağustos";
            case 9 -> month = "Eylül";
            case 10 -> month = "Ekim";
            case 11 -> month = "Kasım";
            case 12 -> month = "Aralık";
            default -> System.out.println("Yanlış ay bilgisi girdiniz 1-12 arası bir ay bilgisi giriniz!");
        }
        if (month != "") {
            System.out.println("Klavyeden girdiğiniz ay = " + month);
        }

        //Advanced Switch Case-1 with variable assignment
        month = switch (number) {
            case 1 -> month = "Ocak";
            case 2 -> month = "Şubat";
            case 3 -> month = "Mart";
            case 4 -> month = "Nisan";
            case 5 -> month = "Mayıs";
            case 6 -> month = "Haziran";
            case 7 -> month = "Temmuz";
            case 8 -> month = "Ağustos";
            case 9 -> month = "Eylül";
            case 10 -> month = "Ekim";
            case 11 -> month = "Kasım";
            case 12 -> month = "Aralık";
            default -> "Yanlış ay bilgisi girdiniz 1-12 arası bir ay bilgisi giriniz!";
        };
        if (month != "") {
            System.out.println("Klavyeden girdiğiniz ay = " + month);
        }
    }
}
