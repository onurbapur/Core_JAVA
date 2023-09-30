package Day36_StaticClassMembers_1;

public class StaticBlocks {
    static int number;
    static {
        System.out.println("Static variable number = " + number);
        System.out.println("Birinci Statik blok çalıştı.");
    }

    StaticBlocks(){
        System.out.println("Constructor çalıştı.");
    }

    {//instance block
        System.out.println("Non-static blok çalıştı");
    }

    static {
        System.out.println("İkinci statik blok çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main methodu çalıştı.");
        StaticBlocks stcBlok = new StaticBlocks();
    }

}
