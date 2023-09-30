package Day21_MemoryManGarbageCol;

public class StringImmutable {

    public static void main(String[] args) {
        String str1 = "Ahmet";
        String str2 = "Ahmet";
        String str3 = new String("Ahmet").intern();// .intern() string pool a eklemek için

        String str7 = new String("Ahmet") ;

        System.out.println((str1 == str3)); //Compare reference address of object
        System.out.println((str1 == str7)); //Compare reference address of object

        System.out.println(str1.equals(str7)); //Compare value

        String str4 = "Ahmet" + "Falanca";
        String str5 = "Ahmet".toLowerCase();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str5);
        System.out.println(str3);
        System.out.println(str4);

        String kime = "Ali Can";

        kime.toLowerCase();

        havaleYap(10000,kime);
    }
    public static void havaleYap(double miktar, String kime){
        System.out.println(kime + " -Para havalesi yapıldı.");
    }
}
