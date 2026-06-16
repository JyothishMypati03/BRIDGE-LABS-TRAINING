package LAB.Number;
import java.util.*;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;

            n /= 10;
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }

        scan.close();
    }
}