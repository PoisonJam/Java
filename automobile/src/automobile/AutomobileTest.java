package automobile;

public class AutomobileTest {

	public static void main(String[] args) {
		
		Automobiles BatMobile = new Automobiles("Black", "GOD", "Batmobile", 1, 2014, 30);
		Automobiles Hooptie = new Automobiles("Silver", "Ford", "Tempo", 84656516, 1991, 4);
		Automobiles TooNew = new Automobiles("Green", "Subaru", "WRX-STI", -20, 2020, 99);
		
		BatMobile.printInfo();
		Hooptie.printInfo();
		TooNew.printInfo();
	}

}
