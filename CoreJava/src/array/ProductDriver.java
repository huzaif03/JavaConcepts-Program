package array;

import java.util.Scanner;

public class ProductDriver {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of products");
		int size = sc.nextInt();
		Products p[] = new Products[size];
		for(int i = 0 ;i<p.length;i++) {
			System.out.println("Enter the name of product");
			String name = sc.next();
			System.out.println("Enter the price of product");
			int price = sc.nextInt();
			p[i] = new Products(name,price);
		}
		
		for(int i = 0 ; i<p.length;i++) {
			sum+=p[i].price;
		}
		System.out.println("Total price of Products :-"+sum);
	}
}
