package week4.hw4;

public class MainMyArrayList {
	public static void main(String[] args) {
		MyArrayList l1 = new MyArrayList();
		System.out.println("size = " + l1.size());
		l1.printMe();

		l1.add(5, 22);
		System.out.println("size = " + l1.size());
		l1.printMe();
		System.out.println(l1.get(0));
		// l1.printMe();
		/*
		 * l1.add(10); System.out.println("size = " + l1.size());
		 * 
		 * for (int i = 0; i < 12; i++) { int k = (int) (Math.random() * 100);
		 * l1.add(k); } l1.printMe(); System.out.println("size = " + l1.size());
		 * l1.set(3, 120); l1.printMe(); l1.add(5, -1); l1.printMe();
		 * 
		 * System.out.println("remove 5"); l1.remove(5); l1.printMe();
		 * System.out.println("remove 5"); l1.remove(5); l1.printMe();
		 * System.out.println("remove 5"); l1.remove(5); l1.printMe();
		 * System.out.println("remove 12"); l1.remove(12); l1.printMe();
		 * System.out.println("size = " + l1.size());
		 * 
		 * System.out.println("indexOf(120)=" + l1.indexOf(120));
		 * System.exit(0);
		 * 
		 * for (int i = 0; i < 12; i++) { l1.remove(0); if (i > 9) {
		 * l1.printMe(); System.out.println("size = " + l1.size()); } }
		 * l1.add(12); l1.add(12); l1.add(12); l1.printMe(); //
		 * System.out.println(l1.get(18));
		 */

	}
}
