package LAB.Array;
import java.util.*;



public class FindLongestConsecutiveSequence {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			int n = scan.nextInt();
			
			int []  arr= new int [n];
			
			for(int i=0; i<n; i++) {
				
				
				arr[i] = scan.nextInt();
				
				
			}
			
			for(int i=0; i<n; i++) {
				
				for(int j=0; j<n-1; j++) {
					
					if(arr[j] > arr[j+1]) {
						
						int temp = arr[j];
						
						arr[j] = arr[j+1];
						
						arr[j+1] = temp;
						
					}
					
					
				}
				
			}
			
			int count = 1;
			int res = 0;
			
			for(int i=0; i<n-1; i++) {
				
				if(arr[i] +1 == arr[i+1]) {
					
					count++;
					
				}else {
					
					if(count > res) {
						
						res = count;
					}
					
					count = 1;
				}
				
				
			}
			
			if(count > res) {
				
				
				res = count ;
			}
			
			System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
