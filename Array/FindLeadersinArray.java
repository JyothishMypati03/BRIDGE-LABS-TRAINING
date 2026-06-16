package LAB.Array;
import java.util.*;

public class FindLeadersinArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		 int []  arr= new int [n];
		 
		 for(int i=0; i<n; i++) {
			 
			 arr[i] = scan.nextInt();
			 
		 }
		 
		 int i ;
		 
		 for( i=0; i<n-1; i++) {
			 
			 
			 if(arr[i] > arr[i+1]) {
				 
				 System.out.print(arr[i]+" ");
				 
			 }
			 
		 }
		 
		 if(i == n-1) {
			 
			 
			 System.out.print(arr[i]);
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
