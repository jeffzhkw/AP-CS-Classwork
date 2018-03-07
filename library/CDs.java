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
	
	public void printDetails() {
		
		System.out.println("Title: " + this.getTitle()+"\n"
				+ "Artist: " + this.getAuthor_Artist()+"\n"
				+ "ItemID: " +this.getItemID()+"\n"
				+ "Onloan: " + this.getOnLoan()+ "\n"
				+ "DueDate: " + this.getDueDate()); 
	}
}
