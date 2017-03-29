package week5.hw8.sort.searchreccur;

public class BinarySearcherReccur {
	public static int binarySearch(int[] vector, int element) {

		return binSearch(vector, 0, vector.length - 1, element);

	}

	public static int binSearch(int[] vector, int left, int right, int element) {
		int res = -1;
		int center = (left + right) / 2;
		if (element == vector[center]) return center;

		if (left >= right) return -1;

		if (element < vector[center]) {
			res = binSearch(vector, left, center - 1, element);
		}
		else {
			res = binSearch(vector, center + 1, right, element);
		}
		return res;
	}
}
