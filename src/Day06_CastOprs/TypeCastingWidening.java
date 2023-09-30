package Day06_CastOprs;

public class TypeCastingWidening {
    public static void main(String[] args) {
        byte myByte = 127;
        int myInt = 0;
        float myFloat;
        boolean isKapali = true;

        myInt = myByte; //Widening--> Kendisinden büyük veri saklayabilen bir veri tipine dönüştürdük.
        System.out.println(myByte);

        myFloat = myByte;
        System.out.println(myFloat);

        //myFloat = isKapali; // Compiler error... boolean veri tipi cast yapılamaz.java: incompatible types: boolean cannot be converted to float

    }
}
