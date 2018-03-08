package library;

public class Borrower {
	
	private String borrowerName;
	private String emailAddress;
	private int borrowerID;
	private int itemsOnLoan;
	
	public Borrower(String a, String b, int c) {
		
		this.borrowerName = a;
		this.emailAddress = b;
		this.borrowerID = c; 
		this.itemsOnLoan = 0;
		
	}
	
	public String getBorrowerName() {
		
		return this.borrowerName;
	}
	
	public String getEmailAddress() {
		
		return this.emailAddress;		
	}
	
	public int getBorrowerID() {
		
		return this.borrowerID;
	}
	
	public int getItemOnLoan() {
		
		return this.itemsOnLoan;
	}
	
	public void updateItemsOnLoan(int a ) {
		
		this.itemsOnLoan = this.itemsOnLoan + a;
		
	}
	
	public void printDetails() {
		
		System.out.print("Borrower Name: " + this.borrowerName + "\n"
				+ "Email Address: " + this.emailAddress + "\n"
				+ "Borrower ID: "+ getBorrowerID() + "\n"
				+ "Numbers of Items On Loan: "+ getItemOnLoan());
		
	}
	
	
	public static void main(String [] args) {
		
		Borrower A = new Borrower("Untitled", "unknown@unknown.com", 3305);
		
		A.printDetails();
		
	}

}
