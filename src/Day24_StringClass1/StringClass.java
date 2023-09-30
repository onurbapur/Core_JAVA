package Day24_StringClass1;

public class StringClass {
    public static void main(String[] args) {
        System.out.println("String Class in Java.");

        //Creating String object with "Literal" value
        String strLiteral = "Merhaba"; // creating String object by literal in string pool of heap memory
        String strLiteral1 = "Merhaba";// same object reference with strLiteral

        String strLiteral2 = "MERHABA";// Another object in String pool different from strLiteral and strLiteral1

        //Creating String object with "new" keyword
        String strObj = new String("Merhaba"); // creating String Object with new keyword
        String strObj1 = new String("Merhaba");// strObj and strObj1 are different objects, and they are created in heap memory

        //Comparing two string literal object with "==" Returns true if two objects hold the same value
        if(strLiteral == strLiteral1){
            System.out.println("strLiteral and strLiteral1 are equal.");
        }else System.out.println("Not equal.");

        if(strLiteral == strLiteral2){
            System.out.println("strLiteral and strLiteral2 are equal.");
        }else System.out.println("Not equal.");

        //Comparing two string object created with new keyword with "==" always returns "false"
        if(strObj == strObj1){//Heap memory de ayrı ayrı obje olduklarından referans değişkenlerinde de ayrı memory adresi vardır.
            System.out.println("strObj and strObj1 are equal.");
        }else System.out.println("Not equal.");

        //Comparing two string object with .equals() method. Returns true if two objects hold the same value
        if(strObj.equals(strObj1)){//.equals() metodu Sakladığı veriyi karşılaştırdı."Merhaba" == "Merhaba"
            System.out.println("strObj and strObj1 are keeping same value.");
        }else System.out.println("Not equal.");

        //Comparing string literal object and string object created new keyword  with "==" always "false"
        if(strObj.equals(strLiteral)){//Sakladığı veriyi karşılaştırdı."Merhaba" == "Merhaba" ---> true
            System.out.println("strObj and strLiteral are keeping same value.");
        }else System.out.println("Not equal.");
    }
}
