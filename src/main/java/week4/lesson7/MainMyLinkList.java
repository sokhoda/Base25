package week4.lesson7;

public class MainMyLinkList {
	public static void main(String[] args) {
		MyLinkList list1 = new MyLinkList();
		MyLinkList list2 = new MyLinkList();

		list1.add(15);
		// // list1.printElement(0);
		list1.add(15);
		// // list1.printElement(1);
		list1.add(-15);

		list1.add(2);
		list1.add(-2);

		list1.add(-1);
		list1.add(555);

		list1.add(21);
		list1.add(21);
		list1.add(21);
		list1.add(-1);

		System.out.println("list1");
		list1.printAll();
		// list1.remove(list1.size() - 1);
		// list1.printAll();
		// System.exit(0);

		System.out.println("removeDuplicates list1");
		list1.removeDuplicates();
		list1.printAll();
		System.exit(0);

		list2.add(15);
		// // list2.printElement(0);
		list2.add(225);
		// // list2.printElement(1);
		// list2.add(115);
		System.out.println(list2.equals(list2));

		System.out.println("list2");
		list2.printAll();
		// list2.concat(list1);
		//
		// System.out.println("list + list2");
		// list2.printAll();
		System.exit(0);

		System.out.println(list1.equals(list2));

		System.out.println("size =" + list1.size());
		list1.printAll();

		System.out.println(list1.indexOf(15));
		list1.remove(0);
		list1.printAll();

		System.out.println(list1.indexOf(1));
		list1.swapFirstLast();
		list1.printAll();
		// System.out.println("revert");
		// list1.revert();
		// list1.printAll();

		list1.swapMaxMin();
		list1.printAll();

		System.out.println("sortPartial(4)");
		list1.sortPartial(4);
		list1.printAll();

		System.out.println("sort");
		list1.sort();
		list1.printAll();
		// list1.set(5, -10);
		// list1.printElement(4);
	}
}
