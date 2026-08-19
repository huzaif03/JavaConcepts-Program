package encapsulation;

public class Student1 {
	private int sid;
	private String sname;
	
	Student1(){}
	//Setter methods
	public Student1 setSid(int sid) {
		this.sid = sid;
		return this;
	}
	public Student1 setSname(String sname) {
		this.sname = sname;
		return this;
	}
	
	//Display method
	public Student1 display() {
		System.out.println(sid);
		System.out.println(sname);
		return this;
	}
	
	//Getter methods
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
}
