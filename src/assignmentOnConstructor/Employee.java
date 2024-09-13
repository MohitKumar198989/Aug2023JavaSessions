package assignmentOnConstructor;

public class Employee {

	int id;
	String name;
	double salary;
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println(id+" "+name+" "+salary);
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean setSalary(double salary) {
		this.salary = salary;
		return true;
	}
	
//	public Employee(double a)
//	{
//		setSalary(a);
//	}
}
