package typesofinheritance;

public class Laptop extends Gadget{
	int price;
	Laptop(String brand, String color, int price){
		super(brand,color);
		this.price = price;
	}
}
