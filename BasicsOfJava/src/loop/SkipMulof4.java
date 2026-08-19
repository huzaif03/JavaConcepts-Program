package loop;

public class SkipMulof4 {
	public static void main(String[] args) {
		System.out.println("Skipping multiple of 4");
		for(int i = 1; i <= 100; i++) {
			if(i%4 == 0)continue;
			System.out.print(" "+i);
		}
		System.out.println();
	}
}
