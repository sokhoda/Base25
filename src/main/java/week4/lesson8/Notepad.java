package week4.lesson8;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Notepad {
	private ArrayList<Data>	datas	= new ArrayList<Data>();

	public Notepad() {
	}

	public void add(GregorianCalendar date, String note) {
		for (int i = 0; i < datas.size(); i++) {
			if (getDatas().get(i).getDate().equals(date)) {
				getDatas().get(i).getList().add(note);
				return;
			}
		}
		getDatas().add(new Data(date, note));
		return;
	}

	public void printByDate(GregorianCalendar date) {
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");

		for (int i = 0; i < datas.size(); i++) {
			if (getDatas().get(i).getDate().equals(date)) {
				System.out.println("записи на дату "
						+ format1.format(date.getTime()) + ":");
				ArrayList<String> list2 = getDatas().get(i).getList();
				for (int j = 0; j < list2.size(); j++) {
					System.out.println(list2.get(j));
				}
				return;
			}
		}
	}

	class Data {
		private GregorianCalendar	date;
		private ArrayList<String>	list	= new ArrayList<String>();

		public Data() {
			// list = new ArrayList<String>();
		}

		public Data(GregorianCalendar date, String note) {
			this.date = date;
			list.add(note);
		}

		public GregorianCalendar getDate() {
			return date;
		}

		public void setDate(GregorianCalendar date) {
			this.date = date;
		}

		public ArrayList<String> getList() {
			return list;
		}

		public void setList(ArrayList<String> list) {
			this.list = list;
		}

	}

	public ArrayList<Data> getDatas() {
		return datas;
	}
}
