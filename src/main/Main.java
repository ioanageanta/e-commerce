package main;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import model.Cart;
import model.Cash;
import model.Customer;
import model.Payment;
import model.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer("John Doe", 35, "johndoe@gmail.com");
		
		Product headphones = new Product();
		headphones.setCode("123");
		headphones.setDescription("Skull Candy, 2.3 mm");
		headphones.setName("Skull Candy Headphones");
		headphones.setPrice(140);
		
		Product brush = new Product();
		brush.setCode("124");
		brush.setDescription("no description");
		brush.setName("Brush");
		brush.setPrice(20);
		
		Cash payment = new Cash();
		payment.setType("CASH");
		payment.setAddress("Str. Chibzuintei nr. 2");
		
		Cart cart = new Cart();
		cart.setCommandDate(new Date());
		cart.setCustomer(customer);
		
		cart.addItemToCart(headphones, 1);
		cart.addItemToCart(brush, 2);
		
		double sum = cart.doTotal();
		
		cart.removeItemFromCart(brush);
		cart.modifyQuantity(headphones, 2);
		sum = cart.doTotal();

		payment.setSum(sum);
		cart.setPayment(payment);
		
	}

}
