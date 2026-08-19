package oops.cunstructor;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Realme",15000f,"Black");
		System.out.println(m1.brand+"\n"+m1.price+"\n"+m1.color);
		Mobile m2 = new Mobile("iphone",150000f,"Golden");
		System.out.println(m2.brand+"\n"+m2.price+"\n"+m2.color);

	}

}
