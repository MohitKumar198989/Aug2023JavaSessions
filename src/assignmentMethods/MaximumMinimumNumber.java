package assignmentMethods;

public class MaximumMinimumNumber {

	public void max(int a,int b,int c)
	{
		if (a<b)
		{
			if(b<c)
			{
				if (a<c)
				{
				System.out.println(c+" is the maximum number");
				}else System.out.println(a+" is the maximum number");
			}else System.out.println(b+" is the maximum number");
		}else System.out.println(a+" is the maximum number");
	}
	
	public void mini(int a, int b,int c)
	{
	
		if (a<b)
		{
			if(a<c)
			{
				System.out.println(a+" is the maximum number");
	
			}else System.out.println(c+" is the minimum number");
			
		}
		else  
		{
		 if(b<c)
			{
				System.out.println(b+" is the minimum number");
			} else System.out.println(c+" is the minimum number");
		}
	}
	
	public int max1(int a, int b,int c)
	{
//		this.a=a;
//		this.b=b;
//		this.c=c;
		int n4=Math.max(Math.max(a, b),c);
		System.out.println("Max " +n4);
		return n4;
	}
	public int mini1(int a, int b,int c)
	{
//		this.a=a;
//		this.b=b;
//		this.c=c;
		int n4=Math.min(Math.min(a, b),c);
		System.out.println("Min " +n4);
		return n4;
	}
}
