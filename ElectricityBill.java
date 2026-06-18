import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double RATE_PER_UNIT = 7.5;

        System.out.println("Enter Units Consumed: ");
        int unitsConsumed = sc.nextInt();

        double billAmount = unitsConsumed * RATE_PER_UNIT;

        System.out.println("Total Bill Amount:" + billAmount);

    }
}
