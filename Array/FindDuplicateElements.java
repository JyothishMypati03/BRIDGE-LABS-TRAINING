package LAB.Array;
import java.util.*;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int []  arr1 =  new int [n];
		
		for(int i=0; i<arr1.length; i++) {
			
			
			arr1[i] = scan.nextInt();			
		}
		
		
			
			
		for(int i=0; i<n; i++) {
			
			
			for(int j=i+1; j<n; j++) {
				
				
				if(arr1[i] == arr1[j]) {
					
					System.out.println(arr1[i]);
					break;
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
