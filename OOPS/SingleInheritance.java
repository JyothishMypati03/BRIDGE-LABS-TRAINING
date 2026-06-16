package LAB.OOPS;
import java.util.*;

class Animal {
	
	void eat() {
		
		System.out.println("Animal eating food");
		
	}
	
}

class Cat extends Animal{
	
	void eat() {
		
		System.out.println("Cat eating food");
		
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		Animal cat = new Cat();
		
		animal.eat();
		cat.eat();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
