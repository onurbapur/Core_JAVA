package Day21_MemoryManGarbageCol;

public class StringHeapError {
    public static void main(String[] args) {
        System.out.println("Heap out of memory");
        String str = new String();
        str ="Deneme heap";
        double dbl = 0.0;

        for (int i = 0; i < 1_000_000_000; i++) {
            str = str + str;
            System.out.println(str);
          //  str = "";
        }

      /*  for (int i = 0; i < 1_000_000_000; i++) {
            System.out.println(dbl = dbl + i);
        }

*/

    }
}
