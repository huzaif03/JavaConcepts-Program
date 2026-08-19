package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	
	//Arrays.binarySearch(a,target);   Built-in methods
	public static void main(String[] args) {
		
		int a[] = {5,7,1,3,6,4,9,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value you want to search");
		int target = sc.nextInt();

		Arrays.sort(a);
		int low = 0;
		int high = a.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(a[mid] == target) {
				System.out.println(target+" is persent at index "+mid);
				break;
			}else if(a[mid] > target) {
				high = mid-1;
			}else {
				low = mid+1;
			}	
		}
		if(low > high)
			System.out.println("Element not persent in the array");
		
//		int b = Arrays.binarySearch(a,target);
//		System.out.println(b);
	}
}
