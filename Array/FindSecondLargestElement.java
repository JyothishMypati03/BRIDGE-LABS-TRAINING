package LAB.Array;
import java.util.*;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] arr = { 10 , 20 , 50 , 40 };
		
		int lar  = Integer.MIN_VALUE;
		
		int lar2 = Integer.MIN_VALUE;
		
		
		for(int i=0; i<arr.length; i++) {
			
			
			if(arr[i] > lar) {
				
				lar = arr[i];
				
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			
			
			if(arr[i] > lar2  && arr[i] < lar) {
				
				lar2 = arr[i];
				
			}
			
		}
		
		System.out.print(lar2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
