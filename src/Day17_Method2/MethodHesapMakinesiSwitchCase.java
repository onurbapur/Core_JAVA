package Day17_Method2;

public class MethodHesapMakinesiSwitchCase {
    public static double hesapMakinesi(double sayi1, double sayi2 , char islem){
        switch (islem){
            case '+':
                return sayi1 + sayi2;
            case '-':
                return sayi1 - sayi2;
            case '*':
                return sayi1 * sayi2;
            case '/':
                return sayi1 / sayi2;
            default:
                System.out.println("*********************");
                System.out.println("Tanımsız bir operatör!");
                return 0;
        }
    }
    public static void ekranaYaz(String yaz){
        System.out.println("------------------------------------------");
        System.out.println("--- " + yaz + " ---");
        System.out.println("------------------------------------------");
    }
    public static void main(String[] args) {
        ekranaYaz("Merhaba ben bir hesap makinesiyim.");
        System.out.println("hesapMakinesi(10,50,'+') = " + hesapMakinesi(10, 50, '+'));
        System.out.println("hesapMakinesi(34,56,'*') = " + hesapMakinesi(34, 56, '*'));
        System.out.println("hesapMakinesi(0,10,'/') = " + hesapMakinesi(0, 10, '/'));
        System.out.println("hesapMakinesi(10,0,'/') = " + hesapMakinesi(10, 0, '/'));

        System.out.println("hesapMakinesi(34,45,'d') = " + hesapMakinesi(34, 45, 'd'));
    }

}
