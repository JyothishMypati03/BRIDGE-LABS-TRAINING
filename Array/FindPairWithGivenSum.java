package LAB.Array;
import java.util.*;

public class FindPairWithGivenSum {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt();
		
		int []  arr = new int [n];
		
		for(int i=0; i<arr.length; i++) {
			
			
			arr[i] = scan.nextInt();
			
		}
		
		int t = scan.nextInt();
		
		
		for(int i=0; i<n-1; i++) {
			boolean found = false ;
			
			for(int j=i+1; j<n; j++) {
				
				if(arr[i] + arr[j] == t) {
					
					System.out.println(arr[i]);
					System.out.println(arr[j]);
					found = true;
					break;
					
					
				}
				
			}
			
			if(found) {
				
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
