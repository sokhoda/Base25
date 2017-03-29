package week2.hw2;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleCalc {
	private static String[]	operationNames	= { "1. Сложить", "2. Вычесть",
			"3. Умножить", "4. Разделить", "5. Выход из программы" };

	public static void printMenu() {
		for (String m : operationNames)
			System.out.println(m);
	}

	public static void main(String[] args) {
		Locale EngLocale = new Locale("en", "UK");
		Locale.setDefault(EngLocale);
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			System.out.println("Выберите операцию:");
			printMenu();
			int k = scan.nextInt();
			switch (k) {
			case 1:
				add();
				break;
			case 2:
				subtract();
				break;
			case 3:
				multiply();
				break;
			case 4:
				divide();
				break;
			case 5:
				runWhile = false;
				System.out
				.println("Калькулятор завершает работу. Спасибо за пользование калькулятором.");
				break;
			default:
				System.out.println("Некорректный номер операции");
			}
		}
	}

	public static double add() {
		double[] number = getTwoNumbers();
		return printValue(number[0] + number[1]);
	}

	public static double subtract() {
		double[] number = getTwoNumbers();
		return printValue(number[0] - number[1]);
	}

	public static double multiply() {
		double[] number = getTwoNumbers();
		return printValue(number[0] * number[1]);
	}

	public static double divide() {
		double[] number = getTwoNumbers();
		return printValue(number[0] / number[1]);
	}

	public static double printValue(double val) {
		// double decimalPart = val - Math.floor(val);
		// DecimalFormat df;
		// if (decimalPart > 0) df = new DecimalFormat("0.000000000000");
		// else df = new DecimalFormat("#");
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(0);
		df.setMaximumFractionDigits(16);
		df.setGroupingUsed(false);
		System.out.println("Результат: " + df.format(val));
		return Double.parseDouble(df.format(val));
	}

	public static double[] getTwoNumbers() {

		// DecimalFormat df = new DecimalFormat("#####0.00");
		// DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
		//
		// dfs.setDecimalSeparator('.');
		// df.setDecimalFormatSymbols(dfs);
		// System.out.println(df.format(d));

		double[] result = new double[2];
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите первое число:");
		result[0] = scan.nextDouble();
		System.out.println("Введите второе число:");
		result[1] = scan.nextDouble();
		return result;

	}
}
