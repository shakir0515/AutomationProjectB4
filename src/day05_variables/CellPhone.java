package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone 16";
        String color = "Matt Black";
        double price = 999.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I just bought " + model + " from " + brand);
        System.out.println("It is in the color of $color and it has $storage GB");
        System.out.println("It is in the color of " + color + " and it has " + storage + "GB");
        System.out.println("It has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price);

        System.out.println("I just bought " + model + " from " + brand + "\nIt is in the color of $color and it has $storage GB" + "\nIt is in the color of " + color + " and it has " + storage + "GB" + "\nIt has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price);

        String fullMessage = "I just bought " + model + " from " + brand + "\nIt is in the color of $color and it has $storage GB" + "\nIt is in the color of " + color + " and it has " + storage + "GB" + "\nIt has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price;

        System.out.println(fullMessage);

    }
}
