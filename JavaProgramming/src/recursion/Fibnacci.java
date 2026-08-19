package recursion;

import java.util.Scanner;

public class Fibnacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		for(int i=0; i<=num;i++) {
			System.out.print(fibnacci(i) +" ");
		}
	}
	static int fibnacci(int n) {
		if(n <= 1 ) return n;
		
		return fibnacci(n-1)+fibnacci(n-2);
	}

}
