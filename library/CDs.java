package library;

import java.util.Date;

public class CDs extends Items {

	private String genre;  
	
	public CDs (String a, String b, int c, boolean d, Date e, String f) {
		
		super(a, b, c, d,e); 
		this.genre = f; 
	}
	
	public String getGenre() {
		return this.genre; 
		
	}
	public void setGenre(String a) {
		
		this.genre = a; 
	}
}
