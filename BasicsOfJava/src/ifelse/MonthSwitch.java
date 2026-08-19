package ifelse;
import java.util.Scanner;
public class MonthSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first three letter of month");
		String str = sc.nextLine();
		switch(str) {
		case "jan" : System.out.println("January");
		case "feb" : System.out.println("February");
		case "mar" : System.out.println("March");
		case "apr" : System.out.println("Aprail");
		case "may" : System.out.println("May");
		case "jun" : System.out.println("June");
		case "jul" : System.out.println("July");
		case "aug" : System.out.println("August");
		case "sep" : System.out.println("September");
		case "oct" : System.out.println("October");
		case "nov" : System.out.println("November");
		case "dec" : System.out.println("December");
		
		}

	}

}
