package encapsulation;

public class Employee {
	int eid;
	String ename;
	Employee(int eid, String ename){
		this.eid = eid;
		this.ename = ename;
	}
	//returning object of Employee
	public static Employee returnEmployee() {
		Employee e = new Employee(2,"Smith");
		return e;
	}
}
