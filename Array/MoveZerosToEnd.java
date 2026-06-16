package LAB.Array;
import java.util.*;
public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[]  arr =new int [n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = scan.nextInt();
			
			
		}
		
		int index = 0 ;
		int count = 0 ;
		
		while(index < n ) {
			
			if(arr[index] != 0) {
				
				System.out.print(arr[index]+" ");
				index++;
				count++;
			}
			else {
				
				index++;
				
			}
			
		}
		
		while(count < n){
			
			System.out.print(0+" ");
			count++;
			
		}
		

	}

}
