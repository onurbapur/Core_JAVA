package Day36_StaticClassMembers_1;

public class ConverterTest {
    public static void main(String[] args) {
        System.out.println("Converter.milesToKilometers(100) = " + Converter.milesToKilometers(100));

        System.out.println("Converter.kilometersMiles(160.9) = " + Converter.kilometersMiles(160.9));

        System.out.println("Converter.fahrenheitToCelsius(85) = " + Converter.fahrenheitToCelsius(85));

        System.out.println("Converter.celsiusTofahrenheit(29.444444444444443) = " + Converter.celsiusTofahrenheit(29.444444444444443));

        System.out.println("Converter.centimetersToInches(100) = " + Converter.centimetersToInches(100));
        System.out.println("Converter.inchesToCentimeters(39) = " + Converter.inchesToCentimeters(39));

        System.out.println("Converter.kdvHesapla(100) = " + Converter.kdvHesapla(100));

        System.out.println("Converter.boyKiloIndex(1.78,85) = " + Converter.boyKiloIndex(1.78, 85));

        if ( Converter.boyKiloIndex(1.78, 85) > 20){
            System.out.println("Obez...");
        }
    }
}
