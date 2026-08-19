package oops;

public class City {

	public static void main(String[] args) {
//		ClassName RefVar = new ClassName(); 
		
		City c1 = new City();
		City c2 = new City();
		City c3 = new City();
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		System.out.println(c3 == c1);
	}

}
