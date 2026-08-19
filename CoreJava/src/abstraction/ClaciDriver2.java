package abstraction;
//Using Interface 

interface InterfaceCalci {
	int add(int a, int b);

	int sub(int a, int b);

	int mul(int a, int b);
}

interface InterfaceCalciV1 extends  InterfaceCalci{
	public abstract int power(int a, int b);
}

interface InterfaceCalciV2 extends  InterfaceCalci {
	public abstract int square(int a);
}

class ConCalci implements InterfaceCalci {

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

class ConV1 extends ConCalci implements InterfaceCalciV1 {



	@Override
	public int power(int base,int exponent) {
		int c=1;
		for(int i = 1; i<= exponent; i++ ) {
			c*=base;
		}
		return c;
	}
}

class ConV2 extends ConCalci implements InterfaceCalciV2{

	@Override
	public int square(int a) {
		return a*a;
	}
	
}

class CalciDriver2{
	public static void main(String[] args) {
		InterfaceCalci ic = new ConCalci();
		InterfaceCalci iv1 = new ConV1();
		InterfaceCalci iv2 = new ConV2();
		System.out.println(ic.add(2, 3));
		System.out.println(ic.sub(2, 3));
		System.out.println(ic.mul(2, 3));
//		System.out.println(iv1.power(2, 3));
//		System.out.println(iv2.square(2));
	}
}

