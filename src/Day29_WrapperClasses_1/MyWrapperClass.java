package Day29_WrapperClasses_1;

public class MyWrapperClass {
    int value;

    //int parametre alan constructor
    public MyWrapperClass(int sayi){
        this.value = sayi;
    }

    //String parametre alan constructor
    public MyWrapperClass(String str){
       this.value = strToInt(str);
    }

    public static int strToInt(String str){
        int result = 0;
        for (int i = 0; i < str.trim().length(); i++) {
            result *= 10;
            result += str.charAt(i) - 48;// ASCII code for '0'
        }
        return result;
    }
    public static String intToStr(int sayi){
       return  sayi + "";
    }
    public static Byte byteCevir(int sayi){
        return (byte)sayi;
    }

 }
