package LAB.Number;
import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String binary = "";

        while (n > 0) {

            binary = (n % 2) + binary;
            n = n / 2;
        }

        System.out.println(binary);

        scan.close();
    }
}