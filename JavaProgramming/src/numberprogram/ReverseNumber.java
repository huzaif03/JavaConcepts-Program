package numberprogram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N:-");
		int n = sc.nextInt();
		int temp=n;
		int reverse = 0;
		while(temp>0) {
			int value = temp%10;
			reverse =reverse*10 + value;
			temp=temp/10;
		}
		System.out.println("Revrse of "+n+" = "+reverse);
		
	}
}
