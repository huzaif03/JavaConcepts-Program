package loop;
import java.util.Scanner;
public class DoWhile1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number");
			if(sc.nextInt() == 0)break;
		}while(true);
	}
}
