package LAB.String;
import java.util.*;



public class StringCompression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 1 ;
		
		String input = scan.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			
			
			if( i<input.length()-1 && input.charAt(i) == input.charAt(i+1) ) {
				
				count++;
				
			}else {
				
				
				System.out.print(input.charAt(i));
				System.out.print(count);
				count = 1;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
