package Day24_StringClass1;

public class PrintingAddressOfObjects {
    public static void main(String[] args) {
        String str1 = "Merhaba";
        String str2 = "Merhaba";

        String str3 = "java";
        String str4 = new String("Merhaba");

        Object obj = new Object(); //Simple dummy objects
        Object obj1 = new Object();

        //hashCode of objects the content of the obj is considered
        /*
        System.out.println("Address of str1- " + Integer.toHexString(str1.hashCode()));
        System.out.println("Address of str2- " + Integer.toHexString(str2.hashCode()));
        System.out.println("Address of str3- " + Integer.toHexString(str3.hashCode()));
        System.out.println("Address of str4- " + Integer.toHexString(str4.hashCode()));
        */

        /*
        This is typically implemented by converting the internal address of the object into an integer,
        but this implementation technique is not required by the JavaTM programming language
         */

        System.out.println("Something like reference addresses of objects");//Not exactly memory address of an object
        System.out.println("--------------------------------");
        System.out.println("Address of str1- " + Integer.toHexString(System.identityHashCode(str1)));
        System.out.println("Address of str2- " + Integer.toHexString(System.identityHashCode(str2)));
        System.out.println("Address of str3- " + Integer.toHexString(System.identityHashCode(str3)));
        System.out.println("Address of str4- " + Integer.toHexString(System.identityHashCode(str4)));
        System.out.println("Address of obj- " + obj); //Ref. address of obj with print method
        System.out.println("Address of obj- " + Integer.toHexString(System.identityHashCode(obj)));

        System.out.println("Address of obj- " + obj1); //Ref. address of obj with print method
        System.out.println("Address of obj- " + Integer.toHexString(System.identityHashCode(obj1)));

        System.out.println("(str2 == str4) = " + (str2 == str4));//str2 in String pool and str4 in Heap memory therefore result = false
        System.out.println("(str2 == str4) = " + (str2 == str1));

    }
}
