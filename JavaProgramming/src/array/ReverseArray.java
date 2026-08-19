package array;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		for(int start=0,end=a.length-1;start<end;start++,end--) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
		}
		for(int i = 0; i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
