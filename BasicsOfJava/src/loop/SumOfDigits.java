package loop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = 0;
		while(true) {
			if(num < 10) {
				temp+=num;
				break;
			}
			temp += num%10;
			num = num/10;
			
		}
		System.out.println(temp);
	}

}
