package loop;

import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		boolean res = false;
		do {
			
			System.out.println("Welcome");
			System.out.println("Do you want to print again ? Yes ---> Y or y ");
			char ch = sc.next().charAt(0);
			if(ch == 'Y' || ch == 'y') res = true;
			else res = false;
		}while(res == true);
		sc.close();

	}

}
