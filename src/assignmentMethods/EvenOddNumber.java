package assignmentMethods;

public class EvenOddNumber {
	private boolean t;
	
	
	public boolean evenOdd(int a)
	{
		System.out.println("Value of t "+t);
		if (a%2==0)
		{
			System.out.println("Number is even");
			t=true;
			return t;
		}
		else 
		{
			System.out.println("Number is odd");
			return t;
		}
		
		
	}

}
