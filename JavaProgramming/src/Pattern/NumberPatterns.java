package Pattern;

public class NumberPatterns {

	public static void main(String[] args) {
		int num = 5;
//		for(int i =1; i<= num ; i++) {
//			//int n = 1; n+=i-1;
//			//int n = i;
//			int m = 1;
//			for(int j =1; j <= num ; j++) {
//				if(i+j <= num+1) {
//					System.out.print(n++ +" ");
//				}else {
//					System.out.print(m++ +" ");
//				}
//			}
//			System.out.println();
//		}
//		1 2 3 4 5 
//		2 3 4 5 1 
//		3 4 5 1 2 
//		4 5 1 2 3 
//		5 1 2 3 4 
		
//		for(int i =1; i<= num ; i++) {
//			int n = num-i+1;
//			for(int j =1; j <= num ; j++) {
//				if(i >= j) {
//					System.out.print(n++ +" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		5         
//		4 5       
//		3 4 5     
//		2 3 4 5   
//		1 2 3 4 5 
		
		num = 3;
//		for(int i =1; i<= num ; i++) {
//			int n = 1, m=i;
//			for(int j =1; j < 2*num ; j++) {
//				if(i+j > num && j-i < num) {
//					if(j<num) {
//						System.out.print(n++ +" ");
//					}else {
//						System.out.print(n-- +" ");
//					}
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//	      1     
//	    1 2 1   
//	  1 2 3 2 1 

		
		for(int i =1; i<= num ; i++) {
			int n = i, m=1;
			for(int j =1; j < 2*num ; j++) {
				if(i+j > num && j-i < num) {
					if(j<num) {
						System.out.print(n-- +" ");
					}else {
						System.out.print(m++ +" ");
					}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
