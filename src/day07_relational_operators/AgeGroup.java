package day07_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {

        int ageOfPerson = 34;
       boolean isKid = ageOfPerson <= 13;
       boolean isSenior = ageOfPerson >= 65;

        System.out.println("The person is Kid: " + isKid);
        System.out.println("The person is Senior: " + isSenior);


    }
}
