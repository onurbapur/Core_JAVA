package Day02_MyFirstProgram;

public class MyFirstProgram {
    public static void main(String[] args) {
        //Comment--> Kodlarımıza açıklama yazmak için kullanılır
        //Single line comment-tek satırlık yorum satırı
        //Tek satır açıklama yazmak için // sembolleri kullanılır.

        /* birden fazla satırdan oluşan yorum bloğu
        This is a multiline comment block
        This is a multiline comment block
        This is a multiline comment block
         */
        //Yorum satırları Java derleyicisi tarafından dikkate alınmazlar

        System.out.println("Hello Java.");
        System.out.println("Merhaba Java.");

        System.out.println(); //Ekrana boş bir satır yazar ve bir alt satıra geçerek satırbaşı yapar.

        System.out.println("This is my first program in Java.");
        System.out.println("Bu benim Java dilinde yazdığım ilk program.");

        //println ekrana yazma işleminden sonra bir sonraki satıra geçer ve satırbaşı yapar-Newline

        //Aşağıda println yerine print kullandığımızdan satırbaşı yapmadan aynı satıra  yazar.

        System.out.print("This line doesn't have newline. ");
        System.out.println("- this line too");

    }
}
