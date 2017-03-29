package week5.hw8.sort;

import java.util.Scanner;

public class Test5 {

	public static void sortPart2(int[] b, int inx) {
		if (b.length <= 1) return;
		if (inx > b.length - 1) {
			System.out
			.println("индекс выходит за пределы массива. inx =" + inx);
			return;
		}
		int midElem = b[inx];
		System.out.println("inx = " + inx + " el= " + midElem);

		int v = b[0];
		b[0] = b[inx];
		b[inx] = v;
		int curInx = 0;
		int p;
		int i = 1;
		while (i < b.length) {
			if ((b[i] > b[curInx] && i < curInx)
					|| (b[i] < b[curInx] && i > curInx)) {

				int t = b[i];
				b[i] = b[curInx];
				b[curInx] = t;

				if (curInx < i) p = curInx + 1;
				else p = i + 1;
				curInx = i;
				i = p;
				// System.out.println(i);
			}
			else i++;
		}
		System.out.println("inx = " + inx + " el= " + midElem);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 4, 67, 89, 3, 10 };
		// System.out.println(Arrays.toString(arr));
		int[] b = new int[10000];

		// Scanner scan = new Scanner("Anna Mill.s/Fe.mal.e/18");
		Scanner scan = new Scanner("4 g 5");
		Scanner scan2 = new Scanner(System.in);

		// System.out.println(scan.nextLine());
		// System.out.println(scan.next());
		// System.out.println(scan.nextLine());
		// scan.useDelimiter("/");
		// scan.useDelimiter(" ");
		// while (scan.hasNext()) {
		// // System.out.println(scan2.next());
		// System.out.println(scan.next());
		// }

		// String ss1 = scan.next();
		// System.out.println(ss1);
		// String ss2 = scan.next();
		// System.out.println(ss2);
		// String ss3 = scan.next();
		// System.out.println(ss1 + ", " + ss2 + ", " + ss3);

		System.out.println(scan.hasNextInt());
		System.out.println(scan.hasNextInt());
		System.out.println(scan.hasNextInt());
		System.out.println(scan.hasNextInt());
		System.out.println(scan.hasNextInt());
		System.out.println(scan.hasNextInt());
		// while (scan.hasNextInt()) {
		// System.out.println(scan.nextInt());
		// }

		// String ss1 = scan2.next();
		// String ss2 = scan2.next();
		// String ss3 = scan2.next();
		// System.out.println(ss1 + ", " + ss2 + ", " + ss3);
		// int i1 = scan2.nextInt();
		// int i2 = scan2.nextInt();
		// int i3 = scan2.nextInt();
		//
		// System.out.println(i1 + ", " + i2 + ", " + i3);
		// System.out.println();
		// System.out.println(scan2.hasNext());
		// scan2.next();
		// System.out.println(scan2.hasNext());
		// scan2.next();
		// scan2.nextLine();
		// scan.useDelimiter("/");
		// System.out.println(scan.hasNext());
		// scan.next();
		// System.out.println(scan.hasNext());
		// System.out.println(scan.next());
		// System.out.println(scan.next());
		// System.out.println(scan.next());
		// System.out.println(scan.hasNext());
		// scan.useDelimiter(".");
		// System.out.println(scan.hasNext());
		// System.out.println(scan.next());
		// System.out.println(scan.hasNext());

		// for (int i = 0; i < b.length; i++) {
		// b[i] = (int) (Math.random() * 500);
		// }
		// System.out.println(Arrays.toString(b));
		// sortPart2(b, 5);
		// System.out.println(Arrays.toString(b));
	}
}
