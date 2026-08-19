package nonprimitivetypecasting;

import java.util.Scanner;

class Zomato {
	String name = "Zomato";
}

class Biryani extends Zomato {
	double price = 250.0;
}

class Mandi extends Zomato {
	double price = 500.0;
}

class Kunafa extends Zomato {
	double price = 350.0;
}

public class Driver4 {
	public static void orderFood(Zomato z) {
		if (z instanceof Biryani) {
			Biryani b = (Biryani) z;
			System.out.println("AppName:- " + b.name + "\n" + "Price:- " + b.price);
			System.out.println("Downcasting for Biryani");
		} else if (z instanceof Mandi) {
			Mandi m = (Mandi) z;
			System.out.println("AppName:- " + m.name + "\n" + "Price:- " + m.price);
			System.out.println("Downcasting for Mandi");
		} else {
			Kunafa k = (Kunafa) z;
			System.out.println("AppName:- " + k.name + "\n" + "Price:- " + k.price);
			System.out.println("Downcasting for Kunafa");

		}
	}

	public static void main(String [] args) {
		Scanner sc  = new Scanner(System.in);
		boolean flag =true;
		while(flag) {
			System.out.println("Welcome to Zomato");
			System.out.println("Enter your choice");
			System.out.println("1.Biryani\n2.Mandi\n3.Kunafa\n4.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: {
				orderFood(new Biryani());
			}break;
			case 2: {
				orderFood(new Mandi());
			}break;
			case 3: {
				orderFood(new Kunafa());
			}break;
			case 4: {
				flag = false;
				System.out.println("ThankYou!");
			}break;
			default: {
				System.out.println("Dabba fellow enter the valid choice");
			}
			}
		}
		System.out.println("---------------------");
	}
}
