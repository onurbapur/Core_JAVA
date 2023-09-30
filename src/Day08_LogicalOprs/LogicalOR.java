package Day08_LogicalOprs;

public class LogicalOR {
    public static void main(String[] args) {
        System.out.println("Logical OR operator example.");
        int a = 19, b = 5, c = 20;

        //System.out.println("a < b   = " + (a>b));
        //System.out.println("a++ < c = " + (a++ < c));
        System.out.println((a>b) || (a++ < c)); //Short circuit
        System.out.println("a = " + a);

        System.out.println((a<b) | (++a < c)); //OR
        System.out.println("a = " + a);

    }
}
