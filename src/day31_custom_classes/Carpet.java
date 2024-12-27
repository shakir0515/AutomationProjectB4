package day31_custom_classes;
// Template class - set of instaction for the object of this class
public class Carpet {
    // Instance variables
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;


    // Create constructor that initialize these instance variables
    public Carpet (double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian) {


        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputIsPersian;
        calculateTotalPrice();

    }

    public void calculateTotalPrice () {
        totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }


    @Override
    public String toString() {
        return "Carpet Info:" +
                "\n\tWidth: " + width +
                "\n\tLength: " + length +
                "\n\tUnit Price: $" + unitPrice +
                "\n\tTotal Price: $"  + totalPrice +
                "\n\tIs Persian: " + isPersian;
    }
}
