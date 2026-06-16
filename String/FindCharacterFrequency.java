package LAB.String;
import java.util.*;

public class FindCharacterFrequency {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
			boolean[]  visited =new boolean[256];
			
			
			
			for(int i=0; i<input.length(); i++) {
				
				char ch = input.charAt(i);
				
				
				if(visited[ch]) {
					
					continue;
					
				}
				
				int count = 0;
				
				for(int j=0; j<input.length(); j++) {
					
					if(input.charAt(j) == ch) {
						
						count++;
						
					}
					
					
				}
				
				System.out.println(ch +"=" +count);
				visited[ch] = true;
				
				
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
