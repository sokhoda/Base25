package week5.lesson9;

import java.util.Arrays;

public class TestWeek5 {

	public static String stringOfSize(int size, char ch) {
		final char[] array = new char[size];
		Arrays.fill(array, ch);
		return new String(array);
	}

	public static void main(String[] args) {
		int sym = 2;
		String[] s1 = { "Ferferf", "feeebrg4", "3434r" };
		int[] arr = { 23, 45, 67, 4, 3, 2, 6, 45, 7, 9, 5, 11, 4, 5, 67, 9, 4,
				24, 67, 99, 5, 3, 3, 2, 4, 5, 6, 77, 33, 22, 11, 2 };
		String[] s = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			s[i] = Integer.toString(arr[i]);
		}
		int vidst = 54;
		int dist = 100;
		int n = 0;
		int curElNum = 1;
		for (int i = 0; i < 5; i++) {

			String Svidst = stringOfSize(vidst, ' ');
			String Sdist = stringOfSize(dist, ' ');
			System.out.printf(Svidst);

			for (int j = 0; j < curElNum; j++) {
				System.out.printf("%-" + sym + "s" + Sdist, s[n]);
				n++;
			}
			System.out.println("\n");
			// System.out.println("\n dist = " + dist + ", vidst = " + vidst);
			dist = (int) (dist * 0.5) - 1;
			if (dist < 2) dist = 2;

			vidst = vidst - (int) (0.5 * dist) - 1;
			curElNum *= 2;

			for (int j = 0; j < 2; j++) {
				System.out.println("j= " + j);
				for (int j2 = 0; j2 < 10; j2++) {
					System.out.println("j2= " + j2);
					if (j2 == 4) break;
				}

			}
		}

	}
}
