package abstraction;

//Using Absrtract  class

abstract class AbstractCalci{
	public abstract int add(int a,int b);
	public abstract int sub(int a,int b);
	public abstract int mul(int a,int b);
}
abstract class CalciVersion1 extends AbstractCalci{
	public abstract int power(int a,int b);
}
abstract class CalciVersion2 extends AbstractCalci{
	public abstract int square(int a);
}
class Calci extends AbstractCalci{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	
}
class ConAbsVersion1 extends CalciVersion1{

	@Override
	public int power(int base,int exponent) {
		int c=1;
		for(int i = 1; i<= exponent; i++ ) {
			c*=base;
		}
		return c;
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
class ConAbsVersion2 extends CalciVersion2{

	@Override
	public int square(int a) {
		return a*a;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
public class CalciDriver {
	public static void main(String[] args) {
		AbstractCalci c = new Calci();
		AbstractCalci cv1 = new ConAbsVersion1();
		AbstractCalci cv2 = new ConAbsVersion2();
		if(c instanceof Calci) {
			Calci cd = (Calci)c;
			System.out.println("Add:-"+cd.add(10, 20));
			System.out.println("Sub:-"+cd.sub(20,10));
			System.out.println("Mul:-" +cd.mul(10, 20));
			System.out.println("This is The Calci class Block Execution From Calci Object");
			System.out.println("----------------------------");
		}else if(c instanceof ConAbsVersion1) {
			ConAbsVersion1 cav1 = (ConAbsVersion1) c;
			System.out.println("Add:-"+cav1.add(10, 20));
			System.out.println("Sub:-"+cav1.sub(20,10));
			System.out.println("Mul:-" +cav1.mul(10, 20));
			System.out.println("Power :-"+cav1.power(2, 4));
			System.out.println("This is ConAbsVersion1 The  class Block Execution From Calci Object");
			System.out.println("----------------------------");
		}else {
			ConAbsVersion2 cav2 = (ConAbsVersion2) c;
			System.out.println("Add:-"+cav2.add(10, 20));
			System.out.println("Sub:-"+cav2.sub(20,10));
			System.out.println("Mul:-" +cav2.mul(10, 20));
			System.out.println("Square:- "+cav2.square(8));
			System.out.println("This is ConAbsVersion1 The  class Block Execution From Calci Object");
			System.out.println("----------------------------");
		}
		if(cv1 instanceof Calci) {
			Calci cd = (Calci)cv1;
			System.out.println("Add:-"+cd.add(40, 20));
			System.out.println("Sub:-"+cd.sub(40,20));
			System.out.println("Mul:-" +cd.mul(40, 20));
			System.out.println("This is The Calci class Block Execution from ConAbsVersion1");
			System.out.println("----------------------------");
		}else if(cv1 instanceof ConAbsVersion1) {
			ConAbsVersion1 cav1 = (ConAbsVersion1) cv1;
			System.out.println("Add:-"+cav1.add(40, 20));
			System.out.println("Sub:-"+cav1.sub(40,20));
			System.out.println("Mul:-" +cav1.mul(40, 20));
			System.out.println("Power :-"+cav1.power(3, 4));
			System.out.println("This is ConAbsVersion1 The  class Block Execution from ConAbsVersion1");
			System.out.println("----------------------------");
		}else {
			ConAbsVersion2 cav2 = (ConAbsVersion2) cv1;
			System.out.println(cav2.add(10, 20));
			System.out.println(cav2.sub(20,10));
			System.out.println(cav2.mul(10, 20));
			System.out.println("Square:- "+cav2.square(9));
			System.out.println("This is ConAbsVersion1 The  class Block Execution from ConAbsVersion1");
			System.out.println("----------------------------");
		}
		if(cv2 instanceof Calci) {
			Calci cd = (Calci)cv2;
			System.out.println("Add:-"+cd.add(60, 30));
			System.out.println("Sub:-"+cd.sub(60,30));
			System.out.println("Mul:-" +cd.mul(60, 30));
			System.out.println("This is The Calci class Block Execution From ConAbsVersion2");
			System.out.println("----------------------------");
		}else if(cv2 instanceof ConAbsVersion1) {
			ConAbsVersion1 cav1 = (ConAbsVersion1) cv2;
			System.out.println("Add:-"+cav1.add(60, 30));
			System.out.println("Sub:-"+cav1.sub(60,30));
			System.out.println("Mul:-" +cav1.mul(60, 30));
			System.out.println("Power :-"+cav1.power(4, 4));
			System.out.println("This is ConAbsVersion1 The  class Block Execution From ConAbsVersion2");
			System.out.println("----------------------------");
		}else {
			ConAbsVersion2 cav2 = (ConAbsVersion2) cv2;
			System.out.println(cav2.add(60, 30));
			System.out.println(cav2.sub(60,30));
			System.out.println(cav2.mul(60, 30));
			System.out.println("Square:- "+cav2.square(10));
			System.out.println("This is ConAbsVersion1 The  class Block Execution From ConAbsVersion2");
			System.out.println("----------------------------");
		}
		
		
	}
}
