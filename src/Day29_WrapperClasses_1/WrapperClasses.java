package Day29_WrapperClasses_1;

public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Wrapper Classes in Java.");
        System.out.println("Primitive data types in java.");
        byte b = 121;
        short s = 6400;
        int i = 2145000;
        long l = 903218039434428203L;
        float f = 32323.12321f;
        double d = 123123.1212124143432423847389432;
        boolean bool = true;
        char c = 'J';

        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);

        System.out.println("-------------------------------------");
        System.out.println("Wrapper classes data types in java.");

        String str = "Java";
        String str1 = new String("Programlama");
        String str2 = String.valueOf("SDET");

        Integer intW = new Integer(12345);
        Integer int1W = Integer.valueOf(12345);
        Integer int2W = 12345;
        Integer int3W = Integer.valueOf("12345");

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("intW = " + intW);
        System.out.println("int1W = " + int1W);
        System.out.println("int2W = " + int2W);
        System.out.println("int3W = " + int3W);

        Integer toplam = 0;
        toplam = intW + int3W;
        System.out.println("toplam = " + toplam);

        Double dblW = new Double(112345.12312144244);
        Double dbl1W = Double.valueOf(1222353464577.98776);
        Double dbl2W = 134198170984.52534646;
        Double dbl3W = Double.valueOf("7126481648.235235");
        double toplamDbl = 0.0;

        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

        System.out.println("dblW = " + dblW);
        System.out.println("dbl1W = " + dbl1W);
        System.out.println("dbl2W = " + dbl2W);
        System.out.println("dbl3W = " + dbl3W);

        toplamDbl = dbl2W + dbl1W;
        System.out.println("toplamDbl = " + toplamDbl);
    }
}
