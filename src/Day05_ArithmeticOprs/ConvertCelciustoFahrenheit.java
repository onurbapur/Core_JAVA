package Day05_ArithmeticOprs;

public class ConvertCelciustoFahrenheit {
    public static void main(String[] args) {
        //Write a Java program to convert Celsius to Fahrenheit

        //Celcius = (5 *(fahrenheit - 32)) / 9
        //fahrenheit= ((celsius*9)/5)+32

        float celcius = 26;
        float fahrenheit = 82;

        //Fahrenheit to Celcius
        celcius = (5 * (fahrenheit - 32)) / 9;

        System.out.println("Celcius = " + celcius);

        //Celcius to Fahrenheit
        //fahrenheit= ((celcius * 9)/5) + 32

        celcius = 26;

        fahrenheit = (celcius * 9) / 5 + 32;

        System.out.println("Fahrenheit = " + fahrenheit);

    }

}
