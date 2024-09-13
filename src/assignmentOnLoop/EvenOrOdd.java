package assignmentOnLoop;

public class EvenOrOdd {

	public static void main(String[] args) {

		int n = 1;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even number");
			}
			
		}
		System.out.println("---------------");
		for (int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{ 
				System.out.println(i+" is odd number");
			}
		}
	}

}
