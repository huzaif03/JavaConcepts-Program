package task1;

public class ProgramDriver {
	public static void main(String[] args) {
		CurrentStack cs = new CurrentStack();	
		cs.visit("Yt.com");
		cs.visit("amz.com");
		cs.visit("flip.com");
		System.out.println(cs.relode());
		
		cs.backword();
//		cs.backword();
//		cs.backword();
		System.out.println(cs.relode());
		
		cs.forword();
		System.out.println(cs.relode());
	}
}
