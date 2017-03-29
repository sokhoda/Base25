package week4.lesson7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int tableNo = 10;
		AbstractHuman[] human = new AbstractHuman[4];

		ArrayList<AbstractTable> table = new ArrayList<AbstractTable>();
		for (int i = 0; i < tableNo; i++) {
			table.add(new Table());
		}

		for (AbstractHuman abstractHuman : human) {
			if (Math.random() > 0.5) {
				abstractHuman = (new HumanWoman());
			}
			else abstractHuman = (new HumanMan());

			if (Math.random() > 0.5) {
				abstractHuman.takeGlass(new GlassCircle());
			}
			else abstractHuman.takeGlass(new GlassSquare());
			abstractHuman.printAboutMe();
		}
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < human.length; i++) {
			System.out.println("человек №" + i);

			if (human[i].getGlass() == null) {
				System.out.println("У меня нет стакана.");
			}
			else {
				System.out.println("Выберите индекса стола: [0 ..9]");

				int tabInx = scan.nextInt();

				while (tabInx < 0 || tabInx > (tableNo - 1)) {
					System.out
							.println("Некорректный индекс стола. Повторите выбор.");
					tabInx = scan.nextInt();
				}
				human[i].pourWaterOnTable(table.get(tabInx));
			}

		}

		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).isDry()) System.out.println("Стол № " + i
					+ " сухой.");
			else System.out.println("Стол № " + i + " мокрый.");

		}
	}
}
