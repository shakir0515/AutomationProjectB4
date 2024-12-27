package day31_custom_classes;
// Runner Class
public class UseMarker {
    public static void main(String[] args) {
        /*
        Marker marker1 = new Marker();
        marker1.type = "Shiny";
        marker1.brand = "Sharpie";
        marker1.color = "Blue";
         */



        Marker marker1 = new Marker("Shiny", "Sharpie", "Blue");
        System.out.println(marker1);


        System.out.println();
        Marker marker2 = new Marker("Oil Color", "Expo", "Green");
        System.out.println(marker2);

    }
}