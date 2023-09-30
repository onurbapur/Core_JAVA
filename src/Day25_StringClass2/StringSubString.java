package Day25_StringClass2;

public class StringSubString {
    public static void main(String[] args) {
        String myStr = "Hello World. We are learning java.";

        System.out.println("myStr.substring(6) = " + myStr.substring(6));
        System.out.println("myStr.substring(6) = " + myStr.substring(0,5));

        System.out.println("myStr.substring(myStr.length()-5,myStr.length()-1) = " + myStr.substring(myStr.length() - 5, myStr.length() - 1));

    }
}
