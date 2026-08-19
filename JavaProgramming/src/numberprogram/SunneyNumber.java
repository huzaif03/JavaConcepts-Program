package numberprogram;

import java.util.Scanner;

public class SunneyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n = sc.nextInt();
		n=n+1;
		int sqroot = 1;
		for(int i=2 ; i<=n/2;i++) {
			sqroot= i*i;
			if(sqroot == n)
				break;
		}
		if(sqroot == n){
			System.out.println("Sunney Number");
		}else {
			System.out.println("Not a Sunney Number");
		}
	}
}
