package ifelse;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number(+ve or -ve)");
		int num = sc.nextInt();
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		}else {
			if(num%2 == 0) {
				System.out.println("NegativeEven");
			}else {
				System.out.println("NegativeOdd");
			}
			
			
		}
		

	}

}
