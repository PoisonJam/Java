
public class NonFiction extends Book {

	@Override
	public void setPrice(){
		price = 37.99;
	
	}
	
	public NonFiction(String theName) {
		super(theName);
		this.setPrice();
	}
}
