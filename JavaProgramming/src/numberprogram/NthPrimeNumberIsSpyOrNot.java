package numberprogram;

import java.util.Scanner;

public class NthPrimeNumberIsSpyOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth Number");
		int n = sc.nextInt();
		
		int count = 0;
		boolean flag = true;
		for(int i = 2;; i++) {
			for(int j = 2; j<=i/2; j++ ) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
			if(count == n) {
				System.out.print(n+"th Prime Number is "+i);
				n = i;
				break;
			}
		}
		int sum = 0;
		int product = 1;
		while(n>0) {
			int digit = n%10;
			sum+=digit;
			product*=digit;
			n = n/10;
		}
		if(sum == product) {
			System.out.println(" and also a spy number also");
		}else {
			System.out.println(" But not a spy number");
		}
	}
}
