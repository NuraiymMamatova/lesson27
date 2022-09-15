package HomeWork;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> sqrt = o -> {
            DecimalFormat decimalFormat = new DecimalFormat("#");
            return Double.valueOf(decimalFormat.format(Math.sqrt(o)));
        };
        System.out.println("Return number please ");
        System.out.println(sqrt.apply(scanner.nextDouble()));
    }


}








