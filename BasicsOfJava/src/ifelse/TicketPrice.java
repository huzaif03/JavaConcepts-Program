package ifelse;
import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age < 12) {
			System.out.println("Yeh kiska bachha hai? 100 rs. dijiye");
		}else if(age >= 12 && age <=60){
			System.out.println("Bhai tu 200rs. de");
		}else {
			System.out.println("aap 150 hi de dijiye");
		}
	}

}
