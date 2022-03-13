package aetoTechs_3;

public class Address {
	int number;
	String streetname;
	
	Address(){
		
	}
	Address(int number,String streetname){
		this.number = number;
		this.streetname = streetname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	@Override
	public String toString() {
		return "streetNumber: " +number +" " +"streetname: "+streetname;
	}
}
