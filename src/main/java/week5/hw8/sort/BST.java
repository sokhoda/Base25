package week5.hw8.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class BST {
	TNode	top;

	public BST() {
		this.top = null;
	}

	public void add(int value) {
		if (top == null) {
			top = new TNode(value);
			return;
		}
		TNode cur = top;
		boolean condLeft = (cur.getValue() > value && cur.getLeft() == null);
		boolean condRight = (cur.getValue() < value && cur.getRight() == null);
		boolean cond = condRight || condLeft || (cur.getValue() == value);

		while (!cond) {
			if (cur.getValue() < value) cur = cur.getRight();
			else {
				if (cur.getValue() > value) cur = cur.getLeft();
				else {
					TNode cur1 = new TNode(value);
					cur1.setLeft(cur.getLeft());
					cur1.setRight(cur.getRight());
					cur = cur1;
					return;
				}
			}
			condLeft = (cur.getValue() > value && cur.getLeft() == null);
			condRight = (cur.getValue() < value && cur.getRight() == null);
			cond = condRight || condLeft || (cur.getValue() == value);
		}

		if (condLeft) cur.setLeft(new TNode(value));
		else cur.setRight(new TNode(value));

	}

	public ArrayList<Integer> traversBreadthFirst() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int h = calcHeight();
		for (int i = 0; i < h; i++) {
			getAllBreadthFirst(top, 0, i, arr);
		}
		return arr;
	}

	private void getAllBreadthFirst(TNode topNode, int curLevel, int levToScan,
			ArrayList<Integer> arr) {
		if (curLevel == levToScan) {
			if (topNode != null) {
				arr.add(topNode.getValue());
			}
			else {
				arr.add(0);
			}
			return;
		}
		curLevel++;
		if (topNode != null) {
			getAllBreadthFirst(topNode.getLeft(), curLevel, levToScan, arr);
			getAllBreadthFirst(topNode.getRight(), curLevel, levToScan, arr);
		}
		else {
			getAllBreadthFirst(null, curLevel, levToScan, arr);
			getAllBreadthFirst(null, curLevel, levToScan, arr);
		}
	}

	public boolean contains(int element) {
		return containsRec(top, element);
	}

	private boolean containsRec(TNode topNode, int element) {
		if (topNode != null) {
			if (topNode.getValue() == element) return true;
			if (containsRec(topNode.getLeft(), element)) return true;
			if (containsRec(topNode.getRight(), element)) return true;
		}
		return false;
	}

	public int count() {
		return getCount(top, 0);
	}

	private int getCount(TNode topNode, int counter) {
		int counter1 = 0, counter2 = 0;
		if (topNode != null) {
			counter++;
			counter1 = counter;
			if (topNode.getLeft() != null) {
				counter1 = getCount(topNode.getLeft(), counter);
			}
			counter2 = counter1;
			if (topNode.getRight() != null) {
				counter2 = getCount(topNode.getRight(), counter1);
			}
		}
		return (counter2);
	}

	public int max() {
		return getMax(top, 0);
	}

	private int getMax(TNode topNode, int max) {
		int max1 = max, max2 = max;
		if (topNode != null) {
			if (max < topNode.getValue()) max = topNode.getValue();

			max1 = getMax(topNode.getLeft(), max);
			max2 = getMax(topNode.getRight(), max);
		}
		return ((max1 > max2) ? max1 : max2);
	}

	public int calcHeight() {
		return calcH(top, 0);
	}

	public int calcH(TNode topNode, int height) {
		int height1 = height, height2 = height;
		if (topNode != null) {
			height++;
			height1 = calcH(topNode.getLeft(), height);
			height2 = calcH(topNode.getRight(), height);
		}
		return ((height1 > height2) ? height1 : height2);
	}

	public ArrayList<Integer> traversPreOrder() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		getAllPreOrder(top, arr);
		return arr;
	}

	private void getAllPreOrder(TNode topNode, ArrayList<Integer> arr) {
		if (topNode != null) {
			arr.add(topNode.getValue());
			getAllPreOrder(topNode.getLeft(), arr);
			getAllPreOrder(topNode.getRight(), arr);
		}
	}

	public void print() {
		ArrayList<Integer> arr;
		// arr = traversPreOrder();
		arr = traversBreadthFirst();
		int height = calcH(top, 0);
		String[] s = new String[arr.size()];
		for (int i = 0; i < s.length; i++) {
			s[i] = arr.get(i).toString();
			// if (s[i].equals("0")) s[i] = "00";
		}
		System.out.println(Arrays.toString(s));
		int sym = 2;
		int vidst = 80;
		int dist = 140;
		int n = 0;
		int curElNum = 1;
		for (int i = 0; i < height; i++) {

			String Svidst = stringOfSize(vidst, ' ');
			String Sdist = stringOfSize(dist, ' ');
			System.out.printf(Svidst);

			for (int j = 0; j < curElNum; j++) {
				if (n >= s.length) return;
				System.out.printf("%-" + sym + "s" + Sdist, s[n]);
				n++;
			}
			System.out.println("\n");
			// System.out.println("\n dist = " + dist + ", vidst = " + vidst);
			dist = (int) (dist * 0.5) - 1;
			if (dist < 2) dist = 2;

			vidst = vidst - (int) (0.5 * dist) - 1;
			if (vidst < 0) vidst = 0;
			curElNum *= 2;
		}
	}

	public static String stringOfSize(int size, char ch) {
		final char[] array = new char[size];
		Arrays.fill(array, ch);
		return new String(array);
	}

}
