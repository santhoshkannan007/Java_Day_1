import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark Subject 1: ");
        int m1 = sc.nextInt();

        System.out.println("Enter mark for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.println("Enter mark for Subject 3: ");
        int m3 = sc.nextInt();

        int t = m1 + m2 + m3;
        double avg = (m1 + m2 + m3) / 3.0;

        System.out.println("Total marks:" + t);

        System.out.println("Average marks:" + avg);

        if (avg > 50) {
            System.out.println("The Student is Passed!");
        } else {
            System.out.println("The Student Not Passed!");
        }
    }
}
