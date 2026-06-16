package LAB.Array;
import java.util.*;

public class FindUnionofTwoArrays {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 	int n1 = scan.nextInt();
		 	int n2 = scan.nextInt();
		 	
		 	
		 	int []  arr1 = new int [n1];
		 	int []  arr2 =new int [n2];
		 	
		 	
		 	for(int i=0; i<n1; i++) {
		 		
		 		arr1[i] = scan.nextInt();
		 		
		 	}
		 	
		 	for(int i=0; i<n2; i++) {
		 		
		 		arr2[i] = scan.nextInt();
		 		
		 	}
		 	
		 	for(int i=0; i<n1; i++) {
		 		
		 		System.out.print(arr1[i]+" ");
		 		
		 		
		 	}
		 	
		 	for(int i=0; i<n2; i++) {
		 		
		 		boolean check = false ;
		 		
		 		for(int j=0; i<n1; j++) {
		 			
		 			if(arr2[i] == arr1[j]) {
		 				
		 				check = true;
		 				
		 			}
		 			
		 		}
		 		
		 		if(!check) {
		 			
		 			System.out.print(arr2[i]+" ");
		 			
		 		}
		 		
		 	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
