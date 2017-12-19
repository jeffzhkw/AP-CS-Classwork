package classwork_Jeff;

import java.util.Scanner;

public class AddItUp_Jeff {

	public static int addUp(int i) {
		
		
		return addUp(i)+addUp(i-1);
	}
	
		
	
		
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		
		System.out.println(addUp(i));
	}
	
}
