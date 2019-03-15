
public abstract class Book {

	private String name;
	protected double price;
	
	public String getName(){
		return name;
	}
	
	public abstract void setPrice();
	
	public double getPrice(){
		return price;
	}
	
	public Book(String theName){
		this.name = theName;
	}
}

