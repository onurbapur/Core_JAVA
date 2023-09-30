package Day25_StringClass2;

public class StringReplace {
    public static String degistir(String cumle, String bulKelime, String degistirKelime){
        System.out.println("Method çalıştı...");
        return cumle.replace(bulKelime,degistirKelime);
    }

    public static void main(String[] args) {
        String myStr = "The site is BootFlowAcademy.com";

        System.out.println("myStr.replace(\"com\",\"edu\") = " + myStr.replace("com", "edu"));
        System.out.println("myStr = " + myStr);

        String result = "";

        result = degistir("The site is BootFlowAcademy.com","com" ,"edu");
        System.out.println("result = " + result);

        result = degistir(result,"site","SITE");

        System.out.println("result = " + result);


    }
}
