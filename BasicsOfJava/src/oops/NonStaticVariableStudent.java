package oops;

public class NonStaticVariableStudent {
	int sid;
	String name;
	int age;
	
	public static void main(String [] args) {
		NonStaticVariableStudent s1 = new NonStaticVariableStudent();
		s1.sid=1;
		s1.name="Hujaifa Majeed";
		s1.age=20;
		System.out.println("Sid = "+s1.sid+" Name = "+s1.name +" Age = "+s1.age);
		
		NonStaticVariableStudent s2 = new NonStaticVariableStudent();
		System.out.println("Sid = "+s2.sid+" Name = "+s2.name +" Age = "+s2.age);
		
		
	}
	
}

