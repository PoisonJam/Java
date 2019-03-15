
public class BookArray {

	public static void main(String[] args) {
		
		Book[] BookArray = new Book[10];
		
		BookArray[0] = new NonFiction("Arbitrary boring name");
		BookArray[1] = new Fiction("House of Leaves");
		BookArray[2] = new NonFiction("George Bush. AKA TEH DESTROYA");
		BookArray[3] = new Fiction("A wizard of EarthSea");
		BookArray[4] = new NonFiction("Casey Kienzle, why is he sooooo cool?");
		BookArray[5] = new Fiction("The Tombs of Atuan");
		BookArray[6] = new NonFiction("CAN YOU SMELL WHAT THE ROCK IS COOKIN, no really can you?");
		BookArray[7] = new Fiction("A Distant Shore");
		BookArray[8] = new NonFiction("June Kay the, cutest girl in the world");
		BookArray[9] = new Fiction("Killer alien monkey children from the shores of Mars");
		
		for(int x = 0; x < BookArray.length; x++){
			BookArray[x].setPrice();
			System.out.println("The book \"" + BookArray[x].getName() + "\" has a price of $" + BookArray[x].getPrice());
		}
		
	}

}