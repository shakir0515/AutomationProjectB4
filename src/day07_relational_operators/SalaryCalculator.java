package day07_relational_operators;

/*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */

public class SalaryCalculator {

    public static void main (String [] args) {

        double baseSalary = 100_000.00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTaxAmount, federalTaxAmount, totalTaxAmount, salaryAfterTax;



        stateTaxAmount = baseSalary * stateTaxRate; // Arithmetic operator applied to ge the result and assign it into "stateTaxAmount" variable.
        federalTaxAmount = baseSalary * federalTaxRate;
        totalTaxAmount = stateTaxAmount + federalTaxAmount;
        salaryAfterTax = baseSalary - totalTaxAmount;

        String taxReport = "Tax Info: \n\tBase Salary: \t\t$" + baseSalary + "\n\tState Tax Rate: \t" + stateTaxRate + "\n\tFederal Tax Rate: \t" + federalTaxRate + "\n\t------------------------------\n\tAfter Tax: \t\t\t$" + salaryAfterTax;

        System.out.println(taxReport);


    }

}
