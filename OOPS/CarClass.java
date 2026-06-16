package LAB.OOPS;
import java.util.*;




class Car{
	
	
	String brand ;
	String model;
	float price;
	
	
	
	Car(String brand , String model , float price){
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}
	
	
	public void setBrand(String brand) {
		
		this.brand = brand;
		
	}
	
	
	public void setModel(String model) {
		
		
		this.model = model;
	}
	
	public void setPrice(float price) {
		
		this.price = price;
		
	}
	
	
	public String getBrand() {
		
		return brand;
		
	}
	
	public String getModel() {
		
		return model;
		
	}
	
	
	public float getPrice() {
		
		return price;
		
	}
	
	
	
}


public class CarClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String brand = scan.nextLine();
		String model = scan.nextLine();
		float price = scan.nextInt();

		Car car = new Car(brand , model , price);
		
		System.out.println(car.getModel());
		System.out.println(car.getBrand());
		System.out.println(car.getPrice());
		
		

	}

}
