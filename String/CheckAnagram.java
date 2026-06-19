package LAB.String;

import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		
		
Scanner scanner = new Scanner (System.in);
		
		String input1 = scanner.nextLine();
		
		String input2 = scanner.nextLine();
		
		boolean isAnagram = true;
		
		int len1 = input1.length();
		int len2 = input2.length();
		
		if(len1 != len2) {
			
			isAnagram = false ;
			System.out.print("Not");
			return;
			
		}
		
		
		for(int i=0; i<len1; i++) {
			
			boolean found = false ;
			
			char c = input1.charAt(i);
			
			
			for(int j=0; j<len2; j++) {
				
				
				if( c == input2.charAt(j)) {
					
					found = true;
					break;
					
				}		
				
			}
			
			if(!found) {
				
				isAnagram = false ;
				break;
				
			}
			
		}
		
		
		if(isAnagram) {
			
			System.out.println("YES");
		}
		else {
			System.out.print("NO");
		}
				

	}

}
