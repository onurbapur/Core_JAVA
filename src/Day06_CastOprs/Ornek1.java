package Day06_CastOprs;

public class Ornek1 {
    public static void main(String[] args) {
        short firstNumber = 32767;
        short secondNumber = 20;
        short thirdNumber;

        //thirdNumber = firstNumber + secondNumber; hata verir açıklaması aşağıda
        /*
        kural gereği java short ve byte veri tiplerini
        aritmetik işleme tabi tutarsa geçici olarak onları int kabul eder.
        Dolayısıyla işlem sonucunu byte ya da short veri tipinde bir değişkene atayamaz
         */
        //Çözüm için widening yapmak ya da sonucu aktaracağımız değişkeni int gibi büyük bir veri tipi seçmek gerekir

        //çözüm 1 veri kaybına razıysak
        thirdNumber = (short) (firstNumber + secondNumber);
        System.out.println(thirdNumber);

        //çözüm 2 widening yapmak gerekir
        int thirdNumberint = firstNumber + secondNumber;
        System.out.println(thirdNumberint);

        byte myByte1 = 127; //-128    ile   127
        byte myByte2 = 20;
        byte myByte3 = 0;

       // myByte3 = myByte1 + myByte2;  hata

        myByte3 = (byte) (myByte1 + myByte2);
        System.out.println("myByte3 = " + myByte3);
    }
}
