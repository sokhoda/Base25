package week2.hw2;

import java.util.Scanner;

public class Number {
	private double	value;

	public Number(double value) {
		this.value = value;
	}

	public Number() {
		this(0);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int get() {
		Scanner scan = new Scanner(System.in);
		System.out.println("введите целое число:");
		int valInt = scan.nextInt();
		return valInt;
	}

	public Number add(Number num) {
		return (new Number(this.value + num.value));
	}

	public Number sub(Number num) {
		return (new Number(this.value - num.value));
	}

	public Number mul(Number num) {
		return (new Number(this.value * num.value));
	}

	public Number div(Number num) {
		return (new Number(this.value / num.value));
	}

	public Number pow(Number num) {
		return (new Number(Math.pow(this.value, num.value)));
	}

	public Number fact() {
		double decimalPart = value - Math.floor(value);
		if (decimalPart > 0) {
			System.out.println("Ќе могу вычислить факториал дл€ нецелых чисел");
			return (new Number());
		}

		if (value < 0) {
			System.out
					.println("‘акториал не определен дл€ отрицательных чисел");
			return (new Number());
		}
		else {
			if (value == 0) return (new Number(1));
			else {
				long valLong = 1L;
				for (int i = 1; i <= value; i++) {
					valLong *= i;
					if (valLong <= 0) {
						System.out.print("ѕри вычислении факториала \'" + value
								+ "!\' превышен диапазон значений long ");
						System.out
								.println(String.format("%.2e",
										(double) Long.MIN_VALUE)
										+ " .. "
										+ String.format("%.2e",
												(double) Long.MAX_VALUE));
						return (new Number());
					}
				}
				return (new Number(valLong));
			}
		}
	}

	public Number mod(Number num) {
		return (new Number(this.value % num.value));
	}
}
