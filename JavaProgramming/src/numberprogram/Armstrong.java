package numberprogram;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N:-");
		int n = sc.nextInt();
		int temp = n;
		int digits = 0;
		while(temp>0) {
			digits++;
			temp/=10;
		}
		temp = n;
		int sum=0;
		while(temp>0) {
			int digit = temp%10;
			int power = 1;
			for(int i=0;i<digits;i++) {
				power *=digit; 
			}
			sum+=power;
			temp/=10;
		}
		if(n == sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong number");
		}
		
	}
}
