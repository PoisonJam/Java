package java1final;

public class Apartment {

	String tenant_name;
	int family_members;
	double monthly_rent;
	String any_pets;
	
	public String getTenant_name() {
		return tenant_name;
	}
	public void setTenant_name(String tenant_name) {
		this.tenant_name = tenant_name;
	}
	public int getFamily_members() {
		return family_members;
	}
	public void setFamily_members(int family_members) {
		this.family_members = family_members;
	}
	public double getMonthly_rent() {
		return monthly_rent;
	}
	public void setMonthly_rent(double monthly_rent) {
		this.monthly_rent = monthly_rent;
	}
	public String getAny_pets() {
		return any_pets;
	}
	public void setAny_pets(String any_pets) {
		this.any_pets = any_pets;
	}
	
	public Apartment(String theName, int famMembers, double theRent, String anyPets){
		
		this.tenant_name = theName;
		this.family_members = famMembers;
		this.any_pets = anyPets;
		
		if(famMembers > 3){
			this.monthly_rent = theRent + 200;
		}
		else{
			this.monthly_rent = theRent;
		}
	}

	public void addPetfee(){
		
		while(any_pets.equalsIgnoreCase("YES")){
			monthly_rent += 20;
			any_pets = "No";
		}
	}
}
