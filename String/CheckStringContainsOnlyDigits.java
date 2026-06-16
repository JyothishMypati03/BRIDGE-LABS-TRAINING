package LAB.String;
import java.util.*;


public class CheckStringContainsOnlyDigits {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			String input = scanner.nextLine();
			
			boolean check = true;
			
			for(int i=0; i<input.length(); i++) {
				
				char c = input.charAt(i);
				
				if( !(c >= '1' && c <= '9')) {
					
					check = false;
				}
				
				
			}
			
			if(check) {
				
				System.out.print("true");
				
			}else {
				
				System.out.print("false");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
