package week7.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		Reader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.println("введите число:");
		String s = br.readLine();

		try {
			// Scanner sc = new Scanner();
			Integer.parseInt(s);
			System.out.println("целое число");
		}
		catch (NumberFormatException e) {
			try {
				Double.parseDouble(s);
				System.out.println("дробное число");
			}
			catch (NumberFormatException e1) {
				System.out.println("не число");
			}
		}
		// System.out.println((char) br.read());
	}
}
