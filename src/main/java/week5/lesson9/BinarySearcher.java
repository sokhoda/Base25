package week5.lesson9;

public class BinarySearcher {
	public int binarySearch(int[] vector, int element) {
		if (vector == null) return -1;
		int lBound = 0;
		int rBound = vector.length - 1;
		boolean cond = (vector[lBound] == element)
				|| (vector[rBound] == element);

		while ((!cond) && (rBound - lBound) > 1) {
			int center = (rBound + lBound) / 2;

			if (element < vector[center]) rBound = center;
			else lBound = center;
			cond = (vector[lBound] == element) || (vector[rBound] == element);
		}
		if (cond) {
			if (vector[lBound] == element) return lBound;
			else return rBound;
		}
		else return -1;
	}

}
