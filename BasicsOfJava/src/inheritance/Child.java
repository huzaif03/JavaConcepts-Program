package inheritance;

public class Child extends Parent{
	public static void childDemo1() {
		System.out.println("Static method from Child class");
	}
	public void childDemo2() {
		System.out.println("Non-static method from Child class");
	}

	public static void main(String[] args) {
		//With respect to Static member
//		System.out.println(age);
//		dance();
//		
//		//With respect to non-static members
//		Child c = new Child();
//		System.out.println(c.price);
//		c.buying();
		
		System.out.println("'Directly' calling all methods");
		//We can directly call only static members from both Parent and Child
		childDemo1();
		parentDemo1();
		//Becouse of non-satatic, below methods not possible to call directly 
//		childDemo2();
//		parentDemo2();
		System.out.println();
		
		
		
		System.out.println("Calling all methods with 'Child Class Name'");
		Child.childDemo1();
		Child.parentDemo1();
		//We can't call the non-static member with the class name 
//		Child.childDemo2();
//		Child.parentDemo2(;)
		System.out.println();
		
		
		
		System.out.println("Calling all methods with 'Parent Class Name'");
		Parent.parentDemo1();	
		//We can't call the non-satic member with class name and also we can't call the Child member with Parent class name
//		Parent.parentDemo2();
//		Parent.childDemo1();
//		Parent.childDemo2();
		System.out.println();
		
		
		
		System.out.println("Calling all the methods with 'Child class Object ref.'");
		//We can call all the methods from Parent & Child Class with the Child class object refrence
		Child c = new Child();
		c.childDemo1();
		c.childDemo2();
		c.parentDemo1();
		c.parentDemo2();
		System.out.println();
		
		
		
		System.out.println("Calling all the methods with the 'Parent Class Obect ref.'");
		Parent p = new Parent();
		p.parentDemo1();
		p.parentDemo2();
		//We can't call the Child class method with Parent Class Object refrence
//		p.childDemo1();
//		p.childDemo2();
		System.out.println();
	}

}
