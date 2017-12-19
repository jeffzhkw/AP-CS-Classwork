package classwork_Jeff;

public class TestRandomNumGenerator_Jeff {
	
	public static int randomGen() {
		
		int result = (int)(Math.random() * 10);
		
		return result;
		
	}
	
	
	
	public static void main(String args[]) {
		
		int count = 0;
		
		int myArray[] = new int[10];

		
		while(count <= 9999999) {
			
			int i = randomGen();
			
			
				myArray[i]++;
			
		
			
			count++;
			
			
		}
		
	
		
		for (int i = 0; i <10 ; i++) {
			
			System.out.println(myArray[i]/100000.00);
			
			
		}
		
		
	}

}
