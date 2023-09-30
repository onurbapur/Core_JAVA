package Day22_RandomMathDateClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateClassLocalDate {
    public static void main(String[] args) {
        DateTimeFormatter tarihFormatla = DateTimeFormatter.ofPattern("yyyy");
        LocalDate yerelTarih = LocalDate.now();

        tarihFormatla =  DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("format.format(yerelTarih) = " + tarihFormatla.format(yerelTarih));
        System.out.println("yerelTarih = " + yerelTarih);
        System.out.println("yerelTarih.getMonth() = " + yerelTarih.getMonth());
        System.out.println("yerelTarih.getMonthValue() = " + yerelTarih.getMonthValue());

        System.out.println("yerelTarih.getDayOfMonth() = " + yerelTarih.getDayOfMonth());

        System.out.println("yerelTarih.plusMonths(2) = " + yerelTarih.plusMonths(2).getMonth());
    }
}
