package JUnitTesting;
import java.util.*;

public class MonthlyPayment {

    public static double monthlyPayment(double P, double Y, double R) {

        double n = 12 * Y;

        double r = R / (12 * 100);

        double payment =
                (P * r) /
                        (1 - Math.pow((1 + r), -n));

        return payment;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double P = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        double Y = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double R = sc.nextDouble();

        double emi = monthlyPayment(P, Y, R);

        System.out.printf("Monthly Payment = %.2f", emi);


    }

}
