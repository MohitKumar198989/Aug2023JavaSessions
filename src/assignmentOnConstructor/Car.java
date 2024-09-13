package assignmentOnConstructor;

public class Car {
	String make;
	String model;
	int year;
	
	
	public Car(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}


	public Car() {
		make = "Unknown";
		model="Unknown";
//		year="Unknown";
	}
	

}
