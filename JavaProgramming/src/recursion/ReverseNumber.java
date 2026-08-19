package recursion;

import java.util.Scanner;

public class ReverseNumber {
	static int rem=0,temp=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		reverse(num);
		System.out.println(temp);
		sc.close();
	}
	static void reverse(int n) {
		if(n <= 0) return;
		rem = n%10;
		temp *=10;
		temp += rem;
		n/=10;
		reverse(n);
	}
}
