package Day11_SwitchCase;
import java.util.Scanner;

public class SwitchCaseAylar {
    public static void main(String[] args) {
        Scanner ayBilgis = new Scanner(System.in);

        int number = 1;
        String month ="";
        String mevsim ="";

        System.out.print("Lütfen klavyeden 1 ile 12 arasında bir ay değeri giriniz---> ");
        number = ayBilgis.nextInt();

        switch (number){
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
        if (month!=""){
            System.out.println("Klavyeden girdiğiniz ay = " + month);
        }

        switch (number){
            case 12:
            case 1:
            case 2:
                mevsim = "Kış aylarındandır.";
                break;
            case 3:
            case 4:
            case 5:
                mevsim = "İlkbahar aylarındandır.";
                break;
            case 6:
            case 7:
            case 8:
                mevsim = "Yaz aylarındandır.";
                break;
            case 9:
            case 10:
            case 11:
                mevsim = "Sonbahar aylarındandır.";

        }
        if(mevsim !=""){
            System.out.println(mevsim);
        }

    }
}
