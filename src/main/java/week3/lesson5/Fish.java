package week3.lesson5;

import java.util.Date;

public class Fish extends Product {

	@Override
	public void printPrice() {
		System.out.println("���� = " + getPrice());
	}

	@Override
	public void printStoragePeriod() {
		System.out.println("���� �������� = " + getStoragePeriod());
	}

	@Override
	public void printBarAndPrice() {
		System.out.println("�������� = " + getBar() + ", ���� = " + getPrice());
	}

	public void cannibalism(Fish fish) {

	}

	public void swim() {

	}

	public Fish(double price, Date storagePeriod, String bar) {
		super(price, storagePeriod, bar);
	}
}
