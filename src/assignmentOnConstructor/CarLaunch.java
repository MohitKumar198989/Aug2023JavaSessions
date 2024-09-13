package assignmentOnConstructor;

public class CarLaunch {

	public static void main(String[] args) {

		Car c1=new Car();
		System.out.println(c1.make);
		System.out.println(c1.model);
		
		Car c2=new Car("BMW","Sports",23);
		System.out.println();
		System.out.println(c2.make+" "+c2.model+ " "+c2.year);
			
		System.out.println(c1.make);
		System.out.println(c1.model);
		
	}

}
