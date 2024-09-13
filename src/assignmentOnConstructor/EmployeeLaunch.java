package assignmentOnConstructor;

public class EmployeeLaunch {

	public static void main(String[] args) {

		Employee e1=new Employee(1, "PQR", 20000);
		System.out.println(e1.id+" "+e1.name+" "+e1.salary);
		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		double s=e1.getSalary();
		System.out.println(s);
		//double s1=s+(s*(double)10/100);
		
		//System.out.println(s1);
		//System.out.println("Increased Salary "+s1);
		
		e1.setSalary(s+(s*(double)10/100));
		System.out.println("Increased salary "+e1.getSalary());
		
//		Employee e2=new Employee(30000);
//		double sal=e2.salary;
//		Employee e3=new Employee(1, "PQR", sal);
//		double sal1=sal+(sal*(double)10/100);
//		System.out.println("Increment salray"+sal1);
		
		System.out.println(e1.getSalary());
		boolean e5= e1.setSalary(30000);
		System.out.println("Salary "+e5);
		
	}
	
}
