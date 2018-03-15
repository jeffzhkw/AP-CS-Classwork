package composition;

public class Assessment {
	
	private String assessmentTitle;
	private int maxMarks;
	
	public Assessment(String a, int b) {
		
		this.assessmentTitle = a;
		this.maxMarks = b;
	}
	
	public void outputAssessmenDetails() {
		
		System.out.print("Assessment Title:" +this.assessmentTitle +"/n"+
		
					"Max Marks: "+ this.maxMarks+ "/n");
		
	}

}
