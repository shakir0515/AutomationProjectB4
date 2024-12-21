package day30_b_custom_classes;

// This is my runner - main() -  execution starts from there.
public class UsingApp {
    public static void main(String[] args) {

        //System.out.println(name); // NOT VALID

        // Create an object of App class called application1
        // Object reference = actual object
        App application1 = new App();
        // application1 has its own copy "name", "version", "isFree" instance variables.


        App application2 = new App();
        // application2 has its own copy "name", "version", "isFree" instance variables.


        application1.name = "loopcamp";
        application1.version = 4.0;
        application1.isFree = true;

        System.out.println(application1.version); //4.0
        System.out.println(application2.version); // default value: 0.0


        // App.run();  // Since .run() is instance method, we cannot call it by Class name
        application1.run();
        application2.run();

        application2.name = "Excell";
        application2.version = 23.5;
        application2.isFree = false;
        application2.run();

        System.out.println("----------------");

        System.out.println(application1.version);
        System.out.println(application2.version);

        System.out.println();
        application1.update();
        System.out.println(application1.version);

        application2.update();
        System.out.println(application2.version);







    }

}