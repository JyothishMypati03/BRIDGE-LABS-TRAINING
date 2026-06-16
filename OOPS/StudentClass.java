package LAB.OOPS;
import java.util.*;

class Student{
	
	
	int id ;
	String name;
	int marks;
	
	Student(int id  , String name , int marks){
		
		
		this.id = id ;
		this.name = name ;
		this.marks = marks;
		
	}
	
	public void setId(int id) {
		
		this.id  = id ;
		
	}
	
	public void setName(String name ) {
		
		this.name = name;
		
	}
	
	public void setMarks(int marks) {
		
		
		this.marks = marks;
		
	}
	
	public int getId() {
		
		return id ;
		
	}
	
	public String getName() {
		
		
		return name;
		
	}
	
	public int getMarks() {
		
		return marks;
		
		
	}
	
	
	
	
	
}


public class StudentClass {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int id = scan.nextInt();
		scan.nextLine();
		String name = scan.nextLine();
		
		int marks = scan.nextInt();
		
		Student student = new Student(id , name , marks);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		
	

	}

}
