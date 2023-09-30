package Day14_ForLoops;

public class NestedForLoop2 {
    public static void main(String[] args) {
        System.out.println("Sayılarla Üçgen yazdırma.");
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
