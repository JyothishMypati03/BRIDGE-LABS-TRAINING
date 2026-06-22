package JUnitTesting;
import java.util.*;

public class BinaryConverter {

    public static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();

        for (int power = 31; power >= 0; power--) {
            int value = (int) Math.pow(2, power);

            if (n >= value) {
                binary.append("1");
                n -= value;
            } else {
                binary.append("0");
            }
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        System.out.println("32-bit Binary Representation:");
        System.out.println(toBinary(number));


    }

}
