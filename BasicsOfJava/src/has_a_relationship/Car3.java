package has_a_relationship;

public class Car3 {
	private Tyre t;
	//helper method
	//lazy instatiation
	public void  createTyre() {
		if(t == null) {
			t = new Tyre();
			System.out.println("Tyre got created");
		}else {
			System.out.println("tyre is already created");
		}
	}
}
