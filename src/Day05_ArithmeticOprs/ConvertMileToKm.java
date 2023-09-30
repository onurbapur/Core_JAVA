package Day05_ArithmeticOprs;

public class ConvertMileToKm {
    public static void main(String[] args) {
        //Write a Java program that converts mile to km.
        //double km = mile * 1.6093434;
        double mile;
        double km;

        mile = 85;
        km = mile * 1.6093434;

        System.out.println( mile + " mile = " + km + " kilometre eder.");

        //double mile = km * 0.621371;
        km = 90;
        mile = km * 0.621371;
        System.out.println(km + " kilometre = " + mile + " mil eder.");

    }

}
