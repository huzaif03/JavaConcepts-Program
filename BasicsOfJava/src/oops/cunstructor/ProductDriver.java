package oops.cunstructor;

public class ProductDriver {

	public static void main(String[] args) {
		Product p1 = new Product(101,"Shirt",300);
		Product p2 =new Product(102 , "Pant",600);
		System.out.println(p1.pid+"\n"+p1.pname+"\n"+p1.price);
		System.out.println(p2.pid+"\n"+p2.pname+"\n"+p2.price);
		
	}

}
