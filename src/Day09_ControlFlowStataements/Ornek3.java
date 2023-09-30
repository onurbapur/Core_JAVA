package Day09_ControlFlowStataements;

public class Ornek3 {
    public static void main(String[] args) {

        double salary = 100;
        int hours = 42;
        final int maxHours = 70;

        System.out.println("Maaş = " + salary);

        if (hours < maxHours) {

            if ((hours > 38) && (hours <= 50)) {
                salary = salary * 1.5;
                System.out.println("Zamlı maaş = " + salary);
            }
            if (hours > 50) {
                salary = salary * 2;
                System.out.println("Zamlı maaş = " + salary);
            }
        }
    }
}

