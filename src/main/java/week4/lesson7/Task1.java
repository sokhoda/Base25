package week4.lesson7;

import java.io.File;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите путь: ");
		String path = scan.next();

		System.out.println("¬ведите расширение: ");
		String exten = scan.next();

		File f = new File(path);
		File[] files = f.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.getName().endsWith(exten)) System.out.println(file
						.getName());
			}
		}
		else System.out.println("введен невалидный путь");

	}
}
