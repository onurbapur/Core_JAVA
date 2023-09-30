package Day10_IfElse_ElseIf;

import java.util.Scanner;

public class Ornek_If_Else {
    public static void main(String[] args) {
        System.out.println("If... Else");
        System.out.println("-----------");
        Scanner klavye = new Scanner(System.in);

        int yas = 0;
        int kilosu = 0;

        System.out.print("Lütfen yaşınızı giriniz ---> ");
        yas = klavye.nextInt();

        if (yas > 18){
            System.out.print("Lütfen kilonuzu giriniz ---> ");
            kilosu = klavye.nextInt();

            System.out.println("Kişinin yaşı 18 büyüktür.");
            if(kilosu > 50){
                System.out.println("Yaşınız ve kilonuz kan vermeye uygundur.");
            }else {
                System.out.println("Yaşınız uygun ancak Kilonuz kan vermeye uygun değildir.");
            }
        }else{
            System.out.println("Yaşınız 18 den küçüktür. Kan verebilmek için yaşınızın 18 den büyük olması gerekir.");
        }


        System.out.println();
        System.out.println("Relational && operatörü ile heriki şartın uygun olduğu durumu konrol ettik.");
       if ((yas > 18) && (kilosu > 50)){
           System.out.println("Yaşınız ve kilonuz kan vermeye uygundur.");
       }else {
           System.out.println("Şartlarınız kan vermeye uygun değildir.");
       }

    }

}
