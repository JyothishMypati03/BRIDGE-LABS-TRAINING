package LAB.Number;
import java.util.*;

public class FindSingleNumberUsingXOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= sc.nextInt();
        }

        System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
