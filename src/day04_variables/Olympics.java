package day04_variables;
/*

 */
public class Olympics {
    /*
    Task
        create a variable for the year
        print the country and year for next couple events
        reassign year to value each time. Country name is hard coded

        data:
            China 2026
            France 2030
            Italy 2034
 Looking forward to the year $year for the Olympics to be in $location
     */
    public static void main(String[] args) {
        int year;
        year = 2027;
        System.out.println("China " + year);
        year +=  4;
        System.out.println("France " + year);
        year +=  4;
        System.out.println("Italy " + year);

    }
}
