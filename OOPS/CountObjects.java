package LAB.OOPS;
import java.util.*;

class Count{
	static int count = 0;
	
	Count(){
		count++;
		
	}
	
	
}

public class CountObjects {

	public static void main(String[] args) {
		
		Count count = new Count();
		Count count2 = new Count();
		Count coun3 = new Count();
		
		
		System.out.println(Count.count);
		
		
		
		
		
		
		
		
		
		

	}

}
