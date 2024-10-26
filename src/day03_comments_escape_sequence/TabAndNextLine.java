package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        // In programming, indentation refers to the spaces or tabs at the beginning of a line of code. It is used to visually group and organize the code, making it more readable and easier to understand.
        // Command + A to select everything
        // Escape Sequence
        System.out.println("A Sentence"); // has no space at the beginning
        System.out.println(" A Sentence"); // has 1 space at the beginning
        System.out.println("  A Sentence"); // has 2 space at the beginning
        System.out.println("   A Sentence"); // has 3 space at the beginning
        System.out.println("    A Sentence"); // has 4 space at the beginning

        // Now, I will use tab to do 4 spaces at one ---> \t ---> 4 spaces
        System.out.println("\tA Sentence");

        //Let put 2 tabs
        System.out.println("        A Sentence");
        System.out.println("\t\tA Sentence");

        System.out.println();

        // This is explaining New Line
        System.out.println("1) Unlock the car door");
        System.out.println("2) Get into the car");
        System.out.println("3) Start the car");

        System.out.println();
        System.out.println("1) Unlock the car door\n2) Get into the car\n3) Start the car");

        System.out.println("Week Days: Monday Tuesday Wednesday Thursday Friday Saturday Sunday");
        /*
        Week Days:
            Monday
            Tuesday
            -
            -
            Sunday
         */
        System.out.println("Week Days:\n\tMonday\n\tTuesday\n\tWednesday\n\tThursday\n\tFriday\n\tSaturday\n\t");
    }
}
