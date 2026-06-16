package LAB.Number;

import java.util.*;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int square = n * n;
        int temp = n;

        while (temp > 0) {

            if (temp % 10 != square % 10) {
                System.out.println("Not Automorphic Number");
                return;
            }

            temp /= 10;
            square /= 10;
        }

        System.out.println("Automorphic Number");

        scan.close();
    }
}