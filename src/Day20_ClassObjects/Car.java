package Day20_ClassObjects;

public class Car {
    //Data members-Properties-Fields- States
    String name;
    String model;
    String color;
    String engineType;
    String transmissionType;
    int numberOfDoors;
    static String factoryName;

    public void showInfo(){
        System.out.println("showInfo method called/invoked");
        System.out.println("------------------------------");
        System.out.println("Factory Name : " + factoryName);
        System.out.println("Name : " + name);
        System.out.println("Modeli : " + model);
        System.out.println("Color : " + color);
        System.out.println("Engine Type : " + engineType);
        System.out.println("Number of doors : " + numberOfDoors);
        System.out.println("Transmission Type : " + transmissionType);
        System.out.println("------------------------------");
    }
}

