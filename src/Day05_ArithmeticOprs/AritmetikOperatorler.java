package Day05_ArithmeticOprs;

public class AritmetikOperatorler {
    public static void main(String[] args){
        System.out.println("Aritmetik operatörler.");
        System.out.println("---------------------");
        System.out.println();

        int addition, subtraction,division,multpl, modulo;
        int num1 = 10;
        int num2 = 3;

        addition = num1 + num2;
        System.out.println("Addition = " + addition);
        System.out.println("---------------");

        subtraction = num1 - num2;
        System.out.println("Subtraction = " + subtraction);
        System.out.println("---------------");

        division = num1 / num2;
        System.out.println("Division = " + division);
        System.out.println("---------------");

        multpl = num1 * num2;
        System.out.println("Çarmpa = " + multpl);

        modulo = num1 % num2;
        System.out.println("Modulus  : " + modulo);

        System.out.println("---------------");

        modulo = num1 % 2;
        System.out.println(modulo);

        modulo = num2 % 2; //output 1 ise tek sayıdır. 0 ise çift sayıdır.
        System.out.println(modulo);

        long buyukSayi;
        buyukSayi = 1187668997494023409L;

        System.out.println(buyukSayi % 1000);


    }
}
