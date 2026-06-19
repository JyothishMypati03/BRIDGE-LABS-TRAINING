package LAB.String;
import java.util.*;



public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			String input1 = scan.nextLine();
			
			String res ="";
			
			
			for(int i=0; i<input1.length(); i++) {
				
				char ch = input1.charAt(i);
				
				if(ch != ' ') {
					
					res = res + ch;
				}
				
				
				
			}
			
			System.out.print(res);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
