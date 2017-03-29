package week4.lesson7;

public class Element implements Comparable<Element> {
	private int		value;
	private Element	next;

	public Element(int value, Element next) {
		this.value = value;
		this.next = next;
	}

	public Element(int value) {
		this.value = value;
		this.next = null;
	}

	@Override
	public int compareTo(Element o) {
		if (getValue() > o.getValue()) return 1;
		else {
			if (getValue() == o.getValue()) return 0;
			else return -1;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}

}
