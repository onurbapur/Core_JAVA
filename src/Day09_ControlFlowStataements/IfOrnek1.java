package Day09_ControlFlowStataements;

public class IfOrnek1 {
    public static void main(String[] args) {
        System.out.println("Conditional statement 'if'....");
        int sayi;
       // boolean kontrol;
        sayi = 12;
      //  kontrol = (sayi > 0);

        /*
        if (kontrol işlemi){
            karşılaştırma sonucu true ise çalışacak kod satır
        }
         */

        if (sayi > 0){
            System.out.println(sayi +" is positive number.");
        }

        if (sayi > 0)  System.out.println(sayi +" is positive number.");
    }
}
