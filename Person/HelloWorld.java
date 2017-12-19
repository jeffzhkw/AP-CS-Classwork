package Person;

public class HelloWorld {

	public static void main(String[] args) {
		
		Person Daniel = new Person("English", 23,80);
		Person 姜云帆 = new Person("中文",-1,80);
		
		//Daniel.language="English";
		Daniel.sayHello();
		
		//姜云帆.language = "中文";
		姜云帆.sayHello();
		
		姜云帆.grow(4);
		
		姜云帆.sayHello();
		
	}
}
