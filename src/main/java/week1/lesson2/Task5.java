package week1.lesson2;

import java.util.ArrayList;

public class Task5 {
	public static int getCountElementByArrayList(ArrayList<Integer> vector,
			Integer element) {
		int res = 0;
		for (int i = 0; i < vector.size(); i++) {
			if (vector.get(i).equals(element)) {
				res++;
			}
		}
		return res;
	}
}
