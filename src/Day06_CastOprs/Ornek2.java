package Day06_CastOprs;

public class Ornek2 {
    public static void main(String[] args) {

        char myChar; //65535 büyüklüğünde değer alabilir
        myChar = 'A';
        System.out.println(myChar);

        myChar = 67;
        System.out.println(myChar);

        myChar = (char) (66 + 65535); // It prints 'A'
        System.out.println(myChar);

        System.out.println((int)(7.8 + (double) 15/2));
        System.out.println((double) (7/2));
        System.out.println((double) (7)/2);
        System.out.println(7.0 / 2);

    }

}
