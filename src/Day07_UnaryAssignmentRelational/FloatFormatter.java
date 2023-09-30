package Day07_UnaryAssignmentRelational;

import java.text.DecimalFormat;

public class FloatFormatter {
    public static void main(String[] args) {
        float floatDeger = 25.345678f;
        double doubleDeger = 3767.892237776778D;

        System.out.println("Float---> " + floatDeger);
        System.out.println( doubleDeger);

        System.out.println(".printf");
        System.out.printf("%.4f\n",floatDeger);
       // System.out.println(); "\n" newline
        System.out.printf("%.4f\n",doubleDeger);

        System.out.println("String.format");
        System.out.println(String.format("%.3f",floatDeger));
        System.out.println(String.format("%.3f",doubleDeger));

       // DecimalFormat df = new DecimalFormat("#"); //"#" sadece tamsayı kısmını yazdır ve yuvarla
        DecimalFormat df = new DecimalFormat("#,###"); //"#.### tamsayı ve ondalıklı kısmı 3 haneli
        System.out.println("Decimal formatter");
        System.out.println("doubleDeger = " + df.format(doubleDeger));

        double abc = Double.parseDouble(df.format(doubleDeger));
        System.out.println("abc = " + abc);
    }
}
