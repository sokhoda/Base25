package week5.lesson10;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Product implements Comparable<Product> {
	private String				name;
	private Integer				price;
	private GregorianCalendar	datePurchase;

	@Override
	public int compareTo(Product product) {
		return this.name.compareTo(product.name);
	}

	public Product(String name, Integer price, GregorianCalendar datePurchase) {
		this.name = name;
		this.price = price;
		this.datePurchase = datePurchase;
	}

	@Override
	public String toString() {
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");

		return "\n" + getName() + "\t\t\t\t" + getPrice() + "\t\t\t\t"
		+ format1.format(getDatePurchase().getTime());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public GregorianCalendar getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(GregorianCalendar datePurchase) {
		this.datePurchase = datePurchase;
	}

}
