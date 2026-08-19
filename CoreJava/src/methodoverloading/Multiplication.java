package methodoverloading;

public class Multiplication {
	
	public static void multiplication(int a, int b) {
		System.out.println("Multiplication of two integers is :"+a*b);
	}
	public static void multiplication(int a, double b) {
		System.out.println("Multiplication of one integer and one double is :"+a*b);
	}
	public static void multiplication(double a, int b) {
		System.out.println("Multiplication of one double and one integer is :"+a*b);
	}
	public static void multiplication(double a, double b) {
		System.out.println("Multiplication of two double is :"+a*b);
	}
	public static void main(String[] args) {
		multiplication(50, 60);
		multiplication(5, 7.5);
		multiplication(3.7, 6);
		multiplication(8.76, 12.8);

	}

}
