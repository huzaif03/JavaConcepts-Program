package nonprimitivetypecasting;

//instance of is an operator like new
public class AnimalDeriver {
	public static void main(String[] args) {
		Animal a = new Cat(); //Upcasting
		if(a instanceof Dog) {
			Dog d  = (Dog)a;	//down Casting
			d.sound2();
		}else {
			Cat c = (Cat)a;
			c.sound1();
		}
		
	}
}
