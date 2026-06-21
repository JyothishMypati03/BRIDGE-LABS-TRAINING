package LogicalPrograms;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    static int generateRandom(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    static int collectCoupons(int n) {
        HashSet<Integer> coupons = new HashSet<>();
        int count = 0;

        while (coupons.size() < n) {
            int coupon = generateRandom(n);
            coupons.add(coupon);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        int total = collectCoupons(n);

        System.out.println("Total random numbers needed: " + total);

        sc.close();
    }

}
