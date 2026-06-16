package LAB.Number;

import java.util.*;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int binary = scan.nextInt();

        int decimal = 0;
        int base = 1;

        while (binary > 0) {

            int digit = binary % 10;

            decimal = decimal + digit * base;

            base = base * 2;

            binary = binary / 10;
        }

        System.out.println(decimal);

        scan.close();
    }
}