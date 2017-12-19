package Shapes;

import java.util.Random;

public class Runner {
	
	public static void main(String[] args) {
		
		Random rng = new Random();
		
		Circle_Jeff circle = new Circle_Jeff(rng.nextInt());
		Circle_Jeff circle1 = new Circle_Jeff(rng.nextInt());
		
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		
		System.out.println(circle1.getArea());
		System.out.println(circle1.getCircumference());
		
			
		
		Rectangle_Jeff rectangle = new Rectangle_Jeff(rng.nextInt(),rng.nextInt());
		Rectangle_Jeff rectangle1 = new Rectangle_Jeff(rng.nextInt(),rng.nextInt());
		
		
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getParameter());	
		
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.getParameter());	
	}

}

