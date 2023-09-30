package Day07_UnaryAssignmentRelational;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Assignment operators...");

        int num1 = 10, num2 = 5;
        System.out.println("num1  = " + num1);
        System.out.println("num2  = " + num2);
        System.out.println("-------------");

        num1 = num2;
        System.out.println("num1 = num2 ---> " + num1);
        System.out.println("num2  = " + num2);

        System.out.println("num1  = " + num1);
        System.out.println("num2  = " + num2);
        System.out.println("-------------");

        num1 += num2; // num1 = num1 + num2
        System.out.println("num1 +=num2  " + num1);
        System.out.println("-------------");

        System.out.println("num1  = " + num1);
        System.out.println("num2  = " + num2);
        System.out.println("-------------");

        num1 -= num2; // num1 = num1 - num2
        System.out.println("num1 -=num2  " + num1);
        System.out.println("-------------");

        System.out.println("num1  = " + num1);
        System.out.println("num2  = " + num2);
        System.out.println("-------------");

        num1 *= num2; // num1 = num1 * num2
        System.out.println("num1 *=num2  " + num1);
        System.out.println("-------------");

        System.out.println("num1  = " + num1);
        System.out.println("num2  = " + num2);
        System.out.println("-------------");

        num1 /= num2; // num1 = num1 / num2
        System.out.println("num1 /=num2  " + num1);
        System.out.println("-------------");

        System.out.println("num1  = " + num1);
        System.out.println("num2  = " + num2);
        System.out.println("-------------");

        num1 %= num2; // num1 = num1 % num2
        System.out.println("num1 %=num2  " + num1);
        System.out.println("-------------");

    }

}
