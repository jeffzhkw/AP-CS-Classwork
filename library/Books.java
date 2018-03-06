package library;

import java.util.Date;

public class Books extends Items {

	private boolean IsRequested;
	
	public Books (String a, String b, int c, boolean d, Date e, boolean f) {
		
		super(a, b, c, d, e);
		this.IsRequested = f; 
		
	}
	
	public boolean getIsRequesed() {
		
		return this.IsRequested;
	}
	
	public void setIsRequested() {
		
		this.IsRequested = true; 
	}
}
