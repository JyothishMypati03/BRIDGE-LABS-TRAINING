package LAB.OOPS;
import java.util.*;


class Employee{
	
	int id ;
	String name ;
	int sal ; 
	
	
	Employee(int id , String name , int sal){
		
		this.id= id;
		this.name =name;
		this.sal = sal;
		
	}
	
	
	public void setId(int id) {
		
		this.id = id;
		
	}
	
	public void setName(String name ) {
		
		this.name = name;
		
	}
	
	public void setSal(int sal) {
		
		
		this.sal = sal;
	}
	
	
	
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getSal() {
		
		return sal;
		
	}
	
	
}


public class EmployeeClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int id = scan.nextInt();
		String name = scan.nextLine();
		int marks = scan.nextInt();
		
		Employee employee = new Employee(id , name , marks);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSal());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
