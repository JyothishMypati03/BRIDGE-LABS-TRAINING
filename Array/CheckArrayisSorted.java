package LAB.Array;
import java.util.*;

public class CheckArrayisSorted {

	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				
				int n = scan.nextInt();
				
				int [] arr = new int [n];
		
				for(int i=0; i<n ;i++) {
					
					arr[i] = scan.nextInt();
					
					
				}
				boolean check = true;
				
				for(int i=1; i<=n; i++) {
					
					if(arr[i-1] != i) {
						
						check = false ;
						break;
						
					}
					
				}
				
				System.out.print(check);
		

	}

}
