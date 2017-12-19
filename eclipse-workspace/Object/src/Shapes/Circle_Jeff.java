package Shapes;

public class Circle_Jeff {

	private int radius; 
	private static final double PI = 3.1415926535798;
	
	public Circle_Jeff(int a) {
		
		this.radius = a;
		
	}
	
	public double getArea() {
		
		
		return Math.abs(PI * this.radius * this.radius);
	}
	
	public double getCircumference () {
		
		return Math.abs(2 * PI * this.radius);
		
	}
	
}
