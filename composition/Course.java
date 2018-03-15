package composition;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String courseTitle;
	private int maxStudents;
	private int numberOfLessons;
	private List<Lesson> courseLesson;
	private Assessment courseAssessment;
	
	public Course(String a, int b, int c, List<Lesson> d, Assessment e) {
		
		this.courseTitle =a;
		this.maxStudents =b;
		this.numberOfLessons = c;
		this.courseLesson = d;
		this.courseAssessment =e;
		
		
		
	}
	
	public void addLesson(Lesson a) {
		
		this.numberOfLessons = this.numberOfLessons + 1;
		//List<Lesson> b = new ArrayList<Lesson>();
		courseLesson.add(a);
		
	}
	
	public void addAssessment(Assessment a) {
		
		courseAssessment = a;
	}
	
	public void outputCourseDetails() {
		
		System.out.print("Course Title" + this.courseTitle +"/n"+
		"Max Students: " + this.maxStudents +"/n"+
				"Number of Lessons: " + this.numberOfLessons + "/n"+
				"Course Lessons: "	);
		
		for(int i = 0; i<=courseLesson.size(); i++) {
			courseLesson.get(i).outputLessonDetails();
			
		}
		System.out.print("Course Assessment: ");
		courseAssessment.outputAssessmenDetails();
		
	}

}
