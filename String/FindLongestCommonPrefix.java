package LAB.String;
import java.util.*;

public class FindLongestCommonPrefix {
	
	
	static String longestCommonPrefix(String [] arr) {
		
		
		
		if(arr.length ==0 || arr == null) {
			
			return "";
		}
		
		String ans = "";
		
		
		for(int i=0; i<arr[0].length(); i++) {
			
			
			char ch = arr[0].charAt(i);
			
			for(int j=1; j<arr.length; j++) {
				
				if( i >= arr[j].length() || arr[j].charAt(i) != ch) {
					
					return ans;
				}
				
				
			}
			
			ans = ans + ch;
			
		}
	
		return ans;
		
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		String []  arr = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
