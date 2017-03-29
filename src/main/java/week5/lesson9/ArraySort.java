package week5.lesson9;

import java.util.Arrays;

public class ArraySort {
	static final int	arrNum	= 10000;

	public static int[] getArr() {
		int[] arr = new int[arrNum];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arrNum);
		}
		return arr;
	}

	public static int[] bubbleSort(int[] arr) {
		if (arr.length > 0) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - i - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int i1 = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = i1;
					}
				}
			}
			return arr;
		}
		else return null;

	}

	// public static <T> ArrayList<T> vyborkaSort(ArrayList<T> list) {
	// if (list.size() > 0) {
	// for (int j = 0; j < list.size() - 1; j++) {
	//
	// int min = list[j];
	// int minInx = j;
	// for (int i = j; i < list.length; i++) {
	// if (list[i] < min) {
	// min = list[i];
	// minInx = i;
	// }
	// }
	// int i1 = list[j];
	// list[j] = min;
	// list[minInx] = i1;
	// }
	// return list;
	// }
	// else return null;
	// }

	public static int[] vyborkaSort(int[] arr) {
		if (arr.length > 0) {
			for (int j = 0; j < arr.length - 1; j++) {

				int min = arr[j];
				int minInx = j;
				for (int i = j; i < arr.length; i++) {
					if (arr[i] < min) {
						min = arr[i];
						minInx = i;
					}
				}
				int i1 = arr[j];
				arr[j] = min;
				arr[minInx] = i1;
			}
			return arr;
		}
		else return null;
	}

	public static int[] podschetSort(int[] arr) {
		if (arr.length > 0) {
			int min = arr[0];
			int max = arr[0];

			for (int element : arr) {
				if (element < min) min = element;
				if (element > max) max = element;
			}
			int[] table = new int[max - min + 1];

			for (int i = 0; i < table.length; i++) {
				int counter = 0;
				for (int element : arr) {
					if (element == min + i) counter++;
				}
				table[i] = counter;
			}
			// System.out.println("min= " + min + ", max= " + max);
			// System.out.println(Arrays.toString(table));
			int curInx = 0;
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i]; j++) {
					arr[curInx++] = min + i;
				}
			}
			return arr;
		}
		else return null;
	}

	public static void sortInsertion(int[] vector) {
		if (vector.length > 1) {
			int k = 1;
			for (int i = 1; i < vector.length; i++) {
				for (int j = 0; j < k; j++) {
					if (vector[i] < vector[j]) {
						for (int inx = i; inx > j; inx--) {
							int vecinx = vector[inx];
							vector[inx] = vector[inx - 1];
							vector[inx - 1] = vecinx;
							System.out.println(inx + " " + (inx - 1));
						}
						break;
					}
				}
				k++;
			}
		}
	}

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
						// System.out.println((i + dist) + " " + i);
					}
					i++;
				}

				dist /= 2;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = getArr();
		int[] arr1 = arr.clone();
		// int[] arr1 = { 6, 2, 5, 4, 6, 5 };

		long time1 = System.nanoTime();
		int[] res = bubbleSort(arr.clone());

		long time2 = System.nanoTime();
		res = vyborkaSort(arr.clone());

		long time3 = System.nanoTime();
		res = podschetSort(arr);
		long time4 = System.nanoTime();

		sortInsertion(arr.clone());
		long time5 = System.nanoTime();

		sortShell(arr1);
		long time6 = System.nanoTime();
		// res = null;
		// Integer[] vector = new Integer[10];
		// vector[0] = 1;
		// List<Integer> list = Arrays.asList(vector);
		// Integer[] vector1 = Arrays.copyOf(vector, vector.length);

		if (res != null) {
			System.out.println(Arrays.toString(res));
			System.out
					.printf("bubbleSort = %.2e, vyborkaSort = %.2e, podschetSort = %.2e, sortInsertion = %.2e, sortShell = %.2e",
							(time2 - time1) * 1., 1. * (time3 - time2),
							1. * (time4 - time3), 1. * (time5 - time4),
							1. * (time6 - time5));
		}
		System.out.println("\n sortShell:");
		System.out.println(Arrays.toString(arr1));
	}
}
