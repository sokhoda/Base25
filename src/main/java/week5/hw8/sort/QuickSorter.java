package week5.hw8.sort;

import java.util.Arrays;

public class QuickSorter {
	void sort(Student[] students) {

		s2sort(students, 0, students.length - 1);
	}

	void s2sort(Student[] stud, int left, int right) {
		int middleInx = (left + right) / 2;
		double ave = average(stud[middleInx].getMarks());
		int i = left;
		int j = right;
		do {
			while (average(stud[i].getMarks()) < ave)
				i++;
			while (average(stud[j].getMarks()) > ave)
				j--;
			if (i <= j) {
				Student studi = stud[i];
				stud[i++] = stud[j];
				stud[j--] = studi;
			}
		} while (i <= j);
		if (left < j) s2sort(stud, left, j);
		if (right > i) s2sort(stud, i, right);
	}

	public double average(int[] data) {
		int sum = 0;

		for (int element : data)
			sum = sum + element;
		double average = sum * 1. / data.length;

		return average;
	}

	void s2(int[] a, int left, int right) {
		int x = a[left];
		int i = left;
		int j = right;
		do {
			while (a[i] < x)
				i++;
			while (a[j] > x)
				j--;
			if (i <= j) {
				int ai = a[i];
				a[i++] = a[j];
				a[j--] = ai;
			}
		} while (i <= j);
		if (left < j) s2(a, left, j);
		if (right > i) s2(a, i, right);
	}

	int s1(int[] a, int left, int right) {
		if (left != right) {
			int center = (right - left) / 2;
			// System.out.println("center = " + center);
			for (int i = left; i <= right; i++) {
				if (a[i] >= a[center] && i < center) {
					int ai = a[i];
					for (int j = 0; j < center - i; j++) {
						a[i + j] = a[i + j + 1];
					}
					a[center--] = ai;
					i--;
				}
				if (a[i] < a[center] && i >= center) {
					int ai = a[i];
					for (int j = i; j > center; j--) {
						a[j] = a[j - 1];
					}
					a[center++] = ai;
				}
				// System.out.println(Arrays.toString(a));
			}
			return center;
		}
		else {
			return left;
		}
	}

	void s1(int[] a) {
		int center = a.length / 2;
		System.out.println("center = " + center);
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= a[center] && i < center) {
				int ai = a[i];
				for (int j = 0; j < center - i; j++) {
					a[i + j] = a[i + j + 1];
				}
				a[center--] = ai;
				i--;
			}
			if (a[i] < a[center] && i >= center) {
				int ai = a[i];
				for (int j = i; j > center; j--) {
					a[j] = a[j - 1];
				}
				a[center++] = ai;
			}
			System.out.println(Arrays.toString(a));
		}
		return;
	}

	int recSort(Student[] students, int left, int right) {
		if (left != right) {
			int center = (right - left) / 2;
			double avgC = average(students[center].getMarks());
			for (int i = left; i <= right; i++) {
				double avg = average(students[i].getMarks());

				if (avg >= avgC && i < center) {
					Student studi = students[i];
					for (int j = 0; j < center - i; j++) {
						students[i + j] = students[i + j + 1];
					}
					students[center--] = studi;
					i--;
				}
				if (avg < avgC && i >= center) {
					Student studi = students[i];
					for (int j = i; j > center; j--) {
						students[j] = students[j - 1];
					}
					students[center++] = studi;
				}

			}
			return center;
		}
		else {
			return -1;
		}

	}

}
