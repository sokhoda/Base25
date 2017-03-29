package week5.hw8.sort;

import java.util.Arrays;

public class MainQuickSorter {
	static final int	stNo	= 10;
	static final int	arrSize	= 10;

	private static int[] arr1() {
		int[] ar = new int[arrSize];
		for (int j = 0; j < arrSize; j++) {
			ar[j] = (int) (Math.random() * 5) + 1;
		}
		return ar;
	}

	public static void main(String[] args) {
		QuickSorter qs = new QuickSorter();
		Student[] students = new Student[stNo];
		int[] arr = { 1, 4, 2, 3, 4, 8, 1, 44, 2 };

		// qs.s2(arr, 0, arr.length - 1);
		for (int i = 0; i < stNo; i++) {
			int k = (int) (Math.random() * 100);
			int p = (int) (Math.random() * 100);
			int w = (int) (Math.random() * 100);

			students[i] = new Student("Name" + k, "surname" + p, "middleName"
					+ w, arr1());

			System.out.println(students[i].getName() + " "
					+ students[i].getSurname()
					+ Arrays.toString(students[i].getMarks()) + " av="
					+ qs.average(students[i].getMarks()));
		}
		System.out.println("\n\n\n");
		qs.s2sort(students, 0, stNo - 1);

		for (Student s1 : students) {

			System.out.println(s1.getName() + " " + s1.getSurname()
					+ Arrays.toString(s1.getMarks()) + " av="
					+ qs.average(s1.getMarks()));
		}

		// System.out.println(Arrays.toString(arr));
	}
}
