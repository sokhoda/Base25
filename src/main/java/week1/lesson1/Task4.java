package week1.lesson1;

import java.util.Scanner;

public class Task4 {
	public static String inputString() {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		return s1;
	}

	public static int inputInt() {
		Scanner scan = new Scanner(System.in);
		int i1 = scan.nextInt();
		return i1;
	}

	public static char inputSymvol() {
		Scanner scan = new Scanner(System.in);
		char p = scan.next().charAt(0);
		return p;
	}

	public static int getCountSymvolByString(String s1, char c1) {
		int i1 = -1;
		char[] arr1 = s1.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == c1) i1 = i;
		}
		return i1 + 1;
	}

	public static void main(String[] args) {
		String str = inputString();
		char d = inputSymvol();
		int res = getCountSymvolByString(str, d);

		System.out.println("кол-во символов [" + d + "] в строке [" + str
				+ "] = " + res);
	}

}
