package Day30_WrapperClasses_2;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        System.out.println("Autoboxing and Unboxing.");
        int i = 123;
        Integer i2 = i; //Autoboxing
        System.out.println("i2 = " + i2);

        i = i2.intValue(); //Unboxing
        System.out.println("i = " + i);

        float flt = i2.floatValue();
        System.out.println("flt = " + flt);
    }
}
