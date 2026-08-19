package has_a_relationship;

public class CarDriver {
	public static void main(String[] args) {
		Car2 c2 = new Car2();
		c2.setBrand("Fortuner");
		c2.setColor("Black");
		//c2.getEngine2().setHp(6);
		System.out.println(c2.getEngine2().getHp());
		System.out.println(c2.getBrand()+"  "+c2.getColor());
	}
}
