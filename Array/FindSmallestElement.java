package LAB.Array;
import java.util.*;

public class FindSmallestElement {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			int []  arr = new int [n];
			
			for(int i=0; i<n ; i++) {
				
				arr[i] = scan.nextInt();
				
			}
		
			
			int small = Integer.MAX_VALUE;
			
			for(int i=0; i<n; i++) {
				
				if(arr[i] < small) {
					
					small = arr[i];
					
				}
				
				
			}
			
			System.out.print(small);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
