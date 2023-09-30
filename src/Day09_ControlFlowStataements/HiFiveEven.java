package Day09_ControlFlowStataements;


import java.util.Scanner;

public class HiFiveEven {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in); // Kullanıcıdan veri girişi için kullanılan temel yapı

        int sayi=0;

        System.out.print("2 nin katı ya da 5 in katı olduğunu test edeceğim sayıyı giriniz.--> ");
        sayi = klavye.nextInt(); //klavyeden tamsayı girdisi alır.

        if ((sayi%2 == 0) && (sayi%5 == 0)) {
            System.out.println( sayi + " -Hi even.+ Hi Five..Sayı hem 2 nin hem de 5 in katlarındandır.");
        }
        if ( !( (sayi%2 == 0) && (sayi%5 == 0) ) ) {
            if (sayi%2 == 0){
                System.out.println( sayi + " -Hi even...Sayı 2 nin katlarındandır.");
            }
            if (sayi%5 == 0){
                System.out.println( sayi + " -Hi five...Sayı 5 in katlarındandır.");
            }
        }




    }
}
