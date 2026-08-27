package lambda;

public class ProgramDriverForLambda {
	public static void main(String[] args) {
		Calculator c1 = (int a ,int b)->{
			int c =a+b;
			System.out.println(c);
		};
		Calculator c2 = (int a , int b) -> System.out.println(a-b);
		c1.calculate(10, 20);
		c2.calculate(10, 20);
	}
}
