package Day33_Constructor_2;

public class Employee {
    String name;
    int age;
    int salary;

    Employee(){
        this("Ahmet Falanca");
        System.out.println("Default constructor.");
    }
    Employee(String name){
        this(35);
        System.out.println("Name constructor called.");
        this.name = name;
    }
    Employee(int age){
        System.out.println("Age constructor called.");
        this.age = age;
    }

    Employee(String name, int salary){
        System.out.println("Name and salary constructor called.");
        this.name = name;
        this.salary = salary;
    }

public void passingObject(Employee isci){
    System.out.println("Passing object as argument example.");
    System.out.println("------------------------------------");
    System.out.println("employee.name = " + isci.name);
    System.out.println("employee.age = " + isci.age);
    System.out.println("employee.salary = " + isci.salary);
    System.out.println();
}

public void showInfo(){
    System.out.println("Name : " + this.name);
    System.out.println("Age : " + this.age);
    System.out.println("Salary : " + this.salary);
}
}
