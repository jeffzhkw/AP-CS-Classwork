package Person;

public class Person {
	//instant variable
	private int age;
	private String language;
	private int weight; 
	//Constructor 
	public Person(String x, int i, int a) {
		
		this.language=x;
		this.age =i;
		this.weight=a; 
	}
	
	//method
	/*public void setLanguage(String x) {
		
		this.language=x;
		
	}
	*/
	
	public void grow(int i) {
		
		this.age = this.age+i;
		this.weight = this.weight + 1;
	}
	

	public String getWords() {
		
		return "Here is my words.";
	}
	
	public void sayHello() {
		
		if (age <=3) {
			System.out.println("asdfaeuhqgajsnhwe");
			
		}
		
		else if (this.language.equals("English")) {
		
			System.out.println("Hello");
			
		}
		
		else if (this.language.equals("中文")) {
			
		System.out.println("你好！");
		
		}
		
	}
	
	public void sayGoodbye() {
		
		System.out.print("Bye");
		
	}
	
}
