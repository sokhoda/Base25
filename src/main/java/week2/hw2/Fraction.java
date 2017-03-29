package week2.hw2;

import java.util.Scanner;

public class Fraction {
	private double	value;

	public Fraction(double value) {
		this.value = value;
	}

	public Fraction() {
		this(0);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double get() {
		Scanner scan = new Scanner(System.in);
		System.out.println("введите дробное число:");
		double valDouble = scan.nextDouble();
		return valDouble;
	}

	public Fraction add(Fraction num) {
		return (new Fraction(this.value + num.value));
	}

	public Fraction sub(Fraction num) {
		return (new Fraction(this.value - num.value));
	}

	public Fraction mul(Fraction num) {
		return (new Fraction(this.value * num.value));
	}

	public Fraction div(Fraction num) {
		return (new Fraction(this.value / num.value));
	}

	@Override
	public String toString() {
		return Double.toString(value);
	}

	public void print() {
		System.out.println("значение = " + value);
	}
}
