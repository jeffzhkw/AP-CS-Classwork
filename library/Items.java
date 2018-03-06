package library;

import java.util.Date;

public class Items {
	
	private String title;
	private String Author_Artist;
	private int ItemID; 
	private boolean OnLoan; 
	private Date DueDate; 

	
	public Items(String a, String b, int c, boolean d, Date e) {
		this.title= a;
		this.Author_Artist = b;
		this.ItemID = c;
		this.OnLoan = d;
		this.DueDate = e;
	}
	
	public String getTitle() {
		
		return this.title; 
	}
	public String getAuthor_Artist(){
		
		return this.Author_Artist;
		
	}
	public int getItemID() {
		
		return this.ItemID;
	}
	public boolean getOnLoan() {
		
		return this.OnLoan;
		
	}
	public Date getDueDate() {
		
		return this.DueDate;
		
	}
	
	public void borrowing() {
		
		this.OnLoan= true;  
	}
	
	public void returning() {
		
		this.OnLoan = false;
	}
	
	public void printDetails() {
		
		System.out.println("Title: " + this.getTitle()+"\n"
				+ "Author/Artist: " + this.getAuthor_Artist()+"\n"
				+ "ItemID: " +this.getItemID()+"\n"
				+ "Onloan: " + this.getOnLoan()+ "\n"
				+ "DueDate: " + this.getDueDate()); 
	}
	
	public static void main(String[] args) {
		
		Books b = new Books("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        CDs cd = new CDs("And Justice for all", "Metallica", 567, false, new Date(), "Metal");
        cd.printDetails();
	}
}
