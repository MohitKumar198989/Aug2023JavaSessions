package assignmentOnConstructor;

public class RectangleLaunch {

	public static void main(String[] args) {

		Rectangle r1= new Rectangle(0.0, 0.0);
//		Rectangle r2= new Rectangle();
//		r2.length=0.0;
//		r2.width=0.0;
		double r3= r1.calculateArea(10, 20);
		System.out.println("Area of the rectange =:"+r3);
		
		
	}

}
