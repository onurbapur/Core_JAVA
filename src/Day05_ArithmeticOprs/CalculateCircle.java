package Day05_ArithmeticOprs;

public class CalculateCircle {
    public static void main(String[] args) {
        //Write a program in Java that calculates perimeter and area of a Circle given value

        //perimeter = 2 * radius * PI; Çemberin çevresi
        //area = PI * radius * radius; Dairenin alanı
        final double PI = 3.14; // sabit olduğu için final ile tanımladık
        double perimeter, area, radius ;

        radius = 15;
        perimeter = 2 * radius * PI;
        System.out.println(radius +  " cm yarıçaplı çenberin çevresi = " + perimeter + " cm dir.");

        radius = 20;
        area = PI * radius * radius;
        System.out.println(radius +  " cm yarıçaplı çenberin alanı = " + area + " cm² dir."); // alt + 0178



    }
}
