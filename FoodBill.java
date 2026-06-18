import java.util.Scanner;

public class FoodBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Food Price: ");
        double food_price = sc.nextDouble();

        final double GST = 0.05;
        final double SR = 0.10;

        double gst_amount = food_price * GST;
        double service_charge = food_price * SR;

        double total_price = food_price + gst_amount + service_charge;

        System.out.println("GST Amount =" + gst_amount);
        System.out.println("Service Charge =" + service_charge);
        System.out.println("Total Price =" + total_price);
    }
}
