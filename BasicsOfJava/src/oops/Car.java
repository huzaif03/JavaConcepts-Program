package oops;

public class Car {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = c1;
		Car c3 = new Car();
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		System.out.println(c3 == c1);
	}

}
