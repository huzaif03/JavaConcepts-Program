package methods;

//No args. methods
public class ArithmaticMethods {

	public static void main(String[] args) {
		System.out.println("Main starts");
		add();
		sub();
		mul();
		div();
		System.out.println("Main ends");

	}

	// no args method for addition
	public static void add() {
		int a = 10, b = 20;
		System.out.println("Addition : " + (a + b));
	}

	// no args method for substraction
	public static void sub() {
		int a = 10, b = 20;
		System.out.println("Substraction : " + (b - a));
	}

	// no args method for multiplication
	public static void mul() {
		int a = 10, b = 20;
		System.out.println("Multiplication : " + a * b);
	}

	// no args method for division
	public static void div() {
		int a = 10, b = 20;
		System.out.println("Division : " + b / a);
	}
}
