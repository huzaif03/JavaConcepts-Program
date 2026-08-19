package nonstatic;

public class Employe {
	int sal = 2000;
	Employe(){
		System.out.println("Hello");
	}
	//IIB -1 (Instance Initializer Block)
	{
		System.out.println(sal);
		System.out.println("From IIB-1");
	}
	//IIB -2 (Instance Initializer Block)
	{
		System.out.println("from IIB-2");
	}
}
