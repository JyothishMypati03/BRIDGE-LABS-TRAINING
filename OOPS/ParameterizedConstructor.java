package LAB.OOPS;
import java.util.*;

class PCon{
	
	String status ;
	
	PCon(String status){
		
		this.status=status;
		
	}
	
	
	
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String status = scanner.nextLine();
		
		PCon pCon = new PCon(status);
		
		System.out.print(pCon.status);
		
		
		

	}

}
