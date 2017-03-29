package week1.lesson1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task10 {
	public static String[][] parseFile(String fname) throws Exception {
		if (fname.length() == 0) {
			return new String[0][0];
		}

		FileReader fr = new FileReader(fname);
		Scanner scan = new Scanner(fr);

		int RNum = 0;
		int count = 0;
		while (scan.hasNextLine()) {
			scan.nextLine();
			RNum++;
		}
		scan.close();
		fr.close();

		FileReader frReadStrings = new FileReader(fname);
		Scanner scanReadStrings = new Scanner(frReadStrings);

		String[] s1 = new String[RNum];
		while (scanReadStrings.hasNextLine()) {
			s1[count++] = scanReadStrings.nextLine();
		}
		scanReadStrings.close();
		frReadStrings.close();

		String[] s2;
		String[] s3;
		String[] s4, s5;
		int VarCnt = 0;
		for (String element : s1) {
			s2 = element.split(";");
			for (String element2 : s2) {
				if (element2.trim().length() > 0) {
					VarCnt = VarCnt + 1;
				}
			}
		}

		String[][] arr = new String[2][VarCnt];
		int inx = 0;

		for (String element : s1) {
			s2 = element.split(";");
			for (String element2 : s2) {
				s3 = element2.split("=");
				if (s3[0].trim().length() > 0) {
					arr[0][inx] = s3[0].trim();

					s4 = s3[1].split("\\[");
					s5 = s4[1].split("\\]");
					if (s5.length == 0) {
						arr[1][inx++] = "";
					} else {
						arr[1][inx++] = s5[0].trim();
					}
				}
			}
		}

		return arr;
	}

	public static String[][] printVar2File(String fname, String[][] var)
			throws Exception {
		if (fname.length() == 0) {
			return new String[0][0];
		}

		FileWriter fw = new FileWriter(fname);
		for (int j = 0; j < var[0].length; j++) {
			fw.write(var[0][j] + "=[" + var[1][j] + "];");
		}
		fw.flush();
		fw.close();

		return var;
	}

	public static void printToConsole(String[][] arr) {
		if (arr.length > 0) {
			if (arr[0].length > 0) {
				System.out.println("Значения переменных следующие: ");
				for (int i = 0; i < arr[0].length; i++) {
					System.out.println(arr[0][i] + "=[" + arr[1][i] + "]");

				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// String fname = GetfName();
		String fNameToParse = "Var.txt";
		String fNameParsed = "Var2.txt";
		String[][] arr = parseFile(fNameToParse);
		printVar2File(fNameParsed, arr);
		Task10.printToConsole(arr);
	}
}
