package project2;

public class RouteCipher {


	private String[][] letterBlock;
	int numRows;
	int numCols;
	

	public RouteCipher (int row, int col){

		numRows = row;
		numCols = col;
		letterBlock = new String[numRows][numCols];
	}
	private void fillBlock(String str) 
	{ 
	    int pos = 0; 
	    for (int r = 0; r < this.numRows; r++ ) { 
	       for (int c = 0; c < this.numCols; c++ ) { 
	           if (pos < str.length()) 
	           { 
	              this.letterBlock[r][c] = str.substring(pos, pos+1); 
	              pos++; 
	           }
	           else 
	          { 
	              this.letterBlock[r][c] = "A"; 
	           } 
	       } 
	     } 
	}

	
	public String encryptBlock(){
		String result ="";
		
		for (int c = 0; c < this.numCols; c++) {
			for (int r = 0; r < this.numRows; r++){
			
				result += letterBlock[r][c];
				
			}
		}
		
		return result;
	}
		

	
	public String encryptMessage(String message) { 
		String result = ""; 
		while (message.length() > 0) { 
		this.fillBlock(message); 
		result += this.encryptBlock(); 
		if (numRows*numCols < message.length()) 
		         message = message.substring(numRows*numCols); 
		else 
		         message = "";
		}
		return result; 
		}
	
	
	    public static void main (String ags[])
            {
	    	RouteCipher sb = new RouteCipher(3,3);
	    	
	    	System.out.print(sb.encryptMessage("woshisb"));

	    	
	    	
	    	
	    	
	    		
	    }
	
}


