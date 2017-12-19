package Shapes;

public class Rectangle_Jeff {
	
	private int length;
	private int width; 
	
	public Rectangle_Jeff(int a, int b) {
		
		this.length = a ;
		this.width = b;
		
		
	}
	
	public int getArea() {
		
		return Math.abs(this.length*this.width);
		
	}
	
	
	public int getParameter() {
		
		return Math.abs(2* (this.length + this.width));
		
	}

}
