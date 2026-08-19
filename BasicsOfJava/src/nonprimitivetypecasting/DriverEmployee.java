package nonprimitivetypecasting;

public class DriverEmployee {
	public static void main(String[] args) {
//		Employee e = new Employee();
//		Person p = e;	//upCasting variable
//		System.out.println(p.name); //Parent member
////		System.out.println(p.eid);	//Child Member
//	
		
		Employee e2 = new Employee();
		Person p2 = e2;		//Downcasting
		Employee e3 = (Employee)p2; //Upcasting
		System.out.println(e3.eid);
		System.out.println(e3.name);
	}
}
