package LAB.String;
import java.util.*;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
			
		String input = scan.nextLine();
		

		int v = 0;
		int c = 0;
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if( ch >='a' && ch <='z') {
				
				if(ch ==  'a' || ch == 'A' || ch == 'e' || ch=='E' || ch == 'i' || ch == 'I'|| ch=='o' || ch =='O' || ch =='u' || ch=='U') {
					
					v++;
					
				}else {
					c++;
				}
				
			}
			
			
		}
		
		System.out.println(v);
		System.out.println(c);
		
		
		
		

	}

}
