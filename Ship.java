package week16;

public class Ship {
	String name;
	String yearBuilt;
	
	public Ship() {
		
	}
	public Ship(String n, String y) {
		this.name = n;
		this.yearBuilt = y;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public void setYearBuilt(String y) {
		this.yearBuilt = y;
		
	}
	
	public String getYearBuilt() {
		return this.yearBuilt;
	}
	public String toString()
	{
	String ship = "Ship Details\n";
	ship += super.toString();
	return ship;
	}
}
