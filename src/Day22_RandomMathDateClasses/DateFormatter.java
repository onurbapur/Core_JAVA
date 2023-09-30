package Day22_RandomMathDateClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        SimpleDateFormat tarihFormatla = new SimpleDateFormat();
        Date date1 = new Date();
        System.out.println(date1);

        System.out.println("tarihFormatla.format(date1) = " + tarihFormatla.format(date1));

        tarihFormatla = new SimpleDateFormat("yyyy");
        System.out.println("Yıl = " + tarihFormatla.format(date1));

        tarihFormatla = new SimpleDateFormat("MM");
        System.out.println("Ay = " + tarihFormatla.format(date1));

        tarihFormatla = new SimpleDateFormat("dd");
        System.out.println("Gün = " + tarihFormatla.format(date1));

        tarihFormatla = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Tarih = " + tarihFormatla.format(date1));

        tarihFormatla = new SimpleDateFormat("dd/MMMM/yy");
        System.out.println("Tarih = " + tarihFormatla.format(date1));

        tarihFormatla = new SimpleDateFormat("HH:mm:ss"); //hh--> 12 lik saat, HH --> 24 lük saat gösterimi
        System.out.println("Saat = " + tarihFormatla.format(date1));

        date1 = new Date(2022,0,13);
        tarihFormatla = new SimpleDateFormat("MMMM"); //MM=0 dan 11 e kadar ay. MMM--Oca, MMMM---Ocak
        System.out.println("Ay = " + tarihFormatla.format(date1));
    }
}
