package week4.lesson7;

import java.util.ArrayList;

public class Test {

	public static String generateRepeatString(char c, Double n) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < Math.abs(n.intValue()); i++) {
			b.append(c);
		}
		return b.toString();
	}

	public static void main(String[] args) {

		Double i1 = 0.;
		Double i2 = -0.;
		Double i3 = -4.99;
		Double i4 = 4.66;
		ArrayList<Double> fileDepth = new ArrayList<Double>();
		ArrayList<Double> fileDepth2 = new ArrayList<Double>();
		fileDepth.add(new Double(2));

		fileDepth.add(new Double(20));
		fileDepth.add(new Double(3));
		fileDepth.add(0, new Double(5));
		fileDepth.add(3, new Double(5));

		for (int i = 0; i < fileDepth.size(); i++) {
			fileDepth2.add(fileDepth.get(i));
		}
		fileDepth.add(4, new Double(0));

		for (int i = 0; i < fileDepth.size(); i++) {
			System.out.println(fileDepth.get(i));
		}
		System.out.println("\n\n2");
		for (int i = 0; i < fileDepth2.size(); i++) {
			System.out.println(fileDepth2.get(i));
		}

		System.out.println(generateRepeatString('-', new Double(-5.3))
				+ "i3.intValue() = " + Math.abs(i3.intValue()));
		double f1 = 3.0000000001;
		System.out.println(i2.compareTo(i1));

		// for (int i = 0; i < 10000; i++) {
		// System.out.println("i = " + i);
		// }
		System.out.println("11/3=" + (11. / 3));
		// Scanner scan = new Scanner(System.in);
		// System.out.println("¬ведите путь: ");
		// String path = scan.next();
		//
		// File f = new File(path);
		// File[] files = f.listFiles();
		// System.out.println(files.length);
		System.out.println(String.format("%3.0f", 453.5322));
		System.out.printf("%.2e, %.2e", (double) 434, (double) 344);

		int if3 = 4, i8 = 9;
		assert (if3 > i8) : "if3=" + if3 + ", i8 = " + i8;

		// for (File file : files) {
		// System.out.println(file.getAbsolutePath() + " isDir = "
		// + file.isDirectory());
		// }
		// System.out.println(i1 == i2);
	}
}
