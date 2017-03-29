package week2.hw2;

import java.util.Scanner;

public class ConsoleMenu {
	private static String[]	operationNames	= { "1. Прийти", "2. Уйти",
		"3. Зайти", "4. Выйти"			};

	public static void printMenu() {
		for (String m : operationNames)
			System.out.println(m);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			printMenu();
			System.out.println("Выберите операцию:");
			int k = scan.nextInt();
			switch (k) {
			case 1:
				f1();
				break;
			case 2:
				f2();
				break;
			case 3:
				f3();
				break;
			case 4:
				runWhile = false;
			}
		}
	}

	public static void f1() {
		System.out.println("Method1");
	}

	public static void f2() {
		System.out.println("Method2");
	}

	public static void f3() {
		System.out.println("Method3");
	}

}
