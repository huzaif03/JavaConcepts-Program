package has_a_relationship;

public class Car {
	//Early instantiation
	Engine e = new Engine();
	void move() {
		System.out.println("car is moving");
	}
}
