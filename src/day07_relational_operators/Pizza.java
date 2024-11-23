package day07_relational_operators;
/*
    create a class Pizza
    add a main method
    declare and assign these variables:

       type of pizza,  the number of slices,  the number of people eating

    calculate how many full slices each person will get
    calculate how many slices are left over

    Sample print statement:

       We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */
public class Pizza {
    public static void main(String[] args) {

        //  type of pizza,  the number of slices,  the number of people eating
        String pizzaType = "Pepperoni";
        int numOfSlices = 20;
        int numOfPeople = 6;

        int slicesForEachPerson = numOfSlices / numOfPeople;
        // int slicesLeftOver = numOfSlices - (numOfPeople * slicesForEachPerson); // Another way to get the correct result
        int slicesLeftOver = numOfSlices % numOfPeople;


        String result = "We bought " + pizzaType + " pizza. It has " + numOfSlices + " slices. We are " + numOfPeople + " people and each of us will eat " + slicesForEachPerson + " slices and there will " + slicesLeftOver + " slices left over.";

        System.out.println(result);


    }
}
