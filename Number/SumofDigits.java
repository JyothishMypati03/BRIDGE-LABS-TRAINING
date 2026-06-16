package LAB.Number;
import java.util.*;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();		
		
		int s = 0;
		
		while( n > 0) {
			
			s = s + n%10;
			n = n/10;
			
		}
		
		System.out.print(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
