package model;

public abstract class Payment {

	private String type;
	private double sum;
	
	public Payment() {
		this.type = "";
		this.sum = 0;
	}

	public Payment(String type, double sum) {
		this.type = type;
		this.sum = sum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
}
