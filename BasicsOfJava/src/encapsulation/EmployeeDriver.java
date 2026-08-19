package encapsulation;

public class EmployeeDriver {
	public static void main(String[] args) {
		//If the returnEmployee() is non-Static type
//		Employee e2 = new Employee(1,"King");
//		Employee e1=e2.returnEmployee();
//		System.out.println(e2.eid+"\n"+e2.ename);
//		System.out.println(e1.eid+"\n"+e1.ename);
		
		//If the returnEmployee() is Static type
		Employee e3 = Employee.returnEmployee();
		System.out.println(e3.eid+"\n"+e3.ename);
		
	}
}
