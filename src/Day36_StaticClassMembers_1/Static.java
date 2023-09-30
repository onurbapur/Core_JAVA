package Day36_StaticClassMembers_1;

public class Static {
    static int staticNumber;//Belongs to class. And shared by any object created from class
    int nonStaticNumber; //Belongs to instance of class

    public static void main(String[] args) {
        System.out.println("Static members.");
        Static stcObj1 = new Static();
        Static stcObj2 = new Static();
        stcObj1.nonStaticNumber = 3456;
        stcObj2.nonStaticNumber = 23444;

        Static.staticNumber = 2000; //Static Data value which belongs to Class and common for all objects created from the class

        System.out.println("stcObj1.nonStaticNumber = " + stcObj1.nonStaticNumber);
        System.out.println("stcObj2.nonStaticNumber = " + stcObj2.nonStaticNumber);
        System.out.println("stcObj1.staticNumber = " + staticNumber);
        System.out.println("stcObj2.staticNumber = " + stcObj2.staticNumber);
    }
}


