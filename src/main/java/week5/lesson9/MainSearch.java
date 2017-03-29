package week5.lesson9;

import java.util.Arrays;

public class MainSearch {
	public static void main(String[] args) {
		BinarySearcher bs = new BinarySearcher();
		// int[] vector = ArraySort.getArr();
		// int[] vector = { 34, 5, 65, 13, 76, 5, 45, 11, 75, 8, 96, 4, 53, 443,
		// 44, 64, 7, 86, 3 };
		int[] vector = { 34 };

		int[] arr = ArraySort.vyborkaSort(vector);
		System.out.println(Arrays.toString(arr));
		System.out.println("index = " + bs.binarySearch(arr, 34));
	}
}
