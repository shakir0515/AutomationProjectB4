package day06_b_unary_operators;

public class Store {
    public static void main(String [] args){

        String store = "Costco";
        int numberOfTv = 100;

        System.out.println("Someone came into the store and they bought a TV");
        //numberOfTv = numberOfTv - 1;
        //System.out.println("Number of TV in stock: " + numberOfTv );
        System.out.println("Number of TV in stock: " + --numberOfTv );

        System.out.println("Another one bought the same TV");
        System.out.println("Number of TV in stock: " + --numberOfTv);

        System.out.println("Someone else came into the store and out the into the Shopping Cart but have not paid yet");
        System.out.println("Number of TV ins stock (in computer): " + numberOfTv--);
        System.out.println("Person actually now paid for it.");
        System.out.println("Number of TV ins stock (in computer): " + numberOfTv);

        System.out.println("More of the same TV came into stock");
        numberOfTv = numberOfTv + 15;
        System.out.println("Num of TV in stock: " + numberOfTv);


    }
}
