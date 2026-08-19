package encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Dingi");
		s1.acceptStudent(s1);
	}
}
