package loop;

public class SumofEven {

	public static void main(String[] args) {
		int i = 1, temp = 0;
		while(i <= 20) {
			if(i%2 == 0) {
				temp+=i;
			}
			i++;
		}
		System.out.println("Sum of Even numbers : "+temp);

	}

}
