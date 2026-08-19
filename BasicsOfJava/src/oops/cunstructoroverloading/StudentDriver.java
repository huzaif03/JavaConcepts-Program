package oops.cunstructoroverloading;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student(101);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.stream);
		
		Student s2 = new Student(101, "Hujaifa Majeed");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.stream);
		Student s3 = new Student(101, "Hujaifa Majeed", "MCA"); 
		System.out.println(s3.sid);
		System.out.println(s3.sname);
		System.out.println(s3.stream);
	}
}
