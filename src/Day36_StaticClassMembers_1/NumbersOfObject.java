package Day36_StaticClassMembers_1;

public class NumbersOfObject {
    static int olusturulanNesneSayisi = 0; //Hold the number of created object
    int number = 0 ;//Belongs to object(instance of class).

    NumbersOfObject(){
        olusturulanNesneSayisi++;
        number++;
    }

    public static void main(String[] args) {
        NumbersOfObject obj1 = new NumbersOfObject();
        NumbersOfObject obj2 = new NumbersOfObject();
        NumbersOfObject obj3 = new NumbersOfObject();
        NumbersOfObject obj4 = new NumbersOfObject();
        NumbersOfObject obj5 = new NumbersOfObject();

        System.out.println("NumbersOfObject.olusturulanNesneSayisi = " + NumbersOfObject.olusturulanNesneSayisi);
        System.out.println("obj1.number = " + obj1.number);
        System.out.println("obj2.number = " + obj2.number);
        System.out.println("obj3.number = " + obj3.number);
        System.out.println("obj4.number = " + obj4.number);
        System.out.println("obj5.number = " + obj5.number);

        System.out.println("obj1.olusturulanNesneSayisi = " + obj1.olusturulanNesneSayisi);
        System.out.println("obj2.olusturulanNesneSayisi = " + obj2.olusturulanNesneSayisi);
    }
}
