package week1.lesson1;

import java.io.FileReader;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("file1.txt");
		Scanner scan = new Scanner(fr);
		int i = 0;
		while (scan.hasNextLine()) {
			System.out.println("строка с номером :" + (++i) + ": "
					+ scan.nextLine());
		}
		scan.close();
	}
}