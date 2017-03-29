package week2.hw2;

import java.util.Locale;

public class MainFraction {
	public static void main(String[] args) {
		Locale EngLocale = new Locale("en", "UK");
		Locale.setDefault(EngLocale);
		Fraction num1 = new Fraction();
		num1.setValue(num1.get());

		Fraction num2 = new Fraction();
		num2.setValue(num2.get());
		System.out.println("*" + (num1.mul(num2)).getValue());

		System.out.println("/" + (num1.div(num2)).getValue());
		System.out.println("+" + (num1.add(num2)).getValue());
		System.out.println("-" + (num1.sub(num2)).getValue());
		System.out.println(num1.sub(num2).toString());
	}
}
