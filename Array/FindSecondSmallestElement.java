package LAB.Array;
import java.util.*;

public class FindSecondSmallestElement {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			
			
			int n = scan.nextInt();
			
			
			int []  arr = new int [n];
			
			for(int i=0; i<n; i++) {
				
				arr[i] = scan.nextInt();
				
			}
			
			int sm1 = Integer.MAX_VALUE;
			
			int sm2 = Integer.MAX_VALUE;
			
			for(int i=0; i<n; i++) {
				
				if(arr[i] < sm1) {
					
					sm1 = arr[i];
				}
				
			}
			
			for(int i=0; i<n; i++) {
				
				
				if(arr[i] < sm2 && arr[i] > sm1) {
					
					sm2 = arr[i];
					
				}
				
			}
			
			
			System.out.print(sm2);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
