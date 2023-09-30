package Day25_StringClass2;

import java.util.Random;

public class AskingCharOfString {
    public static String harfBul(String str){
        Random rnd = new Random();
        int numberOfChar = rnd.nextInt(str.length()); //Kelimenin harf sayısı aralığında rastgele bir sayı üretir.
        String harf ="";

        harf = str.substring(numberOfChar,numberOfChar + 1); //Kelimedeki harfin ilk geçtiği yer ve harf
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (i == numberOfChar){
                result += harf + " ";
                continue;
            }
            result += "* ";
        }
        return result + "\nKelimenin içinde geçen " + (numberOfChar + 1) + ".harf nedir?";
    }


    public static void main(String[] args) {

        System.out.println(harfBul("Ahmetfalanca"));
    }
}
