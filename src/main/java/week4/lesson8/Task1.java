package week4.lesson8;

import java.util.Scanner;

public class Task1 {

	public static void kTo2(int k) {
		System.out.println(k);
		if (k > 2) kTo2(k - 1);
	}

	public static void rTok(int k) {
		if (k > 2) rTok(k - 1);
		System.out.println(k);
	}

	public static int simpleNum(int k, int k1) {
		int p = 0;
		if (k1 == 1 || k1 == 0) {
			System.out.println("простое " + k1);
		}
		if (k >= 2) {

			if (k1 % k == 0) p = k * simpleNum(k - 1, k1);
			else p = simpleNum(k - 1, k1);

			if (k == k1) {
				if (p > k1) System.out.println("сложное " + p);
				else System.out.println("простое " + p);
			}
			return p;
		}

		else return 1;
	}

	public static int fact(int k) {
		if (k == 0) return 1;
		if (k > 1) return k * fact(k - 1);
		else return 1;
	}

	public static int fibonachi(int k) {
		if (k == 1 || k == 2) return 1;

		if (k > 2) return fibonachi(k - 1) + fibonachi(k - 2);
		else return 1;
	}

	public static void main(String[] args) {
		int k = 16;
		// kTo2(k);
		// System.out.println();
		// rTok(k);
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Выберите ЦЕЛОЕ число");
		k = scan.nextInt();

		while (k != -1) {
			// simpleNum(k, k);

			System.out.println(fibonachi(k));

			System.out.println("Выберите ЦЕЛОЕ число");
			k = scan.nextInt();
		}

	}
}
