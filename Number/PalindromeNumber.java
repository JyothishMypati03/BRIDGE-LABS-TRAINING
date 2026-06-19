package LAB.Number;
import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scan = new Scanner(System.in);
				
				int n = scan.nextInt();
				
				int o = n;
				
				int r = 0;
				
				while(n > 0) {
					
					int digit = n%10;
					
					r = r*10 + digit;
					
					n = n/10;
					
				}
				
				
				if(o == r) {
					
					
					System.out.println("yes");
				}else {
					
					
					System.out.print("no");
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
