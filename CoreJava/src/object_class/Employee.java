package object_class;

public class Employee {
	int empid;
	Employee(int empid){
		this.empid = empid;
	}
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		return this.empid == e.empid;
		
	}
}
