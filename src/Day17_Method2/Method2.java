package Day17_Method2;

public class Method2 {

    public static int sayiTopla(int abc, int xyz){
        return abc + xyz;
    }

    public static void main(String[] args) {
        System.out.println("Methods-2 in Java ");
       int sum = sayiTopla(12,56);
        System.out.println("toplam = " + sum);

        System.out.println(sayiTopla(34,89));
    }
}
