package automobile;

public class Automobiles {

	private int ID;
	private int MPG;
	private int year;
	private String Model;
	private String Make;
	private String Color;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getMPG() {
		return MPG;
	}
	public void setMPG(int mPG) {
		MPG = mPG;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public Automobiles(String theColor, String theMake, String theModel, int theID, int theYear, int theMPG){
		
		Color = theColor;
		Make = theMake;
		Model = theModel;
		
		if(theID < 0 || theID > 9999){
			ID = 0;
		}
		else{
			ID = theID;
		}
		if(theYear < 2000 || theYear > 2017){
			year = 0;
		}
		else{
			year = theYear;
		}
		if(theMPG < 10 || theMPG > 60){
			MPG = 0;
		}
		else{
			MPG = theMPG;
		}
	}

	public void printInfo(){
		System.out.println("The vehicle ID: " + ID + " is a: "+ Model + " which is made by " + Make + " \nin the year: " + year + 
				" it has a color of " + Color + " and has an MPG rating of " + MPG + " miles per gallon\n");
	}
}
