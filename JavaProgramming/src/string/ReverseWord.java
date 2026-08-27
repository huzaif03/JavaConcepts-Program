package string;

public class ReverseWord {
	public static void main(String[] args) {
		String s = "Java is fun";
		String str = "";
		for(int i = s.length()-1; i>=0;i--) {
			char ch = s.charAt(i);
			if(ch != ' ') {
				str = ch + str;
			}else {
				System.out.print(str+" ");
				str = "";
			}
		}
		System.out.println(str);
	}
}
