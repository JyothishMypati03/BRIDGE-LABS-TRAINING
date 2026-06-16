package LAB.String;

import java.util.Scanner;

public class CheckPalindromeString {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		String input = scanner.nextLine();
		
		int i = 0;
		int j = input.length()-1;
		boolean check = false ;
		
		
		while(i < j) {
			
			char c1 = input.charAt(i);
			char c2 = input.charAt(j);
			
			if(c1 != c2) {
				
				break;
				
			}else {
				
				i++;
				j--;
				check = true;
				
				
			}
			
		}
		
		if(check) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("false");
		}
		
		

	}

}
