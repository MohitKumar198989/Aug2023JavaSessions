package assignmentOnConstructor;

public class Person {

	String name ;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age, char gender, double height) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		
		System.out.println(name+" "+" "+age+" "+gender+" "+height);
		
	}
	public Person()
	{
		System.out.println("hi");
		Person p1=new Person("XYZ",30,'M',5.4);
//		new Person("XYZ",30,'M',5.4);
	}
	
	public static void main(String[] args)
	{
//		Person p1=new Person("XYZ",30,'M',5.4);
//		
		Person p2=new Person("PQR",30,'M',5.4);
		Person p1=new Person();
		//p1.Person();
		
		//System.out.println(p2);
		//System.out.println(p1);
	}
	
}
