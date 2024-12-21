package day30_b_custom_classes;
// Template Class
public class Item {

    // Instance variables
    String name;
    double price;


    // Special Instance method
    public String toString () {
        String message = "Item: " +
                "\n\tItem Name: " + name +
                "\n\tItem Price: $" + price;

        return message;
    }



}