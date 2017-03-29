package week4.lesson7;

public class MyLinkList {
	private Element	first;

	public MyLinkList() {
		first = null;
	}

	public void removeDuplicates() {
		MyLinkList vals = new MyLinkList();
		if (size() > 1) {
			int i = 0;
			int j = 0;
			Element cur = first;

			while (cur != null) {
				int curVal = cur.getValue();
				if (vals.indexOf(curVal) == -1) {
					vals.add(curVal);
				}
				else {
					remove(i - j);
					j++;
				}
				cur = cur.getNext();
				i++;
			}
		}
	}

	public MyLinkList concat(MyLinkList list) {
		if (this == list) {
			System.out
					.println("указатели указывают на одну и ту же область памяти.");
			return this;
		}
		if (list.size() > 0) {
			if (size() == 0) {
				setFirst(new Element(list.get(0).getValue(), list.get(0)
						.getNext()));
			}
			else get(size() - 1).setNext(list.get(0));
		}
		return this;
	}

	public boolean equals(MyLinkList list) {
		if (this.size() != list.size()) return false;
		else {
			for (int i = 0; i < list.size(); i++) {
				if (get(i).compareTo(list.get(i)) != 0) return false;
			}
		}
		return true;
	}

	public void sort() {
		int index = size() - 1;

		if (size() > 1) {
			int val;
			for (int j = 0; j < index; j++) {
				for (int i = 0; i < index - j; i++) {
					if (get(i).compareTo(get(i + 1)) > 0) {
						val = get(i).getValue();
						get(i).setValue(get(i + 1).getValue());
						get(i + 1).setValue(val);
					}
				}
			}

		}
	}

	public void sortPartial(int index) {
		if (index >= size()) index = size() - 1;

		if (size() > 1) {
			int val;
			for (int j = 0; j < index; j++) {
				for (int i = 0; i < index - j; i++) {
					if (get(i).compareTo(get(i + 1)) > 0) {
						val = get(i).getValue();
						get(i).setValue(get(i + 1).getValue());
						get(i + 1).setValue(val);
					}
				}
			}

		}
	}

	public void swapMaxMin() {
		if (size() > 1) {
			int minInx = 0, maxInx = 0;
			Element min = new Element(get(minInx).getValue(), null);
			Element max = new Element(get(maxInx).getValue(), null);

			for (int i = 1; i < size(); i++) {
				if (get(i).compareTo(min) < 0) {
					min.setValue(get(i).getValue());
					minInx = i;
				}
				if (get(i).compareTo(max) > 0) {
					max.setValue(get(i).getValue());
					maxInx = i;
				}
			}
			set(minInx, max.getValue());
			set(maxInx, min.getValue());

		}
	}

	public void printElement(int inx) {
		if (get(inx) != null) System.out.println("элемент[" + inx + "] = "
				+ get(inx).getValue());
	}

	public void set(int inx, int element) {
		if (get(inx) != null) get(inx).setValue(element);
	}

	public int indexOf(int element) {
		Element cur = getFirst();
		for (int j = 0; j < size(); j++) {
			if (cur.getValue() != element) {
				cur = cur.getNext();
			}
			else return j;
		}
		return -1;
	}

	public void printAll() {
		System.out.println();
		for (int i = 0; i < size(); i++) {
			printElement(i);
		}
	}

	public void revert() {
		if (size() > 1) {
			int i = 0;
			while (size() - 1 - i > i) {
				int e1 = get(i).getValue();
				set(i, get(size() - 1 - i).getValue());
				set(size() - 1 - i, e1);
				i++;
			}
		}
	}

	public void swapFirstLast() {
		if (size() > 1) {
			int e1 = get(0).getValue();
			set(0, get(size() - 1).getValue());
			set(size() - 1, e1);
		}
	}

	public void remove(int inx) {
		if (get(inx) != null) {
			if (inx > 0) get(inx - 1).setNext(get(inx).getNext());
			else {
				if (size() == 0) setFirst(null);
				else setFirst(get(1));
			}
		}
	}

	public void add(int elVal) {
		Element cur = first;
		if (first == null) {
			first = new Element(elVal, null);
		}
		else {
			while (cur.getNext() != null) {
				cur = cur.getNext();
			}
			cur.setNext(new Element(elVal));
		}
	}

	public int size() {
		if (first == null) return 0;
		int count = 1;
		Element cur = first;
		while (cur.getNext() != null) {
			cur = cur.getNext();
			count++;
		}
		return count;
	}

	public Element get(int inx) {
		if (inx >= size()) {
			System.out.println("индекс выходит за пределы списка");
			return null;
		}
		else {
			Element cur = first;
			for (int i = 0; i < inx; i++) {
				cur = cur.getNext();
			}
			return cur;
		}
	}

	public Element getFirst() {
		return first;
	}

	public void setFirst(Element first) {
		this.first = first;
	}

}
