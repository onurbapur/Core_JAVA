package Day09_ControlFlowStataements;

public class Ornek2 {
    //Write an if statement that multiplies salary by 1.5 if hours is greater than 38
    public static void main(String[] args) {
        double salary = 100;
        int hours = 100;

        System.out.println("Maaş = " + salary);

         //    true && true ---> true
        // hours=51 için
        //    true     &&     false ---> false
        if((hours > 38) && (hours <= 50)){
           salary = salary * 1.5;
           System.out.println("Zamlı maaş = " + salary);
        }

        if(hours > 50){
            salary = salary * 2;
            System.out.println("Zamlı maaş = " + salary);
        }

    }


}
