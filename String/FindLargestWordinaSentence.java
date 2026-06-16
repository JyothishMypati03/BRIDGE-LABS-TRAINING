package LAB.String;
import java.util.*;

public class FindLargestWordinaSentence {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
			
			
			String currentWord = "";
			String longetWord = "";
			
			for(int i=0; i<input.length(); i++) {
				
				char ch = input.charAt(i);
				
				if( ch != ' ') {
					
					currentWord = currentWord + ch ;
					
				}else {
					
					if(currentWord.length() > longetWord.length()) {
						
						longetWord = currentWord;
						
					}
					
					currentWord = "";
					
				}		
				
			}
			if(currentWord.length() > longetWord.length()) {
				
				longetWord = currentWord;
				
			}
			
			System.out.print(longetWord);
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
