package day09_a_scanner;

public class OrExample {
    public static void main(String[] args) {

        // || && - > logical operators

        int apple = 5;
        int orange = 7;
        System.out.println(apple >3 || orange < 5);

        System.out.println(apple > 3 || orange < 5);
        // || ---- > short circuit operator
        //                  true || true -- > true  ---- > compiler NOT executes the 2nd part
        //                  true || false - > true  ---- > compiler NOT executes the 2nd part
        // ONLY             false || false  > false ---- > compiler executes the 2nd part
        //                  false || true   > true  ---- > compiler executes the 2nd part


        // Q: I do not care what the 1st expression (1st part / left side) is, I want to execute 2nd pat.
        // A: Then, I use single OR operator
        System.out.println(apple > 3 | orange < 5);

    }
}
