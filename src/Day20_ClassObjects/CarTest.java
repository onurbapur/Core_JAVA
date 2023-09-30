package Day20_ClassObjects;

public class CarTest {
    public static void main(String[] args) {
        Car.factoryName = "Turkiye"; //

        Car mercedes = new Car();
        mercedes.name ="Mercedes";
        mercedes.model = "SLK 200";
        mercedes.engineType = "Electric";
        mercedes.numberOfDoors = 2;
        mercedes.color = "Silver";
        mercedes.transmissionType = "Manuel";

        mercedes.showInfo();

        Car honda = new Car();
        honda.name = "Honda";
        honda.numberOfDoors = 4;
        honda.color = "Black";
        honda.engineType = "Diesel";
        honda.model = "Civic";
        honda.transmissionType = "Automatic";

        honda.showInfo();

    }
}
