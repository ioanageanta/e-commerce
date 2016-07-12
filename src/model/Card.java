package model;

public class Card extends Payment{

	private String cardNumber;
	private String cvc;
	private String expirationDate;
	
	public Card() {
		super();
	}
	
	public Card(String cardNumber, String cvc, String expirationDate) {
		super();
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.expirationDate = expirationDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
