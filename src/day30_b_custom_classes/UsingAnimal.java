package day30_b_custom_classes;

// Runner Class
public class UsingAnimal {
    public static void main(String[] args) {

        // Object Reference  = Object
        Animal animal1 = new Animal();

        System.out.println(animal1.population);
        System.out.println(animal1.species);

        System.out.println();
        System.out.println( new Animal().population );
        System.out.println( new Animal().species );    // this object is not same as the one above


        animal1.species = "Bird";
        animal1.population = 1000000;

        System.out.println();
        System.out.println(animal1.species);
        System.out.println(animal1.population);


        System.out.println();
        // If this method is NOT declared and you print your object directly, it will show memory location
        // day30_b_custom_classes.Animal@30f39991
        // System.out.println(animal1);


        System.out.println("***********************");
        System.out.println(animal1.toString());
        System.out.println(animal1); // this will call .toString(); method

        System.out.println();
        Animal animal2 = new Animal();
        System.out.println(animal2);








    }
}