package Day22_RandomMathDateClasses;


import java.util.Date;

public class DateClass1 {
    public static void main(String[] args) {
        Date date = new Date(); //Bu günün tarihi
        long time1 = date.getTime(); // Ocak 1, 1970 saat 00:00:00 'dan günümüze geçen süreyi milisaniye cinsinden gösterir.

        System.out.println("time1 = " + time1);
        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getDay() = " + date.getDay());
        System.out.println("date.getMonth() = " + date.getMonth());

        System.out.println("date.getYear() = " + (2022-1900));

        System.out.println("This year = " + (date.getYear() + 1900));

        /*boolean after(Date date);
        boolean before(Date date);*/

        Date date1 = new Date(2024,3,23);
        Date date2 = new Date(2022,3,30); //Bizim belirlediğimiz tarih

        System.out.println("date2.after(date1) = " + date2.after(date1));
        System.out.println("date2.before(date1) = " + date2.before(date1));

        date1 = new Date(2024,3,23);
        date2 = new Date(2024,3,23);
        System.out.println("date2.equals(date1) = " + date2.equals(date1));
    }
}
