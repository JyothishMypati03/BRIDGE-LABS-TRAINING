package LAB.Array;
import java.util.*;
public class KadaneAlgorithm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [] arr =  new int [n];
		
		
		for(int i=0; i<n; i++) {
			
			
			arr[i] = scan.nextInt();
			
		}
		
		int currentSum = 0;
		int maxSum = arr[0];
		
		
		for(int i=0; i<arr.length; i++) {
			
			
			currentSum = currentSum + arr[i];
			
			if(currentSum > maxSum) {
				
				maxSum = currentSum;
				
			}
			
			if(currentSum < 0) {
				currentSum = 0;
			}
			
			
		}
		
		System.out.print(maxSum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
