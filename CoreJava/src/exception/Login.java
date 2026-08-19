package exception;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		int password = 151515;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("Enter Password");
			int pw= sc.nextInt();
			if(pw == password) {
				System.out.println("Login successfull");
			}else {
				try {
					throw new InvalidPasswordException("Enter a valid password");
				}catch(InvalidPasswordException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
