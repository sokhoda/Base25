package week1.lesson2;

import java.util.ArrayList;

public class Task3 {
	public static void ShowVector(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "]=" + list.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Task2.FillVector(list, 5);
		list = Task4.insertElement(list, 3, 9912);
		list = Task4.insertElement(list, 0, 9912);
		int element = 9912;
		System.out.println("Количество элементов '" + element + "': "
				+ Task5.getCountElementByArrayList(list, element));

		ShowVector(list);

	}
}
