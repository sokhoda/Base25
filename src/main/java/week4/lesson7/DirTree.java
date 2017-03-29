package week4.lesson7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DirTree {
	static final Double	posZero	= 0.;

	public static boolean existUnfoldedDirectories(ArrayList<File> file,
			ArrayList<Double> dep) {

		boolean ret = false;
		if (file.size() == 0) return ret;
		if (file.size() != dep.size()) {
			System.out.println("размеры масивов файлов и глубины не равны");
			return ret;
		}
		else {
			for (int i = 0; i < file.size(); i++) {
				if (file.get(i).isDirectory()) {
					if (dep.get(i).compareTo(posZero) >= 0) {
						// €кщо не ≥снуЇ наступного ел-та, то ≥стина
						if (i == dep.size() - 1) {
							return true;
						}
						else {
							if (Math.abs(dep.get(i + 1).doubleValue())
									- Math.abs(dep.get(i).doubleValue()) <= 0) return true;
						}
					}
				}
			}
			return ret;
		}
	}

	public static String generateRepeatString(char c, Double n) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < Math.abs(n.intValue()); i++) {
			b.append(c);
		}
		return b.toString();
	}

	public static boolean isEmptyDirectory(File f) {
		if (f != null) {
			if (f.isDirectory()) {
				File[] files = f.listFiles();
				if (files != null) {
					if (files.length == 0) return true;
				}
			}
		}
		return false;
	}

	public static void noRecursTree(String path) {
		ArrayList<File> list = new ArrayList<File>();
		ArrayList<Double> fileDepth = new ArrayList<Double>();
		boolean cond;

		File f = new File(path);

		File[] files = f.listFiles();
		if (files != null) {
			if (files.length == 0) {
				System.out.println("папка пуста");
				System.exit(0);
			}
			for (File file : files) {
				if (isEmptyDirectory(file)) {
					fileDepth.add(new Double(-0.));
				}
				else fileDepth.add(new Double(0.));
				list.add(file);
			}
			cond = existUnfoldedDirectories(list, fileDepth);
			int count;
			int curDepth = 0;
			while (cond) {
				curDepth += 1;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).isDirectory()
							&& fileDepth.get(i).compareTo(posZero) >= 0) {
						if (i < list.size() - 1) {
							if (Math.abs(fileDepth.get(i + 1).doubleValue())
									- Math.abs(fileDepth.get(i).doubleValue()) > 0) {
								continue;
							}
						}

						count = 0;
						File[] f2 = list.get(i).listFiles();

						for (File file : f2) {
							list.add(i + 1, file);
							if (isEmptyDirectory(file)) {
								fileDepth.add(i + 1, new Double(-curDepth));
							}
							else {
								fileDepth.add(i + 1, new Double(curDepth));
							}
							count += 1;
						}
						i += count;
					}
				}
				cond = existUnfoldedDirectories(list, fileDepth);
			}

			for (int i = 0; i < list.size(); i++) {
				String s1 = generateRepeatString('-', fileDepth.get(i) * 2);

				System.out.println(s1 + list.get(i).getName());// + "\t\t\t\t "
				// + i);
			}

			System.out.println("ArrayList size = " + list.size());

			// System.out.println(Arrays.toString(fileArr));
		}
		else System.out.println("введен невалидный путь");

	}

	public static void recursTree(File curFile, int depth) {

		String s1 = generateRepeatString('-', depth * 2.);
		System.out.println(s1 + curFile.getName());

		File[] files = curFile.listFiles();
		if (files != null) {
			depth++;
			for (File file : files) {
				if (file.isDirectory()) {
					recursTree(file, depth);
				}
				else {
					s1 = generateRepeatString('-', depth * 2.);
					System.out.println(s1 + file.getName());
				}
			}
		}

	}

	public static void recursTreeMain(String path) {
		if (path.length() == 0) return;
		int depth = 0;

		File f = new File(path);
		if (f.listFiles() != null) {
			recursTree(f, depth);
		}
		else System.out.println("введен невалидный путь");
	}

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите путь: ");
		String path = scan.nextLine();

		long time1 = System.nanoTime();
		noRecursTree(path);
		long time2 = System.nanoTime();

		recursTreeMain(path);
		long time3 = System.nanoTime();
		// DecimalFormat formatter = new DecimalFormat("0.##E0");
		// System.out.println("без рекурсии = " + formatter.format(time2 -
		// time1)
		// + "\n с использованием рекурсии = "
		// + formatter.format(time3 - time2));

		System.out.printf(
				"без рекурсии = %.3e, с использованием рекурсии %.3e",
				(time2 - time1) * 1., 1. * (time3 - time2));

		System.out.printf("\nотношение = %.2f", (time2 - time1) / 1.
				/ (time3 - time2));
	}
}
