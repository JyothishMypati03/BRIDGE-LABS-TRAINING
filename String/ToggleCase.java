package LAB.String;
import java.util.*;

public class ToggleCase {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
			
			String res = "";
			
			
			
			
			for(int i=0; i<input.length(); i++) {
				
				
				char c = input.charAt(i);
				
				if(c >= 'a' && c <= 'z') {
					
					res = res +(char) (c-32);
				}else if (c >= 'A' && c<= 'Z') {
					
					res = res + (char) (c+32);
					
				}
				
				
			}
			
			System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
