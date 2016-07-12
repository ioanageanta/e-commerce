package model;

public class Cash extends Payment{

	private String address;
	
	public Cash() {
		super();
	}
	
	public Cash(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
