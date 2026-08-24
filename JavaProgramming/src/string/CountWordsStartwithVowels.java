package string;

public class CountWordsStartwithVowels {
	public static void main(String[] args) {
		String s = "Apple is Orrange and Umbrella";
		int c =count(s);
		System.out.println(c);
		
	}
	public static int count(String s) {
		
		String str = "AEIOUaeiou";
		int c =0;
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((i == 0 && ch != ' ') || (ch != ' ' && s.charAt(i-1) == ' ')) {
				if(str.contains(ch+"")) {
					c++;
				}
			}
		}
		return c;
		
	}
}
