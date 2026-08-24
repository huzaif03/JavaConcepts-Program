package string;

public class FrequencyInString {
	public static void main(String[] args) {
		String s = "apple mango orange";
		int count[] = new int[26]; 
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ') continue;
			count[(int)(ch-'a')]++;
		}
		
		for(int i= 0; i<count.length;i++) {
			if(count[i] != 0) {
				System.out.println((char)(i+'a')+" Frequency is "+count[i]);
			}
		}
	}
}
