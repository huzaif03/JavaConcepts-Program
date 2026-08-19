package typesofinheritance;


public class GadgetDriver {
	public static void main(String[] args) {
		Laptop l = new Laptop("Dell","Black",60000);
		Mobile m = new Mobile("Realme","Aqua" , 20000);
		System.out.println("Laptop Barand:- "+l.brand+"\nColor:- "+l.color+"\nPrice:- "+l.price);
		System.out.println("Mobile Barand:- "+m.brand+"\nColor:- "+m.color+"\nPrice:- "+m.price);
	}
}
