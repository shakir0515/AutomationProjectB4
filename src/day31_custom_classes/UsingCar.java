package day31_custom_classes;
// Runner class
public class UsingCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);

        // model is instance variable, caNOT call by class name
        // Car.model = "Tesla";

        car1.model = "Tesla";
        car1.year = 2024;
        car1.color = "Silver";
        car1.fuelLevel = 50;

        System.out.println();
        System.out.println(car1);

        System.out.println();
        car1.drive(); // 50 - 5 = 45
        car1.drive(); // 45 - 5 = 40
        System.out.println(car1.fuelLevel); // 40


        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuelLevel); // 100

        System.out.println();
        System.out.println(car1);

        System.out.println();
        System.out.println( car1.isFuelLevelLow() );

    }
}