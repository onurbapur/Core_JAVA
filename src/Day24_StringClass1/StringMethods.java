package Day24_StringClass1;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Merhaba";
        String str2 = "";

        System.out.println("str1.length() = " + str1.length());
        System.out.println("str2.length() = " + str2.length());

        System.out.println("str1.charAt(0) = " + str1.charAt(0)); //First letter(char) of String str1
        System.out.println("str1.charAt(6) = " + str1.charAt(6)); //6. index letter(char) of String str1
        System.out.println("str1 Last Letter = " + str1.charAt(str1.length()-1)); //Last letter(char) of String str1
    }
}
