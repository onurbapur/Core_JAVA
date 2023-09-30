package Day09_ControlFlowStataements;

import java.util.Scanner;

public class Ornek_Else1 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        double radius = 0.0;
        double area = 0.0;
        final double PI = 3.14;

        System.out.print("Please enter a radius value = ");
        radius = klavye.nextInt();

        if (radius > 0){
            area = radius * radius * PI;
            System.out.println("Radius = " +  radius + " -Area of Circle is = " + area);
        }else {
            System.out.println("Given radius value is negative or zero.");
            System.out.println("Area of Circle can not be calculated!");
        }




    }
}
