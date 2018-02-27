/**
 * 
 */
package Bicycle;

/**
 * @author kw
 *
 */
public class bicycle {
	
	private double maxSpeed; 
	private double weight;
	private double curSpeed;
	
	public bicycle(double a, double b) {
		
		this.maxSpeed = a;
		this.weight = b;
	}
	
	public void accelerate(double a) {
	
		while (this.curSpeed < this.maxSpeed) {
			this.curSpeed = this.curSpeed + a; 
		}
	
	}
	
	public void slowDown() {
		
		this.curSpeed = this.curSpeed -1; 
		
	}
	
	public double getSpeed() {
		
		return this.curSpeed; 
	}
	
	

}


