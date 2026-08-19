package loop;

public class SumofOdd {

	public static void main(String[] args) {
		int temp = 0;
		for(int i = 1; i <= 20; i++) {
			if(i%2 != 0) {
				temp+=i;
			}
		}
		System.out.println("Sum of Odd numbers : "+temp);

	}

}
