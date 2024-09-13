package assignmentOnLoop;

public class PrintSeries {

	public static void main(String[] args) {

		float f=1f;
		for (int i =0;i<=10;i++)
		{
			float sum=f+i;
			System.out.print(sum); //9
			System.out.print(" ");
		}
		System.out.println();
		
		int a=9;
		for(int i=0;i<=11;i++)
		{
			int s=a*i;
			System.out.print(s);
			System.out.print(" "); //9
		}
		
//		for (int i=1;i<=10;i++)
//		{
//			System.out.println();
//			for(int j=1;j<=i-1;j++)
//			{
//				System.out.print("*");
//			}
//			//System.out.println("*");
//		}
		
	}

}
