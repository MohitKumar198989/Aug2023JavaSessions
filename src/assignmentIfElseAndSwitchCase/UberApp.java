package assignmentIfElseAndSwitchCase;

public class UberApp {
	
	
	public void bookcar(String s)
	{
		switch(s)
		{
		case "Mini":
		{
			System.out.println("Mini car is booked");
		}
		
		case "Sedan":
		{
			System.out.println("Sedan car is booked");
		}
		
		case "SUV":
		{
			System.out.println("SUV car is booked");
		}
		
		case "Premium":
		{
			System.out.println("Premium car is booked");
		}
		default : System.out.println("please select the right car type");
		}
	}

}
