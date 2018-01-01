package project1;

public class Encryption {
	
	private int r;
	private int c;
	private char [][] panel;
	
	public Encryption(int a, int b) {
		//this.plaintext = x ;
		this.r = a;
		this.c = b;
		this.panel = new char [this.r] [this.c];
	}
	

	public void doWorks(String a) {
		
		int count = 0;
				for(int i = 0; i < this.r; i++) {
					for (int j = 0; j < this.c; j++) {
					
						while(count < a.length()) {
							
						panel[i] [j] = a.charAt(count++);
						
						}
			}
		
		}		
		
		
	}

	public String output() {
		
		String result = "";
		
		for (int j = 0; j < this.c; j++) {
			for(int i = 0; i < this.r; i++) {
				
				result = result + panel[i] [j];
			}
			
		}
		
		return result;
	}

	


}
