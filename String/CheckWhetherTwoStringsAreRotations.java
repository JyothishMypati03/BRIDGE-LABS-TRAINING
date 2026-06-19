package LAB.String;
import java.util.*;

public class CheckWhetherTwoStringsAreRotations {
	
	static boolean check(String input1 , String input2) {
		
		if(input1.length() != input2.length()) {
			 
			 return false;
			 
		 }
		 
		 String temp = input1+input2;
		 
		 
		 for(int i=0; i<=temp.length()-input2.length(); i++) {
			 		 
			 int j;
			 for( j=0; j<input2.length(); j++) {
				 
				 
				 if( temp.charAt(i+j) != input2.charAt(j)) {
					 
					 break;
				 }
			 
			 }
			 
			 if(j==input2.length()) {
				 
				 return true;
				 
			 }
			 
			 
			 
			 
			 
			 
			 
		 }
		 return false;
		
		
		
	}
	

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 String input1 = scan.nextLine();
		 String input2 = scan.nextLine();
		 
		 System.out.print(check(input1, input2));
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
