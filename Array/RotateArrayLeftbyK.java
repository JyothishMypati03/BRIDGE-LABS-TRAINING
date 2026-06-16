package LAB.Array;
import java.util.*;

public class RotateArrayLeftbyK {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
		
			
			int n = scan.nextInt();
			
			int []  arr = new int [n];
			
			for(int i=0; i<arr.length; i++) {
				
				arr[i] = scan.nextInt();
				
			}
			
			
			int r = scan.nextInt();
			
			for(int i=r; i<n; i++) {
				
				System.out.print(arr[i]+" ");
				
			}
			
			for(int i=0; i<r; i++) {
				
				
				
				System.out.print(arr[i]+" ");
			}
		

	}

}
