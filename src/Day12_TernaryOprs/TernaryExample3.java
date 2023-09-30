package Day12_TernaryOprs;

import java.util.Scanner;

public class TernaryExample3 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Ternary example-3");
        System.out.print("Haftanın hangi günüdür? ---> ");

        int day= klavye.nextInt();
        String dayTxt = "";

        // Ternary implementation
        dayTxt = (day == 1) ? "Pazartesi"
                : (day == 2) ? "Salı"
                : (day == 3) ? "Çarşamba"
                : (day == 4) ? "Perşembe"
                : (day == 5) ? "Cuma"
                : (day == 6) ? "Cumartesi"
                : (day == 7) ? "Pazar"
                : "Yanlış gün girdiniz!";
        System.out.println("Ternary opr.- Klavyeden girdiğiniz gün ---> " + dayTxt);

        // Switch case implementation
        switch (day){
            case 1:
                dayTxt = "Pazartesi";
                break;
            case 2:
                dayTxt = "Salı";
                break;
            case 3:
                dayTxt = "Çarşamba";
                break;
            case 4:
                dayTxt = "Perşembe";
                break;
            case 5:
                dayTxt = "Cuma";
                break;
            case 6:
                dayTxt = "Cumartesi";
                break;
            case 7:
                dayTxt = "Pazar";
                break;
            default:
                dayTxt = "Yanlış gün girdiniz!";

        }
        System.out.println("Switch..Case - Klavyeden girdiğiniz gün ---> " + dayTxt);


        //Advanced Switch case- Daha sade ve anlaşılır yeni bir switch case yapısı
        dayTxt = switch (day) {
            case 1 -> "Pazartesi";
            case 2 -> "Salı";
            case 3 -> "Çarşamba";
            case 4 -> "Perşembe";
            case 5 -> "Cuma";
            case 6 -> "Cumartesi";
            case 7 -> "Pazar";
            default -> "Yanlış gün girdiniz!";
        };
        System.out.println("Switch..Case - Klavyeden girdiğiniz gün ---> " + dayTxt);

    }
}
