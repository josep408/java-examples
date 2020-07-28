package week16;

public class CruiseShip extends Ship {
	
	int passengers;
	String name;
	

public CruiseShip(String n, int p) {
	this.passengers = p;
	this.name = n;
}

public void setPassengers(int p) {
	this .passengers = p;
}


public int getPassengers() {
	return this.passengers;
}

public String toString()
{
String Cruship = "Cruise Ship Details\n";
Cruship += super.toString();
return Cruship;
}


}