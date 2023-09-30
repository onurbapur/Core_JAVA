package Day07_UnaryAssignmentRelational;

public class Odev {
    public static void main(String[] args) {
        System.out.println("Assignment odev ");
        //Aşağıdaki işlem sonucu a = ? ve p = ? açıklayınız.

        int a = 5;
        int p = ++a + --a + a++ + a--;
        System.out.println(p);
        System.out.println(a);

    }
}
