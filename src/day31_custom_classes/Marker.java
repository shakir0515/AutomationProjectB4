package day31_custom_classes;
// Template class - set of instructions for Object of this class
public class Marker {

    // Instance variables
    String type;
    String brand;
    String color;


    // Make a constructor, so each time an object of this class is made we initialize these instance variables.
    public Marker (String inputType, String inputBrand, String inputColor){
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }


    public String toString() {
        return "Marker: " +
                "\n\tType: " + type +
                "\n\tBrand: " + brand  +
                "\n\tColor: " + color ;
    }
}