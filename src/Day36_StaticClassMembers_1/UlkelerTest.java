package Day36_StaticClassMembers_1;

public class UlkelerTest {
    int number;
    static int stcNumber;

    public void method(){
        System.out.println("Bir method");
    }
    public String method1(){
        return "Method1";
    }

    public static void stcMethod(){
        System.out.println("Static method çağrıldı.");
    }
    public static void main(String[] args) {
       // Ulkeler ulke2 = new Ulkeler(); Default Const. private access olduğundan hata verir
        Ulkeler ulke1 = new Ulkeler("ABD");
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);


        UlkelerTest ulktst = new UlkelerTest();

        ulktst.number = 1000;
        ulktst.method();
        System.out.println("ulktst.method1() = " + ulktst.method1());

        stcNumber = 100;
        stcMethod();
        UlkelerTest.stcMethod();
    }
}
