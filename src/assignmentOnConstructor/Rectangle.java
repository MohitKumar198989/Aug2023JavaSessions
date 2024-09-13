package assignmentOnConstructor;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		System.out.println("length = "+length+","+" width= "+width);
		
//		Rectangle r = new Rectangle();
//		r. Rectangle();
		
	}
	private Rectangle(){
	
//		length=0.0;
//		width=0.0;
		System.out.println("Constructor without paramerter,  length = "+length+","+" width= "+width);
	}

	public double calculateArea(double length, double width)
	{
		return length*width;
	}
}
