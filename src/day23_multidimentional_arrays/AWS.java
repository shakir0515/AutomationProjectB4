package day23_multidimentional_arrays;

// Printout this format for each zone
// $app is deploying on $zone

public class AWS {
    public static void main(String[] args) {
        String applicationName = "loopcamp";
        String zone = "us-east1, us-west1, us-north1, us-south1";

        String [] zoneArr = zone.split(", "); // ["us-east1", .... "us-south1"]

        for ( String eachZone : zoneArr){
            System.out.println(applicationName + " is deploying on " + eachZone);
        }

        System.out.println();

        for (int i = 0; i < zoneArr.length; i++) {
            System.out.println(applicationName + " is deploying on " + zoneArr[i]);
        }


    }
}