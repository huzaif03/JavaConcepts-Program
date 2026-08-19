package ifelse;

import java.util.Scanner;

public class ArithSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter one from these '+,-,*,/' Sysmbols to perform ");
		char cr = sc.next().charAt(0);
		switch(cr) {
		case '+' : System.out.println("Addition : "+(num1+num2));
		break;	
		case '-' : System.out.println("Subs : "+ (num1-num2));
		break;
		case '*' : System.out.println("Mul : "+num1*num2);
		break;
		case '/' : System.out.println("Divide : "+num1/num2);
		break;
		}

	}

}
