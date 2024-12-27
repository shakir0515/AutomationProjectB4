package day31_custom_classes;
// Runner class - main method
public class UseCarpet {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(4.5, 10.5, 99.90, true);

        System.out.println(carpet1);
        // carpet1.calculateTotalPrice();

        System.out.println();
        System.out.println(carpet1);

        System.out.println();
        Carpet carpet2 = new Carpet(10, 20, 2.5, false);
        System.out.println(carpet2);
    }
}