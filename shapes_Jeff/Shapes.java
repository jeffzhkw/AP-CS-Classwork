package shapes_Jeff;

public abstract class Shapes {
	
	
	public abstract double getArea();
	
	
	public abstract double getCircumference();
		
	
	public static void main (String[] args) {
		
		Shapes a = new Circle(3);
		System.out.println(a.getArea());
		
		Shapes b = new Circle(5);
		
		System.out.print(a.equals(b));
	}

}


