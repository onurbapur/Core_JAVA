package Day07_UnaryAssignmentRelational;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println("Relational operators...");
        int num1 =12, num2 = 4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();
        //== eşit midirler
        System.out.println("num1 == num2 ---> " + (num1 == num2) );

        //!= eşit değil midirler
        System.out.println("num1 != num2 ---> " + (num1 != num2));

        // > büyük müdür?
        System.out.println("num1 > num2  ---> " + (num1 > num2));

        // < küçük müdür?
        System.out.println("num1 < num2  ---> " + (num1 < num2));

        // >= büyük eşit midir?
        System.out.println("num1 >= num2  ---> " + (num1 >= num2));

        // <= küçük eşit midir?
        System.out.println("num1 <= num2  ---> " + (num1 <= num2));

        boolean sonuc;
        sonuc = (num1 == num2);
        System.out.println("Sonuc(boolean)  = " + sonuc);





    }
}
