package anonymusclass;

public class ProgramDriver {
	public static void main(String[] args) {
		Calculator c1 = new Calculator() {
			
			public void calculate(int a ,int b) {
				System.out.println(a+b);
			}
		};
		c1.calculate(10, 20);
	}
}
