package Day06_CastOprs;

public class TypeCastingNarrowing {
    public static void main(String[] args) {
        double myDouble = 10;
        int myInt = 0;

       // myDouble = myInt; //Widening---> Java küçük bir veri tipinden kendisinden büyük bir veri tipine otomatik dönüştürdü.

        //myInt = myDouble; //Narrowing---> Java kendisinden büyük bir veri tipinin atanmasına otomatik izin vermedi.
        myInt = (int)myDouble; //Type cast operatörü(int) ile Explicit narrowing
        System.out.println(myInt);

        double myBuyukDouble = 123456789012345678998877790d;
        int myIntAbc = 0;

        myIntAbc = (int)myBuyukDouble;
        System.out.println("myIntAbc = " + myIntAbc );

        myBuyukDouble = 5147483648d;
        myIntAbc = 0;

        myIntAbc = (int)myBuyukDouble;
        System.out.println("myIntAbc = " + myIntAbc );

        myBuyukDouble = 125.6789d;
        myIntAbc = 0;

        myIntAbc = (int)myBuyukDouble;
        System.out.println("myIntAbc = " + myIntAbc );

        short myShort =0;
        myInt = 32769 ; //-32768   ile 32767

        myShort = (short)myInt;
        System.out.println("myShort= " + myShort);




    }
}
