package Day25_StringClass2;

public class StringLowerAndUpperCase {
    public static String basharfBuyuk(String kelime){
        String result = "";
        String basHarf;
        result=  kelime.toLowerCase();
        basHarf = result.substring(0,1).toUpperCase();
     // basHarf = basHarf.toUpperCase();
        result = result.replace(result.charAt(0),basHarf.charAt(0));
        return result;
    }

    public static void main(String[] args) {
        String myStr = "Hello World.";

        System.out.println("myStr.toLowerCase() = " + myStr.toLowerCase());
        System.out.println("myStr.toUpperCase() = " + myStr.toUpperCase());

        System.out.println("basharfBuyuk = " + basharfBuyuk("ahmet"));
        System.out.println("basharfBuyuk = " + basharfBuyuk("falanca"));
    }
}
