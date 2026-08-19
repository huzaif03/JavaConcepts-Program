package methods;

//Parmeterized methods
public class ParameterizedExample1 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		add(10, 20);
		System.out.println("Main ends");

	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

}
