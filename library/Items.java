package library;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Items {
	
	private String title;
	private String Author_Artist;
	private int ItemID; 
	private boolean OnLoan; 
	private Date DueDate; 
	private int borrowerID;

	
	public Items(String a, String b, int c, boolean d, Date e) {
		this.title= a;
		this.Author_Artist = b;
		this.ItemID = c;
		this.OnLoan = d;
		this.DueDate = e;
	}
	
	//helper method
	private static Date addDays(Date d, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		cal.add(Calendar.DATE, days);
		
		return cal.getTime();
		
		
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
		Date today = new Date();
		this.DueDate = addDays(today, 14);
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
		
		Items b = new Books("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        b.borrowing();
        b.printDetails();
        
        Items cd = new CDs("And Justice for all", "Metallica", 567, false, new Date(), "Metal");
        cd.printDetails();
	}
}
