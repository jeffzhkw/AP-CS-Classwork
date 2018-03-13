package shapes_Jeff;

public class Rectangle extends Shapes {

	private double length;
	private double width;
	
	public Rectangle (double a, double b) {
		
		this.length =a ;
		this.width = b;
		
	}
	
	public double getArea() {
		
		return this.length*this.width;
		
	}
	
	public double getCircumference() {
		
		return (this.length+this.width)*2;
		
	}
	
}
