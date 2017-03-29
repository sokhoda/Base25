package week4.lesson7;

public class Node implements Comparable<Node> {
	private int		value;
	private Node	next;

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	@Override
	public int compareTo(Node obj) {
		if (getValue() > obj.getValue()) return 1;
		else {
			if (getValue() == obj.getValue()) return 0;
			else return -1;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
