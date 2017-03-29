package week3.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPhone {
	public static void main(String[] args) {
		ArrayList<Phone> phones = new ArrayList<Phone>();

		phones.add(new Nokia("097 445 22 33"));
		phones.add(new Nokia("093 111 02 17"));

		phones.add(new Samsung("063 897 55 41"));
		phones.add(new Samsung("095 342 17 44"));

		phones.add(new IPhone4("063 222 44 11", 4));
		phones.add(new IPhone4("095 111 33 66", 3));

		phones.add(new IPhone5("099 111 23 32", 6));
		phones.add(new IPhone5("092 342 00 77", 7));

		for (int i = 0; i < phones.size(); i++) {
			System.out.println(i + ". " + "телефон " + phones.get(i).getModel()
					+ ", номер = " + phones.get(i).getNumber());
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Выберите индекс первого телефона:");

		int inx = scan.nextInt();

		while (inx > phones.size() - 1 || inx < -1) {
			System.out
			.println("Некорректный индекс телефона. Повторите выбор.");
			inx = scan.nextInt();
		}

		System.out.println("Выберите индекс второго телефона:");

		int inx2 = scan.nextInt();

		while (inx2 > phones.size() - 1 || inx2 < -1) {
			System.out
			.println("Некорректный индекс телефона. Повторите выбор.");
			inx2 = scan.nextInt();
		}
		phones.get(inx).call(phones.get(inx2));

		for (int i = 0; i < phones.size(); i++) {
			System.out.println(i + ". " + "телефон " + phones.get(i).getModel()
					+ ", номер = " + phones.get(i).getNumber());
			if (phones.get(i) instanceof IPhone) {
				((IPhone) (phones.get(i))).printAppleId();
			}
		}

	}
}
