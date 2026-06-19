package LAB.Number;
import java.util.*;

public class FindGCD {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF = " + a);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
