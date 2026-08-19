package loop;

public class NestedLoop2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 7; j++) {
				if(j%2 != 0) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
