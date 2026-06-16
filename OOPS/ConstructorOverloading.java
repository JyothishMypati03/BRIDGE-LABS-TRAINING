package LAB.OOPS;
import java.util.*;



class OverLoding{
	
	
	int id ;
	String name ;
	
	public OverLoding() {
		
		
	}
	
	public OverLoding(int id) {
		
		this.id = id;
	}
	
	public OverLoding(int id , String name) {
		
		this.id= id;
		this.name = name;
		
	}
	
	
	
	
	
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		OverLoding overLoding = new OverLoding();
		
		OverLoding overLoding2 = new OverLoding(0);
		
		
		
		

	}

}
