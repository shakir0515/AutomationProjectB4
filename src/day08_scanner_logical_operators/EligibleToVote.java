package day08_scanner_logical_operators;
/*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote
        if they are a citizen,
        have no criminal background
        and are 18 years old or above 18

    print : $name is eligible to vote: $boolean

 */
public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isCriminal = false;
        int age = 30;

        boolean isEligible = isCitizen && !isCriminal && age > 18;

        System.out.println(name + " is eligible to vote: " + isEligible);


        System.out.println("---------------------------------");
        name = "James Bond";
        isCitizen = true;
        isCriminal = false;
        age = 18;

        isEligible = isCitizen && !isCriminal && age >= 18;

        System.out.println(name + " is eligible to vote: " + isEligible);
    }
}
