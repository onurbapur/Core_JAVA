package Day25_StringClass2;

public class StringIndexOf {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are great Planet.";

        System.out.println("myStr.indexOf(\"planet\") = " + myStr.indexOf("planet"));
        System.out.println("myStr.indexOf(\"planet\",15) = " + myStr.indexOf("Planet", 15));
        System.out.println("myStr.indexOf(\"Planet\") = " + myStr.indexOf("Planet"));
        System.out.println("myStr.indexOf(\",\") = " + myStr.indexOf(","));
        System.out.println("myStr.indexOf(\"a\") = " + myStr.indexOf(97)); //ASCII or Unicode code for "a"
    }
}
