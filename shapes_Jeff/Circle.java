package shapes_Jeff;

public class Circle extends Shapes {

	private double radius;
	
	
	public Circle(double a) {
		
		this.radius = a;		
	}
	public double getArea() {
		
		return 3.1415926525798*this.radius*this.radius;
		
	}
	public double getCircumference() {
		
		return 3.1415926535798*this.radius*2;
		
	}
	
	public boolean equals(Circle a) {
		
		return (this.radius==a.radius);
		
	}
	
}
