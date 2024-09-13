package assignmentMethods;

public class ProductTwoDoubleNum {

	private double a;
	private double b;
	
//	public double getA() {
//		return a;
//	}
//
//	public void setA(double a) {
//		this.a = a;
//	}
//
//	public double getB() {
//		return b;
//	}
//
//	public void setB(double b) {
//		this.b = b;
//	}

	//private void Multiplication(double a, double b) --- not visible 
	public void Multiplication(double a, double b)
	{
		this.a=a;
		this.b=b;
		double s=a*b;
		System.out.println("Product of two double numbers are :" +s);
	}
}
