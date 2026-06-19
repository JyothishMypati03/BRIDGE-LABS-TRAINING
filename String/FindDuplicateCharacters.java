package LAB.String;
import java.util.*;
public class FindDuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine();
		
		
		String res = "";
		
		
		for(int i=0; i<input.length(); i++) {
			
			char c = input.charAt(i);
			
			
			
			
			for(int j=0; j<res.length(); j++) {
				
				if(c == res.charAt(j)) {
					
					System.out.println(c);
					
					
				}
				
				
			}
			
			res = res + c;
			
			
			
			
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
