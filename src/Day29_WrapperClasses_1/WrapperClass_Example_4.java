package Day29_WrapperClasses_1;

public class WrapperClass_Example_4 {

    public static void main(String[] args) {
        Byte b = Byte.valueOf("121");
       // Byte c = Byte.valueOf("1234"); /// Error byte veri tipinin sınırları dışında olduğundan
        Byte x = Byte.valueOf((byte) 1234);

      //  System.out.println("c = " + c); // Error byte veri tipinin sınırları dışında olduğundan
        System.out.println("b = " + b);
        System.out.println("x = " + x);

        Boolean evetMi = Boolean.valueOf(true);
        Boolean isOn = Boolean.valueOf(true);

        System.out.println("evetMi.booleanValue() = " + evetMi.booleanValue());
        System.out.println("isOn.booleanValue() = " + isOn.booleanValue());

        System.out.println("(evetMi == isOn) = " + (evetMi == isOn));
        System.out.println("(evetMi.equals(isOn)) = " + (evetMi.equals(isOn)));

        System.out.println("Boolean.parseBoolean(\"True\") = " + Boolean.parseBoolean("True"));

        Character chr = Character.valueOf('K');
        System.out.println("chr = " + chr);

        Character chr1 = Character.valueOf((char) 5302);
        System.out.println("chr1 = " + chr1);

        Long lng = Long.valueOf(1234567778798777L);
        System.out.println("lng = " + lng);
        System.out.println("lng.doubleValue() = " + lng.doubleValue());
    }
}
