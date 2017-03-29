package week5.hw8.sort;

public class MainBinaryTree {
	static final int	arrNum	= 50;

	public static int[] getArr() {
		int[] arr = new int[arrNum];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}

	public static void main(String[] args) {
		BST bt = new BST();
		bt.add(20);
		bt.add(10);
		bt.add(70);
		bt.add(7);

		bt.add(40);
		bt.add(41);
		bt.add(15);
		bt.add(80);

		bt.add(17);
		bt.add(22);
		bt.add(44);
		bt.add(102);

		bt.add(82);
		bt.add(79);
		bt.add(6);
		bt.add(5);

		bt.add(4);
		System.out.println(bt.calcHeight());
		bt.print();
		System.out.println("max = " + bt.max() + ", Count = " + bt.count()
				+ ", contains = " + bt.contains(45));

	}
}
