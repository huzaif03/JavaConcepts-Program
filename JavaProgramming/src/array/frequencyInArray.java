package array;

public class frequencyInArray {
	public static void main(String[] args) {
//		int []a = new int[20];
//		for(int i = 0; i<a.length;i++) {
////			a[i]=(int)(Math.random()*(Math.pow(2, 32)-Math.pow(2, -32+1))+Math.pow(2, -32));
//			a[i]=(int)(Math.random()*(100-000);
//
//		}
		int [] a = {1,2,3,4,1,5,7,1,2,4,3,2,5,9,2,3,8};
		for(int i=0;i<a.length;i++) {
			int count=1;
			if(a[i]==Integer.MIN_VALUE)continue;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j] = Integer.MIN_VALUE;
				}
			}
			System.out.println("Freaquency of "+a[i]+ " = "+count);
		}
	}
}
