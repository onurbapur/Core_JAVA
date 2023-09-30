package Day08_LogicalOprs;

public class LogicalAND {
    public static void main(String[] args) {
        System.out.println("Logical AND operator example.");
        int a = 19, b = 5, c = 20;

        //System.out.println("a < b   = " + (a<b));
        //System.out.println("a++ < c = " + (a++ < c));
        System.out.println((a<b) && (a++ < c)); //Short circuit
        System.out.println("a = " + a);

        System.out.println((a<b) & (++a < c)); //AND
        System.out.println("a = " + a);

    }
}
