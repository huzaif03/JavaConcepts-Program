package recursion;

public class Sum {
	static int add = 0;
	public static void main(String[] args) {
		summation(1);
		System.out.println(add);
	}
	
	public static void summation(int n) {
		if(n==6)return;
		add+=n;
		summation(n+1);
	}
}
