package numberprogram;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n = sc.nextInt();
		int sqr = n*n;
		int temp = sqr;
		int sum = 0;
		while(temp>0) {
			int digit = temp%10;
			sum+=digit;
			temp/=10;
		}
		if(sum == n)
			System.out.println("Neon Number");
		else {
			System.out.println("Not a Neon Number");
		}
	}
}
