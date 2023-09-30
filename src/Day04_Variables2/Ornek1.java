package Day04_Variables2;

public class Ornek1 {
    public static void main(String[] args) {
        int vize1 , vize2, finalNotu;
        int sinifGecmeNotu;
        float sinifGecmeNotuFloat;

        vize1 = 55;
        vize2 = 75;
        finalNotu = 73;
        //sinifGecmeNotu = (vize1 + vize2 + finalNotu) / 3

        sinifGecmeNotu = (vize1 + vize2 + finalNotu) / 3;
        sinifGecmeNotuFloat = (vize1 + vize2 + finalNotu) / 3.0f; //Bölen sayıyı float tipinde yazdık. Böylelikle sonuç float olmuş oldu.

        System.out.println("1. Vize notu = " + vize1);
        System.out.println("2. Vize notu = " + vize2);
        System.out.println("Final notu = " + finalNotu);
        System.out.println("------------------");
        System.out.println("Sınıf geçme notu(int) = " + sinifGecmeNotu);
        System.out.println("Sınıf geçme notu(float) = " + sinifGecmeNotuFloat);

        int tamSayi = 20; //Bir tam sayının bir tam sayıya bÖlÜmÜ tam sayıdır.
        System.out.println(tamSayi / 3);
    }
}
