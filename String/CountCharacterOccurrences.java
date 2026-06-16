package LAB.String;
import java.util.*;



public class CountCharacterOccurrences {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			String input = scanner.nextLine();
			
			String c = scanner.next();
			
			int count = 0;
			
			for(int i=0; i<input.length(); i++) {
				
				
				if(c.charAt(0) == input.charAt(i)) {
					
					count++;
				}
				
				
			}
			
			System.out.print(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
