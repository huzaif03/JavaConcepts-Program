package array;

import java.util.Scanner;

public class PossibleSubArraysEqualsToK {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the K. (elements Number you want sub Array)");
		int k= sc.nextInt();
		
		for(int i = 0;i<a.length;i++) {
			for(int j = i; j< a.length;j++) {
				if(j-i == k-1) {
					for(int l= i;l<=j;l++) {
						System.out.print(a[l]+" ");
					}
				}
			}
			System.out.println();
		}
	}
}
