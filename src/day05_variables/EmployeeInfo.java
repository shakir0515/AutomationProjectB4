package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle;
        char gender, suite;
        int age, numPTO;
        boolean isFullTime, isMarried;
        double salary;

        firstName = "Tom";
        lastName = "Jerry";

        companyName = "Loopcamp";
        jobTitle = "SDET";
        age = 30;
        numPTO = 21;
        salary = 120_000.00;
        isFullTime = true;
        isMarried = false;
        gender = 'M';
        suite = 'A';

        String fullReport = "Full Report:\n\tFirst Name: \t" + firstName + "\n\tLast Name: \t\t" + lastName + "\n\tCompany name: \t" + companyName + "\n\tJob Title: \t\t" + jobTitle + "\n\tAge: \t\t\t" + age + "\n\tPTO Amount: \t" + numPTO + "\n\tSalary: \t\t$" + salary + "\n\tIs Full Time?\t" + isFullTime + "\n\tIs Married\t\t" + isMarried + "\n\tGender: \t\t" + gender + "\n\tSuite: \t\t\t" + suite;

        System.out.println(fullReport);

        /*
        Full Report:
            First name:     Tom
            Last Name:      Jerry
            Company Name:   Loopcamp
            Job Title:      SDET
            Age:            30
            PTP:            21
            Salary          $120000.00
            Is FUll Time?   True
            Is Married      False
            Gender:         M
            Suite           A
         */
        System.out.println();
        System.out.println(fullReport);




    }
}
