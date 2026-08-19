package ifelse;

import java.util.Scanner;

public class Scholarship {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		System.out.println("Enter your family income : ");
		int familyIncome = sc.nextInt();
		if(marks >= 85 && familyIncome <=300000) {
			System.out.println("bhai tu le ja ");
		}else {
			System.out.println("Bhai tujhe nahi milti.. ");
		}
	}

}
