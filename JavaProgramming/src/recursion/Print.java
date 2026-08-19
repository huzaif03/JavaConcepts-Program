package recursion;

public class Print {
	public static void print(int n) {
		if(n == 5) return;
		System.out.println("Hello World");
		//System.out.println(n++);
		//n++ and n-- will not work in the method calling statement because method caller not giving chance to increase it already call with the same number n 
		print(n+1);
	}
	public static void main(String[] args) {
		Print.print(0);
		return;

	}

}
