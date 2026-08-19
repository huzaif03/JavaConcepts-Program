package numberprogram;

import java.util.Scanner;

public class TechOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N:-");
		int n = sc.nextInt();
		int digits = 0;
		int temp = n;
		while(temp>0) {
			digits++;
			temp/=10;
		}
		if(digits % 2 != 0 ) 
			System.out.println("Not a tech No.");
		else {
			temp = n;
			int divisor = 1;
			for(int i=0;i<digits/2;i++) {
				divisor *=10;
			}
			System.out.println(divisor);
			int secondhalf = temp%divisor;;
			int firsthalf = temp/divisor;;
				
			
				int sum = firsthalf + secondhalf;
			if(sum*sum == n) {
				System.out.println("Tech No");
			}else {
				System.out.println("Non-Tech Number");
			}
		}
	}
}
