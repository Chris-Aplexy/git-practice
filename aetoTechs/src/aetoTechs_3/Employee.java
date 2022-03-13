package aetoTechs_3;

public class Employee {
	private String name;
	private Address ad;
	
	Employee(String name,Address ad){
		this.ad = ad;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}
	

}
