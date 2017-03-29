package week5.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class MainProduct {

	public static void main(String[] args) {

		final int listSize = 10;

		String[] products = { "Колбаса Докторская", "Сыр Пырятынский",
				"Масло сливочное", "Масло подсолнечное", "Хлеб Белорусский",
				"Мука I сорт", "Яйцо куринное", "Сметана 20%", "Кефир 2.5%",
				"Живчик эхинацея" };
		ArrayList<Product> list = new ArrayList<Product>();
		for (int i = 0; i < listSize; i++) {
			int productInx = (int) (Math.random() * products.length);
			int price = (int) (Math.random() * 900) + 100;
			int month = (int) (Math.random() * 11) + 1;
			int dayOfMonth = (int) (Math.random() * 29) + 1;

			GregorianCalendar date = new GregorianCalendar(2015, month,
					dayOfMonth);
			list.add(new Product(products[productInx], price, date));
		}
		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, new DateOfPurchaseSortProduct());
		System.out.println("\n\nData sort");
		System.out.println(list);

		Collections.sort(list, new PriceSortProduct());
		System.out.println("\n\nPriceSort");
		System.out.println(list);

	}
}
