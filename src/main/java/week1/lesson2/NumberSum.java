package week1.lesson2;

import java.util.Scanner;

public class NumberSum {
	public static int calcDigitsCount(String number) {
		int i1 = 0;
		for (int i = 0; i < number.length(); i++) {
			i1 += Integer.parseUnsignedInt(number.substring(i, i + 1));
		}

		return i1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		System.out.println(calcDigitsCount(s1));
	}
}
