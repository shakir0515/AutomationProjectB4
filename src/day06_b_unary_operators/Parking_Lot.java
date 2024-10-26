package day06_b_unary_operators;

public class Parking_Lot {

    public static void main(String[] args) {

        int carsInParkingLot = 10;
        System.out.println("2 cars drove into parking lot");
        carsInParkingLot = carsInParkingLot + 2;
        System.out.println("Cars in parking lot: " + carsInParkingLot);

        System.out.println("2 more cars drove into parking lot");
        carsInParkingLot++;
        carsInParkingLot++;
        // In this case, it does not matter, if it is POST or PRE, because they are written as a SINGLE statement
//        ++carsInParkingLot;
//        ++carsInParkingLot;
        System.out.println("Cars in parking lot: " + carsInParkingLot);

        System.out.println("5 cars left");
        carsInParkingLot = carsInParkingLot - 5;
        System.out.println("Cars in parking lot: " + carsInParkingLot);


        System.out.println("5 cars left");
        carsInParkingLot--;
        carsInParkingLot--;
        carsInParkingLot--;
        carsInParkingLot--;
        carsInParkingLot--;
        // In this case, it does not matter, if it is POST or PRE, because they are written as a SINGLE statement
//        --carsInParkingLot;
//        --carsInParkingLot;
//        --carsInParkingLot;
//        --carsInParkingLot;
//        --carsInParkingLot;
        System.out.println("Cars in parking lot: " + carsInParkingLot);


    }

}
