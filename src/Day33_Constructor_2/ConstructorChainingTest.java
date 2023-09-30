package Day33_Constructor_2;

public class ConstructorChainingTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee("Mehmet Yılmaz",4500);

        emp1.showInfo();
        System.out.println();
        emp2.showInfo();
        System.out.println();
        emp3.showInfo();
        System.out.println();
        emp4.showInfo();
        System.out.println();
        emp4.passingObject(emp4);//passing object as argument to method

        System.out.println("emp3.name = " + emp3.name);

    }
}
