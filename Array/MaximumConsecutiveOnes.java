package LAB.Array;
import java.util.*;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [] arr = new int [n];
		
		for(int i=0; i<n; i++) {
			
			
			arr[i] = scan.nextInt();
			
		}
		
		
		
		int count =0;
		
		for(int i=0; i<n; i++) {
			
			
			if(arr[i] == 1) {
				
				
				count++;
			}else {
				
				count = 0 ;
			}
			
		}
		
		System.out.print(count);
		

	}

}
