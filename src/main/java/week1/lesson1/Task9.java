package week1.lesson1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task9 {
	// static final String Fout = "file2.txt";

	public static String[] CesarCypher(String fname, int shift)
			throws Exception {
		if (fname.length() == 0) {
			return new String[0];
		}

		FileReader fr1 = new FileReader(fname);
		Scanner scan1 = new Scanner(fr1);

		int RNum = 0;
		int i1 = 0;
		char c1;
		while (scan1.hasNextLine()) {
			scan1.nextLine();
			RNum++;
		}
		scan1.close();
		fr1.close();

		FileReader fr = new FileReader(fname);
		Scanner scan = new Scanner(fr);

		String[] s1 = new String[RNum];
		while (scan.hasNextLine()) {
			s1[i1++] = scan.nextLine();
		}

		String[] s2 = new String[RNum];

		for (int i = 0; i < s1.length; i++) {
			s2[i] = "";

			for (int j = 0; j < s1[i].length(); j++) {
				c1 = s1[i].charAt(j);

				if (c1 != ' ' && c1 != '\n' && c1 != '\t') {
					s2[i] = s2[i] + (char) ((c1 + shift));
				} else {
					s2[i] = s2[i] + c1;
				}
			}
			s2[i] = s2[i] + '\n';
		}

		scan.close();
		fr.close();

		FileWriter fw = new FileWriter(fname);
		for (String element : s2) {
			fw.write(element);
		}
		fw.flush();
		fw.close();
		return s2;
	}

	public static String GetfName() {
		String fname;
		do {
			System.out.println("Введите имя файла:");
			fname = Task4.inputString().trim();

			if (fname.length() == 0) {
				System.out.println("Некорректное имя файла :(( ");
			}

		} while (fname.length() == 0);
		return fname;
	}

	public static int GetMode() {
		char mode;

		do {
			System.out
					.println("Введите номер операции: 0 - дешифровать, 1 - шифровать.");

			mode = Task4.inputSymvol();

			if (mode != '0' && mode != '1') {
				System.out.println("Некорректный режим работы :(( ");
			}
		} while (mode != '0' && mode != '1');

		switch (mode) {

		case '1':
			return 1;
		case '0':
			return 0;
		default:
			return 0;
		}
	}

	public static void main(String[] args) throws Exception {
		String[] s1 = new String[0];
		String fname = GetfName();
		int mode = GetMode();

		// mode = 1 cypher, 0 - decypher;
		if (mode == 1) {
			s1 = CesarCypher(fname, 3);
			System.out.println("Cyphered:");
		} else if (mode == 0) {
			s1 = CesarCypher(fname, -3);
			System.out.println("Decyphered:");
		}

		for (String element : s1) {
			System.out.print(element);
		}
		System.out.println();
		System.out.println(s1.length + 1 + " строк обработано.");
	}
}
