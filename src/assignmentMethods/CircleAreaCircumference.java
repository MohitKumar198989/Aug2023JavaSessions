package assignmentMethods;

public class CircleAreaCircumference {
	private double pi=3.14;
	private double r;
	public void areaofCicle()
	{
		
		double area=pi*(r*r);
		System.out.println("Area of the circle is : "+area);
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public void areaofCicle(double r)
	{
		
		double area=pi*(r*r);
		System.out.println("Area of the circle is : "+area);
	}
	
	public void circumfrenceofCicle(double r)
	{
		this.r=r;
		double Circumfrence=(2*pi*r);
		System.out.println("Circumfrence of the Cicle is :"+Circumfrence);
	}

}
