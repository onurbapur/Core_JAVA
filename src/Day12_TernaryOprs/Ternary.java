package Day12_TernaryOprs;
public class Ternary {
    public static void main(String[] args) {
        System.out.println("Ternary operator in Java.");

        int x, y;
        x = 20;

        //(condition) ? expression1 :expression2;
        y = (x==1) ? 61: 90; //Ternary operation
        System.out.println("y ---> " + y);

        y = (x==20) ? 61: 90; //Ternary operation
        System.out.println("y ---> " + y);
        System.out.println();

        // Ternary equivalent if..else
        System.out.println("Same test with if...else ");
        if (x==1){
            y = 61;
            System.out.println("y ---> " + y);
        }else {
            y = 90;
            System.out.println("y ---> " + y);
        }

        if (x==20){
            y = 61;
            System.out.println("y ---> " + y);
        }else {
            y = 90;
            System.out.println("y ---> " + y);
        }


    }
}
