package Day06_CastOprs;

public class Ornek3 {

    public static void main(String[] args) {
        int big = 1234567886;
        double approx = big;
        System.out.println(big - (int)approx);
        // The comment below is no typo.
        // \u000d System.out.println("This Comment Executed!");
        byte b = 70;

        //type casting int to byte
        b = (byte)(b * 2);
        System.out.println(b);
        System.out.println('\u33A0');

    }
}

