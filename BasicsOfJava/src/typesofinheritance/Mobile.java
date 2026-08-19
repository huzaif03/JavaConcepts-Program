package typesofinheritance;

public class Mobile extends Gadget{
	int price;
	Mobile(String brand, String color, int price){
		super(brand,color);
		this.price = price;
	}
}
