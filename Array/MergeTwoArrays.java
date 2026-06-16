package LAB.Array;
import java.util.*;


public class MergeTwoArrays {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			int n1 = scan.nextInt();
			
			int[]  arr1 = new int [n1];
			
			for(int i=0; i<arr1.length; i++) {
				
				
				arr1[i] = scan.nextInt();
				
			}
			
			
			int n2 = scan.nextInt();
			
			int[]  arr2 = new int [n2];
			
			for(int i=0; i<arr2.length; i++) {
				
				
				arr2[i] = scan.nextInt();
				
			}
			
		
		
		
		for(int i=0; i<n1; i++) {
			
			System.out.print(arr1[i]+" ");
			
		}
		
		
		
		for(int i=0; i<n2; i++) {
			
			System.out.print(arr2[i]+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
