package typesofinheritance;

public class EngineeringStudent extends Student {
	String course;
	EngineeringStudent(String name, int sid, String course){
		super(name,sid);
		this.course = course;
	}
	public void display() {
		System.out.println("Name:- "+name);
		System.out.println("Student Id:- "+sid);
		System.out.println("Course:- "+course);
	}
}
