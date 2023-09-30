package Day19_MethodOverloading;

public class LastDigit {
    public static boolean lastDigit(int a, int b){
        if (a % 10 == b % 10){
            return true;
        }else return false;
    }

    //Metodun Daha sade yazılmış hali
    public static boolean lastDigit_ABC(int a, int b){
        return (a % 10 == b % 10);
    }


    public static void main(String[] args) {
        System.out.println(lastDigit(12231345,21412425));
        System.out.println(lastDigit(1223,21412425));

        System.out.println("-------------------");
        System.out.println(lastDigit_ABC(12231345,21412425));
        System.out.println(lastDigit_ABC(1223,21412425));

    }
}
