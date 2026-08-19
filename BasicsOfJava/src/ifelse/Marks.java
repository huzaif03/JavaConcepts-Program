package ifelse;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		if(marks >= 90) {
			System.out.println("Super.. Excellent");
		}else if(marks >= 75 && marks < 90 ) {
			System.out.println("very Good");
		}else if(marks >= 50 && marks < 75) {
			System.out.println("Average");
		}else {
			System.out.println("Idiots... Study well");
		}
	}

}
