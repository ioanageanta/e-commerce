package model;

public class Product {
	
	private String code;
	private String name;
	private double price;
	private String description;
	
	public Product() {}

	public Product(String code, String name, double price, String description) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return this.name + "---" + this.description + "---" + this.price + " RON";
	}
}
