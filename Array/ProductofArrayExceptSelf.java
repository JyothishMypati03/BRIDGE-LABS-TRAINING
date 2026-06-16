package LAB.Array;
import java.util.*;



public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			
			int n = scan.nextInt();
			
			int []  arr =new int [n];
			
			for(int i=0; i<n; i++) {
				
				arr[i] = scan.nextInt();
				
				
			}
			
			int p = 1;
			
			for(int i=0; i<n ;i++) {
				
				for(int j=0; j<n; j++) {
					
					if( i!= j ) {
						
						p = p * arr[j];
						
					}
					
				}
				
				System.out.print(p+" ");
				p = 1;
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
