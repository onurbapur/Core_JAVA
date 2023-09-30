package Day08_LogicalOprs;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("1-Swap two variables value with using third variable.");
        int a = 6, b = 8, temp = 0;

        System.out.println("a before = " + a);
        System.out.println("b before = " + b);
        System.out.println("---------------");

        temp = a;
        a = b;
        b = temp; //b = a

        System.out.println("a after = " + a);
        System.out.println("b after = " + b);

        System.out.println("-------------------------------");
        System.out.println("2-Swap two variables value without using third variable.");

        System.out.println("a before = " + a);
        System.out.println("b before = " + b);
        System.out.println("---------------");

        a = a + b; // a = 8 + 6 = 14 ---> a = 14
        b = a - b; // b = 14 - 6 = 8 ---> b = 8
        a = a - b; // a = 14 - 8 = 6 ---> a = 6

        System.out.println("a after = " + a);
        System.out.println("b after = " + b);

    }
}
