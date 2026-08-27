package task1solvedbysir;

public class ProgramDriver {
	public static void main(String[] args) {
		BrowserStack bs = new BrowserStack();
		bs.visit("Youtube.com");
		bs.visit("Amazon.com");
		bs.visit("Flipkart.com");
		String currentWeb = bs.relode();
		System.out.println(currentWeb);
		
		bs.backword();
		System.out.println(bs.relode());
		bs.backword();
		System.out.println(bs.relode());
		bs.backword();
		System.out.println(bs.relode());
		bs.forword();
		System.out.println(bs.relode());
	}


}
