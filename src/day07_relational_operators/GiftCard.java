package day07_relational_operators;
/*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
            buy item 1 for x price and subtract from your gift card
            buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

 */
public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200; // Type Conversion -- > AUTO CASTING (IMPLICITLY) -- > WIDENING CONVERSION
        double item1 = 10;
        double item2 = 25.9;

        System.out.println("I have $" + giftCard + " balance in my gift card.");
        System.out.println("I bought a cup for $" + item1 );

        //giftCard = giftCard - item1;
        giftCard -= item1;
        System.out.println("After purchasing the cup, I have $" + giftCard + " balance");
        // We can do the code below as well, to combine two statements into one
        //System.out.println("After purchasing the cup, I have $" + (giftCard -= item1) + " balance");

        System.out.println("I bought a T-Shirt for $" + item2);
        System.out.println("After purchasing the T-Shirt, I have $" + (giftCard -= item2) + " balance" );

    }
}
