package dynamicread;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Addition is : "+ res);
		
		System.out.println("Enter the first Byte type number : ");
		byte b1 = sc.nextByte();
		System.out.println("Enter the second Byte type number : ");
		byte b2 = sc.nextByte();
		System.out.println("Multiply : "+ b1*b2);
		
		System.out.println("Enter a number to store in short type : ");
		short s = sc.nextShort();
		
		System.out.println("Enter a number to store in long type : ");
		long l = sc.nextLong();
		
		System.out.println("Enter a number to store in float type : ");
		float f = sc.nextFloat();
		
		System.out.println("Enter a number to store in double type : ");
		double d = sc.nextDouble();
		
		System.out.println("Short : "+s+"\nLong : "+l+"\nFloat : "+f+"\nDouble : "+d);
		
		System.out.println("Enter your name : ");
		String str = sc.nextLine();
		System.out.println("Name : " +str);
		
//		System.out.println("Enter your gender : ");
		
	}

}
