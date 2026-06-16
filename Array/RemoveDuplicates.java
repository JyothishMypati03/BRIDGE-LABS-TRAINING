package LAB.Array;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			int [ ] arr1 = new int [n];
			
			for(int i=0; i<n ;i++) {
				
				arr1[i] =scan.nextInt();
				
			}
			
			
				
			for(int i=0; i<n; i++) {
				
				
				boolean check = false;
				
				for(int j=0; j<i; j++) {
					
					
					if(arr1[i] == arr1[j]) {
						
						check = true;
						break;
						
						
					}
					
				}
				
				if(!check) {
					
					System.out.print(arr1[i]+" ");
					
				}
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
