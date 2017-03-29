package week2.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
	private ArrayList<Track>	tracks;
	private Track				t1;

	private static void formattedPrint(String... Stri) {
		for (String element : Stri) {
			String format = "%-20s";
			System.out.printf(format, element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		double[] result = new double[2];
		for (int i = 0; i < result.length; i++)
			System.out.println("result [" + i + "]" + result[i]);
		System.out.println(String.format("%e", (double) Long.MAX_VALUE));

		ArrayList<Integer> int1 = new ArrayList<Integer>();
		System.out.println("int1.size() = " + int1.size());
		System.out.println((char) 65);
		;
		ArrayList<Track> tracks = new ArrayList<Track>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите номер авто:");
		String number = scan.nextLine();
		System.out.println("Введите цвет авто:");
		String color = scan.next();
		System.out.println("номер =" + number + " цвет =" + color);
		// String dir = "E:\\N23\\TestDir";
		// File fileObj = new File(dir);
		// fileObj.mkdirs();
		// System.out.println("Номер авто\t\tЦвет авто\t\tНомер закрепл. прицепа");
		formattedPrint("Номер авто", "Цвет авто", "Номер закрепл. прицепа");
		formattedPrint("erf", "verver referfe rf", "f er ferfer erf e");
		// Track t1 = new Track("AA 9887");
		// Track track1 = new Track("AA 5555");

		// tracks.add("AA 9887")
		// tracks.get(0).get(
	}

	public void f() {
		t1.getCar();
	}
}
