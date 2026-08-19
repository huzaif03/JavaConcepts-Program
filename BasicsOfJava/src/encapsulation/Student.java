package encapsulation;

public class Student {
	int sid;
	String sname;
	Student(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}
	public void acceptStudent(Student s) {
		System.out.println(s.sid + "\n"+ s.sname);
	}
}
