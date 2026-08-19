package recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int result = fact(num);
		System.out.println("Factorail of "+num+" is: "+result);
		sc.close();
	}
	static int fact(int num) {
		if(num == 0) return 1;
		if(num == 1) return 1;
		return num*fact(num-1);
	}
}
