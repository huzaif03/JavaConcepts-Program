package object_class;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(101);
		Employee e2 = new Employee(101);
		Employee e3 = new Employee(102);
		//System.out.println(e1.empid == e2.empid);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		
	}
}
