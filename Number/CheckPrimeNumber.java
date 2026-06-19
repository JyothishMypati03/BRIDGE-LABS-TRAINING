package LAB.Number;
import java.util.*;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		boolean check = true;
		
		if(n < 2 ) {
			
			check = false;
			
		}
		
		for(int i=2; i*i<=n ; i++) {
			
			if(n%i==0) {
				
				check = false;
				
			}
			
			
		}
		
		if(check) {
			
			System.out.print("true");
			
		}else {
			
			System.out.print("false");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
