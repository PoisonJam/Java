package java1final;

public class ApatmentTest {

	public static void main(String[] args) {
		
		Apartment John = new Apartment("John", 5, 800.00, "yes");
		Apartment Smith = new Apartment("Smith", 2, 800.00, "no");
		Apartment Mary = new Apartment("Mary", 2, 800.00, "yes");
		
		John.addPetfee();
		Smith.addPetfee();
		Mary.addPetfee();
		
		System.out.println("The first apartment belongs to " + John.getTenant_name() + 
				"\nThere are " + John.getFamily_members() + " family members living in the apartment"
				+ "\nTheir total monthly rent is $" + John.getMonthly_rent() + "\n");
	
		System.out.println("The second apartment belongs to " + Smith.getTenant_name() + 
				"\nThere are " + Smith.getFamily_members() + " family members living in the apartment"
				+ "\nTheir total monthly rent is $" + Smith.getMonthly_rent() + "\n");
		
		System.out.println("The Third apartment belongs to " + Mary.getTenant_name() + 
				"\nThere are " + Mary.getFamily_members() + " family members living in the apartment"
				+ "\nTheir total monthly rent is $" + Mary.getMonthly_rent() + "\n");
	}
}
