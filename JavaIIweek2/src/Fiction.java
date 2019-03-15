

public class Fiction extends Book {

	@Override
	public void setPrice(){
		price = 24.99;
	
	}
	
	public Fiction(String theName) {
		super(theName);
		this.setPrice();
	}
}