package Day23_ReadingUserInput;

import java.util.Scanner;

public class InputParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int OkulNo;

        System.out.print("Lütfen okul numaranızı giriniz : ");
        OkulNo = Integer.parseInt(scanner.nextLine());

        System.out.print("Lütfen adınızı giriniz : ");
        name = scanner.nextLine();

        System.out.println("Adınız : " + name + " Okul numaranız : " + OkulNo);

        double abc = Double.parseDouble("1242342.65565");
        System.out.println(abc);
}
}
