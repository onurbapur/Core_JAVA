package Day29_WrapperClasses_1;

public class WrapperClass_Example {
    public static void main(String[] args) {
        Integer intAbc = 127;
        Integer intXyz = 127;
        Integer intA = Integer.valueOf(12345);
        Integer intB = new Integer(12345);

        int abc = 12345;
        int xyz = 12345;

        System.out.println("(abc == xyz) = " + (abc == xyz));
        System.out.println("(intAbc == intXyz) = " + (intAbc == intXyz)); //-128 .... 127 integer caching mechanism özelliği gereği == kullanılabilir.

        System.out.println("(intA.equals(intB)) = " + (intA.equals(intB))); //.equals()

        Double dblAbc = 12.0;
        Double dblXyz = 12.0;

        System.out.println("(dblAbc==dblXyz) = " + (dblAbc == dblXyz)); //Double da caching mekanızması olmadığından == ile yapılan karşılaştırma sonucu false olacaktır.

        System.out.println("dblAbc.equals(dblXyz) = " + dblAbc.equals(dblXyz));

    }
}
