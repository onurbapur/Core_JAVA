package Day07_UnaryAssignmentRelational;

public class OdevCozum {

    public static void main(String[] args) {
        int a = 5;
        int p = 0;
        int tempA = 0;

        // p = ++a + --a + a++ + a--;
        /*
         System.out.println("a = " + a +" p = " + p);
        System.out.println("-----------");
         */

        tempA = ++a;
        p += tempA;
        System.out.println("a  = " + tempA + " p = " + p);

        tempA = --a;
        p += tempA;
        System.out.println("a  = " + tempA + " p = " + p);

        tempA = a++;
        p += tempA;
        System.out.println("a  = " + tempA + " p = " + p);

        tempA = a--;
        p += tempA;
        System.out.println("a  = " + tempA + " p = " + p);
        System.out.println("------------");
        System.out.println("a  = " + a + " p = " + p);
        /*
        Çözüm adımları
        a = 5
        p = ++a + --a + a++ + a--
        p = 6 + 5 + a++ + a--
        p = 6 + 5 + 5 + a--
        p = 6 + 5 + 5 + 6

        p = 22 ... a = 5
         */

    }

}
