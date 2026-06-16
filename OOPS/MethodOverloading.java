package LAB.OOPS;
import java.util.*;

class Add{
	
	public static int add(int a , int b) {
		
	   return a+b;
	
	}
	
	
	public static int add(int a , int b , int c) {
		
		   return a+b+c;
		
		}
	
	public static int add(int a , int b , int c, int d) {
		
		   return a+b+c+d;
		
		}
	
	
	
}



public class MethodOverloading {

	public static void main(String[] args) {
		
		
		System.out.println( Add.add(1, 5));
		System.out.println( Add.add(1, 5 , 4));
		System.out.println( Add.add(1, 5 , 9 , 3));
		System.out.println( Add.add(1, 5, 2));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
