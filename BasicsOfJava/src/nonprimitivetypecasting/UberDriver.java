package nonprimitivetypecasting;

import java.util.Scanner;

public class UberDriver {
	
	//Genralization
	static Uber u;
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 1 for Bike \n Enter 2 for auto \n Enter 3 for Cab \n Enter 4 for luxury ");
		int a = sc.nextInt();
		System.out.println("Select the destination:-");
		System.out.println("Enter 1 for - Dilsukh Nagar" );
		System.out.println("Enter 2 for- LV Nagar" );
		System.out.println("Enter 3 for- Nagol" );
		System.out.println("Enter 4 for- Charminar" );
		System.out.println("Enter 5 for- Secunderabad" );
		int d = sc.nextInt();
		if(a == 1) {
			if(d == 1) {
				u = new Bike(40,"Dilshukh Nagar");
			}else if(d == 2) {
				u = new Bike(50,"LV Nagar");
			}else if(d == 3) {
				u = new Bike(70,"Nagol");
			}else if(d == 4) {
				u = new Bike(100,"Charminar");
			}else if(d == 5){
				u = new Bike(140,"Secunderabad");
			}else {
				System.out.println("please enter the correct destination no");
			}
			System.out.println("Your destination is "+u.destination+". and price of bike is "+u.price);
		}else if(a == 2) {
			if(d == 1) {
				u = new Auto(60,"Dilshukh Nagar");
			}else if(d == 2) {
				u = new Auto(80,"LV Nagar");
			}else if(d == 3) {
				u = new Auto(100,"Nagol");
			}else if(d == 4) {
				u = new Auto(200,"Charminar");
			}else if(d == 5){
				u = new Auto(250,"Secunderabad");
			}else {
				System.out.println("please enter the correct destination no");
			}
			System.out.println("Your destination is "+u.destination+". and price of auto is "+u.price);
		}else if(a == 3) {
			if(d == 1) {
				u = new Cab(100,"Dilshukh Nagar");
			}else if(d == 2) {
				u = new Cab(120,"LV Nagar");
			}else if(d == 3) {
				u = new Cab(150,"Nagol");
			}else if(d == 4) {
				u = new Cab(200,"Charminar");
			}else if(d == 5){
				u = new Cab(250,"Secunderabad");
			}else {
				System.out.println("please enter the correct destination no");
			}
			System.out.println("Your destination is "+u.destination+". and price of cab is "+u.price);
		}else if(a == 4) {
			if(d == 1) {
				u = new Luxury(120,"Dilshukh Nagar");
			}else if(d == 2) {
				u = new Luxury(150,"LV Nagar");
			}else if(d == 3) {
				u = new Luxury(200,"Nagol");
			}else if(d == 4) {
				u = new Luxury(300,"Charminar");
			}else if(d == 5) {
				u = new Luxury(400,"Secunderabad");
			}else {
				System.out.println("please enter the correct destination no");
			}
			System.out.println("Your destination is "+u.destination+". and price of Luxury is "+u.price);
		}
			
		
	}
}
