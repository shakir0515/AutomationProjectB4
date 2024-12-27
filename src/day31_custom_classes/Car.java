package day31_custom_classes;
/*
    Create a class Car

    create instance variables:
    model, year, color, fuel level (percent number)

    create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true if the gas level is below 25
            otherwise return false

    Create a separate class to create Car objects and test the methods created
 */


// Template class
public class Car {
    // Instance variables - fields
    String model;
    int year;
    String color;
    double fuelLevel;

    public String toString() {
        return "Car Info: " +
                "\n\tModel: " + model +
                "\n\tColor: " + color +
                "\n\tYear: " + year +
                "\n\tFuel Level: " + fuelLevel;
    }


    public void drive (){
        System.out.println("driving " + model);
        fuelLevel -= 5;
    }

    public void fillTank () {
        System.out.println("filling tank");
        fuelLevel = 100; // reassign to 100
    }


    public boolean isFuelLevelLow () {
        return fuelLevel < 25; // 100 < 25
    }


}