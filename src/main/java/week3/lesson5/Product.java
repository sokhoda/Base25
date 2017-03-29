package week3.lesson5;

import java.util.Date;

public class Product {
	private double	price;
	private Date	storagePeriod;
	private String	bar;

	public Product(double price, Date storagePeriod, String bar) {
		this.setPrice(price);
		this.setStoragePeriod(storagePeriod);
		this.setBar(bar);
	}

	public void printPrice() {

	}

	public void printStoragePeriod() {

	}

	public void printBarAndPrice() {

	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getStoragePeriod() {
		return storagePeriod;
	}

	public void setStoragePeriod(Date storagePeriod) {
		this.storagePeriod = storagePeriod;
	}
}
