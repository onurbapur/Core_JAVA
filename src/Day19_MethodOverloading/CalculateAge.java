package Day19_MethodOverloading;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CalculateAge {
    public static int calculate(int year){
        LocalDate today = LocalDate.now();
        //int yearGuncel = 2022;

        return today.getYear() - year;
    }
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date date = new Date();

        LocalDate today = LocalDate.now();

        System.out.println("calculate(1990) = " + calculate(1990));
        System.out.println("calculate(1967) = " + calculate(1967));

        System.out.println("date = " + date);
        System.out.println("format.format(date) = " + format.format(date));


        System.out.println("today.getDayOfWeek() = " + today.getDayOfWeek());
        System.out.println("today.getDayOfMonth() = " + today.getDayOfMonth());
        System.out.println("today.getDayOfYear() = " + today.getDayOfYear());
        System.out.println("today.getMonthValue() = " + today.getMonthValue());
        System.out.println("today.getMonth() = " + today.getMonth());
    }
}
