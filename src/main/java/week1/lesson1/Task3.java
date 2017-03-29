package week1.lesson1;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		String s1;
		int Count = 0;
		Scanner scan = new Scanner(System.in);
		s1 = scan.nextLine();
		String[] Arr = s1.split(" ");

		for (String element : Arr) {
			if (element.length() != 0) {
				Count++;
			}
		}
		System.out.println(Count);

	}
}
