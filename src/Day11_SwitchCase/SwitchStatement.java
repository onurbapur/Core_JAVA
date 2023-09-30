package Day11_SwitchCase;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Switch case statement in Java");
        Scanner karakterGir = new Scanner(System.in);
        String  karakter;

        System.out.print("Klavyeden bir harf giriniz ---> ");
        karakter =karakterGir.next();

        switch (karakter){
            case "A":
            case "a":
                System.out.println("A veya a değeri var.");
                break;
            case "B":
            case "b":
                System.out.println("B veya b değeri var.");
                break;
            case "C":
            case "c":
                System.out.println("C  veya c değeri var.");
                break;
            default:
                System.out.println("A-B-C değerleri dışında bir değer var!");
        }



    }
}
