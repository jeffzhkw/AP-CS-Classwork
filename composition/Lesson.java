package composition;

public class Lesson {
	
	private String lessonTitle;
	private int durationMinutes;
	private boolean requiresLab;
	
	public Lesson (String a, int b, boolean c) {
		
		this.lessonTitle =a;
		this.durationMinutes =b;
		this.requiresLab = c;
		
		
	}
	
	public void outputLessonDetails() {
		
		System.out.print("Lesson Title:" + this.lessonTitle +"/n"+
		
				"Duration Minutes:" + this.durationMinutes +"/n"+
				
				"Requires Lab: "+ this.requiresLab + "/n");
		
	}

}
