package week2.hw2;

import java.util.Locale;

public class MainNumber {
	public static void main(String[] args) {
		Locale EngLocale = new Locale("en", "UK");
		Locale.setDefault(EngLocale);
		Number num1 = new Number();
		num1.setValue(num1.get());

		Number num2 = new Number();
		num2.setValue(num2.get());
		System.out.println((num1.mul(num2)).getValue());
		System.out.println((num1.fact()).getValue());
	}
}
