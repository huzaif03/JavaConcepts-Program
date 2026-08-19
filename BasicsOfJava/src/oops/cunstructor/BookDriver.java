package oops.cunstructor;

public class BookDriver {
	public static void main(String[] args) {
		Book b1 = new Book("Java", "Narsimha",500.0f);
		Book b2 = new Book("C", "Rao" , 300.0f);
		System.out.println(b1.name+"\n"+b1.author+"\n"+b1.price);
		System.out.println(b2.name+"\n"+b2.author+"\n"+b2.price);
	}
}
