package LAB.Array;
import java.util.*;

public class FindMissingNumber {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner (System.in);
		
		int [] arr = { 1 , 2 , 3 , 5 } ;
		
		int n = arr.length;
		
		
		int actualsum = n * (n+1) /2;
		
		int currentsum = 0; 
		
		
		for(int i=0; i<arr.length-1; i++) {
			
			currentsum = currentsum + arr[i];
			
		}
		
		System.out.print(actualsum - currentsum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
