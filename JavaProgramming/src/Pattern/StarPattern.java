package Pattern;

public class StarPattern {
	public static void main(String[] args) {
		int num = 5;
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j<=num ; j++) {
//				if(i == 1 || j == 1 || i == num || j == num || i+j == num+1 || i == j) {
//					System.out.print("* ");
//				}else {
//					System.out.print("- ");
//				}
//			}
//			System.out.println();
////			* * * * * 
////			* * - * * 
////			* - * - * 
////			* * - * * 
////			* * * * * 
//		}

		
//Right-Angle
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j<=num ; j++) {
//				if(i>=j){
//					System.out.print("* ");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		*     
//		* *    
//		* * *   
//		* * * *  
//		* * * * *

		
//		Reverse Right-Angle		
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j<=num ; j++) {
//				if(i+j <= num+1){
//					System.out.print("* ");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		Reverse Right-Angle
////		* * * * * 
////		* * * *  
////		* * *   
////		* *    
////		*   

//Reverse Mirrored-Right-Angle		
//		for(int i =1; i<=num ; i++) {
//		for(int j =1; j<=num ; j++) {
//			if(j>=i){
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}
//
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 

////Mirrored-Right-Angle	
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j<=num ; j++) {
//				if(i+j >= num+1){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
		
//Assignment
/* * * * * *
   *       *
   *   *   *
   *       *
 * * * * * *
 */
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j<=num ; j++) {
//				if(i == 1 || j == 1 || i == 5 || j == 5 || i+j == num+1 && i == j ){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}	
		
		num = 3;		
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j < 2*num ; j++) {
//				if(i+j>num && j-i < num){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}	
//        *         
//      * * *       
//    * * * * *     
//  * * * * * * *   
//* * * * * * * * * 
		
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j < 2*num ; j++) {
//				if(i<=j && i+j <= num*2){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}	
////		* * * * * 
////		  * * *   
////		    *

//		for(int i =1; i< 2*num ; i++) {
//			for(int j =1; j <=num ; j++) {
//				if(i>=j && i+j <= num*2){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
////		*     
////		* *   
////		* * * 
////		* *   
////		* 
		
		
//		for(int i =1; i< 2*num ; i++) {
//			for(int j =1; j <=num ; j++) {
//				if(i+j > num && i-j < num){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//	}
////    * 
////  * * 
////* * * 
////  * * 
////    * 
		num = 5;
//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j <=num ; j++) {
//				if((i<=j && i+j <= num+1) || (i+j >= num+1 && i >= j)){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
////		* * * * * 
////		  * * *   
////		    *     
////		  * * *   
////		* * * * * 


//		for(int i =1; i<=num ; i++) {
//			for(int j =1; j <=num ; j++) {
//				if((i>=j && i+j <= num+1) || (i+j >= num+1 && i <= j)){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
////		*       * 
////		* *   * * 
////		* * * * * 
////		* *   * * 
////		*       * 
	
		
		num = 3;
//		for(int i =1; i< 2*num ; i++) {
//			for(int j =1; j < 2*num ; j++) {
//				if(i+j > num && j-i < num && i -j < num && i+j <3*num){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//	      *     
//	    * * *   
//	  * * * * * 
//	    * * *   
//	      *   
	
//		for(int i =1; i< 2*num ; i++) {
//		for(int j =1; j < 2*num ; j++) {
//			if(i+j > num+1 && j-i < num-1 && i -j < num-1 && i+j <3*num-1){
//				System.out.print("  ");
//			}else {
//				System.out.print("* ");
//			}
//		}
//		System.out.println();
//	}
//		* * * * * 
//		* *   * * 
//		*       * 
//		* *   * * 
//		* * * * * 
		
		
	
	}
}
