package Day21_MemoryManGarbageCol;

public class GCTest {
    String name;
    int age;
    static int count; //how many times garbage collector has worked.

    public GCTest(){

    }
    public GCTest(String name){
        this.name = name;
    }

    //This method invoked when the garbage collector run.
    public void finalize(){
        count++;
        System.out.print(count);
        System.out.println(" -Garbage collector  çalıştı.");
    }
}
