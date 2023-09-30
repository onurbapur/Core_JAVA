package Day08_LogicalOprs;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Reversing a integer.");
        int sayi = 987, reverseSayi = 0, lastDigit = 0;

        System.out.println("sayi = " + sayi);

        lastDigit = sayi % 10; // 7
        reverseSayi = reverseSayi * 10 + lastDigit; //7
        sayi = sayi / 10; //98

        lastDigit = sayi % 10; // 8
        reverseSayi = reverseSayi * 10 + lastDigit; // 7 * 10 + 8 = 78
        sayi = sayi / 10; //9

        lastDigit = sayi % 10; //9
        reverseSayi = reverseSayi * 10 + lastDigit; //78 * 10 + 9  = 789

        System.out.println("reverseSayi = " + reverseSayi);


    }
}
