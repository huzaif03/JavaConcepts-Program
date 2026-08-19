package has_a_relationship;

public class Car2 {
	private String brand;
	private String color;
	//Early Instatiation
	private Engine2 e2 = new Engine2(1001);
	Car2(){}
	Car2(String brand, String color){
		this.brand = brand;
		this.color = color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	
	public Engine2 getEngine2() {
		return e2;
	}
}
