package Day07_UnaryAssignmentRelational;

public class UnaryExamplePostfix {
    public static void main(String[] args) {
        System.out.println("Unary example postfix...");
        int val = 0;
        int a = 10;

        System.out.println("Val...: " + val);
        System.out.println("a ....: " + a);
        System.out.println("-----------");

        val = a++; //postfix----> store the value of "a" in to "val" then increments a by 1.
        /*
        val = a;
        a = a + 1;
         */
        System.out.println("Unary++(Postfix)");
        System.out.println("Val...: " + val);
        System.out.println("a ....: " + a);
        System.out.println("-----------");

        val = a--;
        /*
        val = a;
        a = a - 1;
         */
        System.out.println("Unary--(Postfix)");
        System.out.println("Val...: " + val);
        System.out.println("a ....: " + a);
        System.out.println("-----------");


    }
}
