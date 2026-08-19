package loop;

public class Divisible {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 100) {
			if(i%4 == 0 && i%6 != 0) {
				System.out.print(" "+i);
			}
			i++;
		}

	}

}
