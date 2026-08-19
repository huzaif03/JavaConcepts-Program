package array;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,1,5,7,1,2,4,3,2,5,9,2,3,8};
		int	uniqueArray[] = new int [a.length]; 
		int x = 0;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
						count++;
						a[j]=Integer.MIN_VALUE;
				}
			}
			if(a[i] != Integer.MIN_VALUE) {
				uniqueArray[x++] = a[i];
			}
		}
		
		for(int i = 0; i<uniqueArray.length;i++) {
			if(uniqueArray[i]==0 && uniqueArray[i+1] == 0) break;
			System.out.print(uniqueArray[i]+" ");
			
		}
		System.out.println();
	}
}
