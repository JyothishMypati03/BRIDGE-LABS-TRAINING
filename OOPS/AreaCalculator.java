package LAB.OOPS;
import java.util.*;

class Calculator{
	
	 public static float area(int r) {
		 
		 
		 return (float) (Math.PI * r * r);
		 
	 }
	 
	 public static int area(int l , int w) {
		 
		 return l * w;
		 
	 }
	
	
}

public class AreaCalculator {

	public static void main(String[] args) {
		
		
		
		System.out.println(Calculator.area(5));
		System.out.println(Calculator.area(5 , 4));
		
		
		
		

	}

}
