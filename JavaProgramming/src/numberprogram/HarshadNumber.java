package numberprogram;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp>0) {
			int digit = temp%10;
			sum+=digit;
			temp/=10;
		}
		if(n%sum == 0) {
			System.out.println(n+" is a Harshad Number");
		}else {
			System.out.println(n+" is not Harshad Number");
		}
	}
}
