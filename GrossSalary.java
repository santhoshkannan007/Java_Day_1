import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        final double DA_RATE = 0.20;
        final double HRA_RATE = 0.10;

        double DA = salary * DA_RATE;
        double HRA = salary * HRA_RATE;

        double gross_salary = salary + DA + HRA;

        System.out.println("DRA =" + DA);
        System.out.println("HRA RATE =" + HRA);
        System.out.println("Gross Salary =" +gross_salary);
    }
}
