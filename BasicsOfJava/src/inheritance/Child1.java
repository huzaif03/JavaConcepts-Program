package inheritance;

public class Child1 extends Parent1 {
	Child1(){
		System.out.println("From Child1 Construuctor");
	}
	static{
		System.out.println("Child1 is loaded");
	}
	public static void hello() {
		System.out.println("from Child1 hello");
	}
}
