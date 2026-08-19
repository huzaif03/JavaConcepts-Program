package has_a_relationship;

public class Phone {
	private String pbrand;
	//early instantiation
	private Sim s = new Sim();
	//Setter for phone Brand
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	//Getter for Phone Brand
	public String getPbrand() {
		return pbrand;
	}
	//Getter for Sim Object
	public Sim getSim() {
		return s;
	}
}
