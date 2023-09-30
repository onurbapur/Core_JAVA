package Day11_SwitchCase;
import java.util.Scanner;

public class SwitchCaseHaftaninGunleri {
    public static void main(String[] args) {
        System.out.println("Haftanın günlerini gösteren switch case yapısı.");
        Scanner gunGir = new Scanner(System.in);
        int haftaninGunu = 0;

        System.out.print("Klavyeden 1-7 arasında bir gün değeri girini---> ");
        haftaninGunu = gunGir.nextInt();

        System.out.println("Birinci case");
        switch (haftaninGunu) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlış gün değeri girdiniz.1-7 arası bir sayı olmalıydı!");
        }

            System.out.println();
            System.out.println("İkinci case");


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

        if(haftaninGunu >=1 && haftaninGunu <=5){
            System.out.println("Çalışma günu");
        }else System.out.println("Haftasonu");

        }
    }

