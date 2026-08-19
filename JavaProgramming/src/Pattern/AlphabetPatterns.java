package Pattern;

public class AlphabetPatterns {
	public static void main(String[] args) {
		int num = 5;
		char ch = 'A';
//		for(int i =1; i<= num ; i++) {
//			for(int j =1; j <= num ; j++) {
//					System.out.print(ch+" ");
//			}
//			System.out.println();
//		}
//		A A A A A 
//		A A A A A 
//		A A A A A 
//		A A A A A 
//		A A A A A 

//		for(int i =1; i<= num ; i++) {
//			for(int j =1; j <= num ; j++) {
//					System.out.print(ch++ +" ");
//			}
//			System.out.println();
//		}
//		System.out.println(ch); // Z

//		A B C D E 
//		F G H I J 
//		K L M N O 
//		P Q R S T 
//		U V W X Y 
//		Z
//		for(int i =1; i<= num ; i++) {
//			ch = 'A';
//			for(int j =1; j <= num ; j++) {
//					System.out.print(ch++ +" ");
//			}
//			System.out.println();
//		}
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
		
		
		
//		for(int i =1; i<= num ; i++) {
//			ch = 'A';
//			for(int j =1; j <= num ; j++) {
//				if(i+j <= num+1) {
//					System.out.print(ch++ +" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		A B C D E 
//		A B C D   
//		A B C     
//		A B       
//		A 
		
//task-1	
//		for(int i =1; i<= num ; i++) {
//			for(int j =1; j <= num ; j++) {
//				if((i<=j && i+j <= num+1)|| (i+j >= num+1 && i>=j)) {
//					System.out.print(ch++ +" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//			A B C D E 
//			  F G H   
//			    I     
//			  J K L   
//			M N O P Q
		
//task-2	
//		for(int i =1; i<= num ; i++) {
//			for(int j =1; j <= num ; j++) {
//				if(i+j> num-2 && i-j < num-2 && j-i <num-2 && i+j <= 2*num-2 ) {
//					System.out.print(ch++ +" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		  A     
//	    B C D   
//	  E F G H I 
//	    J K L   
//	      M   
	
		for(int i =1; i<= num ; i++) {
			ch = 'A';
			ch+=i-1;
			char temp = 'A';
			for(int j =1; j <= num ; j++) {
				if(i+j <= num+1) {
					System.out.print(ch++ +" ");
				}else {
					System.out.print(temp++ +" ");
				}
			}
			System.out.println();
		}



	}
}
