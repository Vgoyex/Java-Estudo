import java.util.Locale;
import util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double radius = 2.0;
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        System.out.printf("PI: %.2f\n", Calculator.PI);
        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f", v);
    }

}