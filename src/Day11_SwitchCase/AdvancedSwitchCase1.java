package Day11_SwitchCase;

import java.util.Scanner;

public class AdvancedSwitchCase1 {
    public static void main(String[] args) {
        System.out.println("Haftanın günlerini gösteren switch case yapısı.");
        Scanner gunGir = new Scanner(System.in);
        int haftaninGunu = 0;

        System.out.print("Klavyeden 1-7 arasında bir gün değeri girini---> ");
        haftaninGunu = gunGir.nextInt();

        /*
        switch (haftaninGunu){
            case 1: case 2: case 3: case 4: case 5: //if(haftaninGunu >=1 && haftaninGunu <=5)
                System.out.println("Hafta içi çalışma günlerindendir.");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu tatil günüdür.");
                break;
            default:
                System.out.println("Yanlış gün değeri girdiniz.1-7 arası bir sayı olmalıydı!");
        }

         */

        //Advanced Switch case
        switch (haftaninGunu) {
            case 1, 2, 3, 4, 5 -> //if(haftaninGunu >=1 && haftaninGunu <=5)
                    System.out.println("Hafta içi çalışma günlerindendir.");
            case 6, 7 ->{
                System.out.println("********");
                System.out.println("Hafta sonu tatil günüdür.");
            }
            default -> System.out.println("Yanlış gün değeri girdiniz.1-7 arası bir sayı olmalıydı!");
        }

        if(haftaninGunu >=1 && haftaninGunu <=5){
            System.out.println("Çalışma günu");
        }else System.out.println("Haftasonu");
    }
}
