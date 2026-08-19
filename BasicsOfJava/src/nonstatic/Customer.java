package nonstatic;

public class Customer {
	int cid;
	String cname; 
	
	Customer(int cid, String cname){
		this.cid = cid;
		this.cname = cname;
	}
	{
		System.out.println("IIB-1");
		int a =10,b=20;
		System.out.println("Addition :"+ (a+b));
	}
	{
		System.out.println("IIB-2");
		int a =10,b=20;
		System.out.println("Addition :"+ (b-a));
	}
	public void display() {
		System.out.println("CID :"+cid+"\nCName :"+cname);
	}
}
