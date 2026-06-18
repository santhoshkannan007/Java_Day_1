import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Distance in Kilometers: ");
        double km = sc.nextDouble();

        double meters = km * 1000;

        double cm = meters * 100;

        System.out.println("Total Meter =" + meters);
        System.out.println("Total Centimeters =" + cm);

    }
}
