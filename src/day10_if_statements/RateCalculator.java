package day10_if_statements;
/*
    write a program for a rate calculator: RateCalculator
        1. asks the user to enter an  annual salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
 */
// Since the Scanner class is in a different package, to be able to use it, I need import it.
import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double salary;
        int hoursPerWeek;
        double hourlyRate;

        System.out.print("Please, enter your annual salary: $");
        salary = keyboard.nextDouble();

        System.out.print("How many hours he/she works in a week: ");
        hoursPerWeek = keyboard.nextInt();

        // 1st. need to know how many hours working in a year. -- > hoursPerWeek * 52 (weeks in a year)
        hourlyRate = salary / (hoursPerWeek * 52);

        System.out.println("My annual salary is $" + salary + "\n\tWork hours per week: " + hoursPerWeek + "\n\tHourly Rate $" + hourlyRate);

    }
}
