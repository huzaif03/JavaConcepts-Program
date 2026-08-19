package has_a_relationship;

public class PhoneDriver {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setPbrand("Iphone");
		System.out.println(p.getPbrand());
		//call setter to set Sim Name with Sim Object(Sim refr. will be called with getter of sim)
		p.getSim().setSname("Jio");
		//To display call the getter method of sim in same way 
		System.out.println(p.getSim().getSname());
	}
}
