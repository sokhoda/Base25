package week5.lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoStringCheck {
	private static ArrayList<String>[]	alias;
	private static AutoMarka[]			list	= AutoMarka.values();

	public AutoStringCheck() {
		alias = new ArrayList[list.length];
		for (int i = 0; i < alias.length; i++) {
			alias[i] = new ArrayList<String>();
			alias[i].add(list[i].toString());
		}
	}

	public String checkAlias(String s) {
		int markaInx = list[0].getAlias(s);
		if (markaInx > -1) {
			System.out.println("алиас найден для объекта с индексом ["
					+ markaInx + "] = " + list[markaInx]);
			return list[markaInx].toString();
		}
		else {
			Scanner scan = new Scanner(System.in);
			System.out.println("алиас не найден. Добавить ? (y/n):");

			char ans = (char) Character
					.toLowerCase((int) scan.next().charAt(0));
			if (ans == 'y') {
				list[0].printAll();
				System.out.println("Выберите индекс из списка:");
				int inx = scan.nextInt();

				while (inx > list.length - 1 || inx < -1) {
					System.out
							.println("Некорректный индекс. Повторите выбор (или \'-1\' для отмены.)");
					inx = scan.nextInt();
				}
				if (inx != -1) {
					addAlias(s, inx);
				}
				else {
					System.out.println("добавление алиаса отменено.");
				}
			}
			return "";
		}
	}

	private void addAlias(String s, int inx) {
		alias[inx].add(s);
	}

	public void printAllAliases() {
		for (int i = 0; i < alias.length; i++) {
			String s1 = "";
			System.out.print("\n" + list[i] + ": ");
			for (int j = 0; j < alias[i].size(); j++) {
				s1 += alias[i].get(j).toString()
						+ (j == alias[i].size() - 1 ? "" : ", ");
			}
			System.out.print(s1);
		}
	}

	public enum AutoMarka {
		BMW, MERCEDES, AUDI, VOLVO, VOLKSWAGEN, RENO, CITROEN, MAZDA, OPEL, TAVRIA, DACIA, KIA;

		public void printAll() {
			for (int i = 0; i < list.length; i++) {
				System.out.println(i + ". " + list[i]);
			}
		}

		public int getAlias(String s) {
			for (int i = 0; i < alias.length; i++) {
				for (int j = 0; j < alias[i].size(); j++) {
					if (alias[i].get(j).equalsIgnoreCase(s)) return i;
				}
			}
			return -1;
		}
	}
}
