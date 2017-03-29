package week1.lesson2;

import java.util.ArrayList;

public class Task2 {
	public static void FillVector(ArrayList<Integer> list, int num) {

		for (int i = 0; i < num; i++) {
			double f = Math.random(); // 0..1
			int i1 = (int) (f * 100);

			list.add(i1); // boxing
		}
	}
}