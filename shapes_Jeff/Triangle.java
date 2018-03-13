package shapes_Jeff;

public class Triangle extends Shapes{

	private double a; 
	private double b; 
	private double c;
	
	public Triangle(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public double getArea() {
		
		double s = (this.getCircumference())/2;
		return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		
		
	}
	
	public double getCircumference() {
		
		return a+b+c;
		
	}
}
