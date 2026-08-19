package ifelse;

import java.util.Scanner;

public class ATMWithdrawal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Balance : ");
		int balance = sc.nextInt();
		System.out.println("Enter the amount : ");
		int amount = sc.nextInt();
		
		if(balance >= amount && amount%100==0) {
			System.out.println("You can withdrwal your amount....");
		}else if(amount%100!= 0){
			System.out.println("Enter the amount in multiple of 100");
		}else {
			System.out.println("Insufficent Balance");
		}
		

	}

}
