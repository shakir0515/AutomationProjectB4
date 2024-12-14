package day26_methods;
import java.security.PublicKey;
public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        // Picture.draw(6);

        Picture.draw("blue");

        Picture.draw("red", "yellow");
        Picture.draw("black", "white", "pink");

        Picture.draw(3, "Purple");
        Picture.draw("Green", 5);

        Picture.draw(7);
        Picture.draw(true);
        Picture.draw(49.99);

    }



}