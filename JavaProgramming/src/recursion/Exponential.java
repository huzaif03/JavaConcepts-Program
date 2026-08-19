package recursion;

import java.util.Scanner;

public class Exponential {
	static long result=1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number");
		int base = sc.nextInt();
		System.out.println("Enter the number ");
		int power = sc.nextInt();
		result= exponential(base,power);
		System.out.println(base+" power of "+power+ " = "+result);
	}
	public static long exponential(int base, int power) {
		if(power <= 0) return 1;
		return base*exponential(base,power-1);
	}

}
