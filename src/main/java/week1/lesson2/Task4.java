package week1.lesson2;

import java.util.ArrayList;

public class Task4 {
	public static ArrayList<Integer> insertElement(ArrayList<Integer> vector,
			int index, Integer element) {
		ArrayList<Integer> vector1 = new ArrayList<Integer>();

		for (int i = 0; i < vector.size(); i++) {
			if (i == index) {
				vector1.add(element);
			} else {
				vector1.add(vector.get(i));
			}
		}
		// vector.set(index, element);
		return vector1;
	}
}
