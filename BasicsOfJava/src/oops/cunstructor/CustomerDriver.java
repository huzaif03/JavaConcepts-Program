package oops.cunstructor;

public class CustomerDriver {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.cid=101;
		c.cname = "Hujaifa Majeed";
		c.phone = 9876543211l;
		System.out.println(Long.MAX_VALUE);
		System.out.println(c.cid);
		System.out.println(c.cname);
		System.out.println(c.phone);
	}
}
