package week16;

public class CargoShip extends Ship {
	int tonnage;
	String name;
	
	
	public CargoShip (int t, String n) {
		this.tonnage = t;
		this.name = n;
	
	}
	
	public void setTonnage(int t) {
		
		this.tonnage = t;
		
	}
	
	public int getTonnage() {
		return this.tonnage;
	}
	
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public String toString()
	{
	String Cship = "Cargo Ship details\n";
	Cship += super.toString();
	return Cship;
	}

}
