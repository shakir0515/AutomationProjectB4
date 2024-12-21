package day30_b_custom_classes;
// Runner Class
public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();

        item1.name = "Orange";
        item1.price = 2.99;


        // If there is NO .toString(), will get --- > day30_b_custom_classes.Item@30f39991
        System.out.println(item1);


        System.out.println();
        System.out.println(new Item());


        System.out.println();
        Item item2 = new Item();
        System.out.println(item2);


        System.out.println();
        System.out.println(item2.toString()); // I can use it this way But no need to ONLY .toString()



    }
}