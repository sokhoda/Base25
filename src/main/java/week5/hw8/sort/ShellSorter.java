package week5.hw8.sort;

import java.util.Arrays;

public class ShellSorter {
	static final int	arrNum	= 10000;

	public static void sortShell(int[] vector) {
		if (vector.length > 1) {
			int dist = vector.length / 2;
			while (dist >= 1) {
				int i = 0;
				while (i + dist <= vector.length - 1) {
					if (vector[i] > vector[i + dist]) {
						int veci = vector[i];
						vector[i] = vector[i + dist];
						vector[i + dist] = veci;
						System.out.println((i + dist) + " " + i);
					}
					i++;
				}

				dist /= 2;
			}
		}
	}

	public static int[] getArr() {
		int[] arr = new int[arrNum];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arrNum);
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = getArr();
		// ShellSorter shS = new ShellSorter();
		sortShell(arr);
		System.out.println("\nshellSort:");
		System.out.println(Arrays.toString(arr));
	}
}
