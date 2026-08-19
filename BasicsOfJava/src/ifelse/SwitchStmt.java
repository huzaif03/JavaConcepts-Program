package ifelse;
import java.util.Scanner;
public class SwitchStmt {

	public static void main(String[] args) {
//		int a = 12;
//		switch(a) {
//		case 0 : System.out.println("Rahman Baloch");
//				 break; 
//		case 1 : System.out.println("Hamza Ali Mazari...Syso");
////				 break;
//		case 2 : System.out.println("Yaleena");
//				 break;
//		case 3 : System.out.println("Iqbal..");
//				 break;
//		default : System.out.println("Tata Bye bye...");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Khana");
		int num = sc.nextInt();
		switch(num) {
			case 1 : System.out.println("Biryani...");
			case 2 : System.out.println("Double ka mitha...");
			case 3 : System.out.println("Gulab Jamun...");
			case 4 : System.out.println("Nihari...");
			case 5 : System.out.println("Kubani ka mitha...");
			case 6 : System.out.println("Kabab...");
			case 7 : System.out.println("Mandi...");
		}
	}

}
