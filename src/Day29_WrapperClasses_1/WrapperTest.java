package Day29_WrapperClasses_1;

public class WrapperTest {
    public static void main(String[] args) {
        MyWrapperClass myW = new MyWrapperClass(1234);
        MyWrapperClass myW1 = new MyWrapperClass("1234");

        System.out.println("myW1.value = " + myW1.value);
        System.out.println("myW = " + myW.value);
        String str = MyWrapperClass.intToStr(123456);
        System.out.println("MyWrapperClass.byteCevir(127) = " + MyWrapperClass.byteCevir(1281231));
    }
}
