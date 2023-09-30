package Day05_ArithmeticOprs;


public class AritmetikOncelikler {

    public static void main(String[] args) {
        int hesaplama = 18 + 9 / 3;

        System.out.println("Sonuç = " + hesaplama);

        hesaplama = 10 + 20 * 30;
        System.out.println("Sonuç = " + hesaplama);

        hesaplama = 10 * 20 / 5;
        System.out.println("Sonuç = " + hesaplama);

        hesaplama = 8 + 2 * 3 - 21 / 7 + 6;
        /*
        8 + (2 * 3) - (21 / 7) + 6
        8 + 6 - 3 + 6   = 17
        14 - 3 + 6 = 17
        11 + 6 = 17
         */

        System.out.println(hesaplama);

    }
}
