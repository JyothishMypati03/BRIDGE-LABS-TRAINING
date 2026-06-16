package LAB.String;
import java.util.*;

public class CountWordsinaString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String input = scan.nextLine();
		
		int count = 0;
		boolean inWord = false;
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if(ch !=' ' && !inWord) {
				
				count++;
				inWord = true;
				
			}else if (ch == ' ') {
				
				inWord = false;
				
			}
			
			
			
		}
		
		System.out.print(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
