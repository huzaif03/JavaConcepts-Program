package inheritance;

public class DairyMilk extends Chocolate{
	String type;
	DairyMilk(int price,String type){
		super(price);
		this.type = type;
	}
}
