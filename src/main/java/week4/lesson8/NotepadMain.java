package week4.lesson8;

import java.util.GregorianCalendar;

public class NotepadMain {
	public static void main(String[] args) {
		Notepad n = new Notepad();
		GregorianCalendar date1 = new GregorianCalendar(2015, 01, 20);
		GregorianCalendar date2 = new GregorianCalendar(2015, 01, 21);
		n.add(date1, "������ ������");
		n.add(date1, "������ ������");
		n.add(date2, "������ ������");

		n.add(date2, "��������� ������");

		n.add(date2, "����� ������");
		n.add(date2, "������ ������");
		n.printByDate(date2);
	}
}
