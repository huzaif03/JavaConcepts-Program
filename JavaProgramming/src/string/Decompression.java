package string;

public class Decompression {
	public static void main(String[] args) {
		String str = "A1B4C5"; //ABBBBCCCCC
		String result="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch <= 'Z') {
				char alph = ch;
				if(str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9') {
					int digit = str.charAt(i+1) - '0';
					for(int j = 0; j<digit;j++) {
						result +=alph;
					}
				}
			}
		}
		System.out.println(result);
	}
}

