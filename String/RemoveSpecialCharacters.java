package LAB.String;
import java.util.*;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String input = scan.nextLine();
		
		String res = "";
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if((ch >='a' && ch <='z') || (ch>='A' && ch <= 'B') || (ch>='1' && ch<= '9')) {
				
				res = res + ch;
				
			}
			
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
