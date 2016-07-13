package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Cart {

	private HashMap<Integer, Product> items;
	private Customer customer;
	private Date commandDate;
	private Payment payment;

	public Cart() {
		this.items = new HashMap<Integer, Product>();
	}

	public Cart(HashMap<Integer, Product> items, Customer customer, Date commandDate, Payment payment) {
		super();
		this.items = items;
		this.customer = customer;
		this.commandDate = commandDate;
		this.payment = payment;
	}

	public Entry findItemInCart(Product product) {
		if(this.items.containsValue(product)) {
			Set set = this.items.entrySet();
			Iterator i = set.iterator();
			while(i.hasNext()) {
				Map.Entry entry = (Map.Entry)i.next();
				if(((Product) entry.getValue()).getCode().equalsIgnoreCase(product.getCode())) {
					return entry;
				}	         
			}
		}
		return null;
	}

	public void addItemToCart(Product product, int quantity) {
		try {
			this.items.put(quantity, product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeItemFromCart(Product product) {
		try {
			this.items.remove(this.findItemInCart(product).getKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modifyQuantity(Product product, int newQuantity) {
		try {
			Entry entry = this.findItemInCart(product);
			this.items.remove(entry.getKey());
			this.items.put(newQuantity, product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public double doTotal() {
		double sum;
		sum = 0;
		Set set = this.items.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry entry = (Map.Entry)i.next();
			int q = (int) entry.getKey();
			double quantity = q;
			sum += ((Product)entry.getValue()).getPrice() * quantity;
			System.out.println((Product)entry.getValue() + " " +entry.getKey());
		}
		System.out.println(sum);
		return sum;
	}

	public HashMap<Integer, Product> getItems() {
		return items;
	}

	public void setItems(HashMap<Integer, Product> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getCommandDate() {
		return commandDate;
	}

	public void setCommandDate(Date commandDate) {
		this.commandDate = commandDate;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
