package Day21_MemoryManGarbageCol;

public class StackOverFlow {

    public static void print(int myInt) {
        System.out.println(myInt);
        print(myInt);
    }

    public static void main(String[] args) {
        print(100);
    }
}
