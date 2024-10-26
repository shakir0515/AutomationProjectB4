package day04_variables;

public class Fruits {
    public static void main(String[] args) {
        //class name has match file name

        // Have 3 containers and each container will have "x number" of apples, grapes and bananas --> go with int
        // Have 3 containers and each container will have "x price worth" of apples, grapes and bananas --> go with double

        int apples = 60;
        int grapes = 80;
        int bananas = 100;

        // println statement
        // "" --> in double quotes I have values which is String
        // +  --> CONCATENATION / plus (math)
        // 60 --> value which is whole number by default its int

        System.out.println("This is how many apples I have: " + 60); // The value 60 ---> HARDCODED

        System.out.println("This is how many apples I have: " + apples); // The apples is a variable ---> DYNAMICALLY

        System.out.println(grapes);                 //grapes.sout
        System.out.println("Grapes: " + grapes);    //grape.soutv

        System.out.println("Bananas: " + bananas);

        System.out.println("-------------------------------");

        // REASSIGNMENT
        // I sold 30 apples
        System.out.println("I sold 30 apples");
        apples = 40; // Reassign a variable called apples to the new value which is 40
        System.out.println("This is how many apples I have after the sale: " + apples);

        System.out.println("-------------------------------");

        double price = 15.99;
        // "" --> String
        // +  --> Concatenation
        // "" --> String
        System.out.println("The discounted price for all the left over apples is $" + "15.99");     // 15.99 --> HARDCODED
        System.out.println("The discounted price for all the left over apples is $" + price);       // price --> DYNAMIC

        System.out.println("-------------------------------");
        // CONCATENATION vs PLUS (math)
        System.out.println(50+50);      // --> PLUS             --> 100
        System.out.println("50" + 50);  // --> CONCATENATION    --> 5050

        System.out.println(10 + 10 + "10" + 10 + 10);
                        //int + int + STRING + int + int
                            //int  + STRING + int + int -->> 20 + "10" + 10 + 10
                                // STRING + int + int   -->> "2010" + 10 + 10
                                   // STRING + int      -->> "201010" + 10
                                        // STRING       -->> "20101010"
        System.out.println("10" + 10 + "10" + 10 + 10);
        // After first String --- > Evering becomes String --> EVERYTHING IS A CONCATINATION

        System.out.println(10 + "Apple" + 10 + " " + 10);

    }
}
