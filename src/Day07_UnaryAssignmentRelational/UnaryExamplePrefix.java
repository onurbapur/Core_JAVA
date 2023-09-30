package Day07_UnaryAssignmentRelational;

public class UnaryExamplePrefix {
    public static void main(String[] args) {
        System.out.println("Unary Example Prefix"); // "Unary Example "Prefix""
        System.out.println("Unary Example \"Prefix\""); // Unary Example "Prefix"

        int val = 0;
        int a = 10;

        System.out.println("val = " + val);
        System.out.println("a   = " + a);
        System.out.println("-----------");

        val = ++a; // a değişkeninin değerini 1 artırıp sonucu val değişkenine atar.
        /*
        a = a + 1; //a = 10 + 1.... a = 11
        val = a;  //val = 11
        */
        System.out.println("++Unary(Prefix)");
        System.out.println("Val...: " + val);
        System.out.println("a ....: " + a);
        System.out.println("-----------");

        val = --a;
        System.out.println("--Unary(Prefix)");
        System.out.println("Val...: " + val);
        System.out.println("a ....: " + a);
        System.out.println("-----------");

        val = ++a + a++ + a-- + --a;
        System.out.println(val);
    }
}
