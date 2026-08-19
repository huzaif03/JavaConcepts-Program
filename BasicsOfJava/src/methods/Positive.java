package methods;

public class Positive {
	public static String a(int num) {
		if(num>=0) {
			System.out.println("positive");
			return "positive";
		}else {
			System.out.println("negative");
			return "negative";
		}
		
	}

	public static void main(String[] args) {
		a(30);
		a(-30);

	}

}
