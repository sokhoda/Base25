package week4.hw4;

public class MyArrayList {
	static final int	startSize	= 10;
	static final double	growFactor	= 1.5;

	private int[]		arr			= new int[startSize];
	private int			lastElInx	= -1;

	public MyArrayList() {
	}

	public int remove(int index) {
		if (index < 0 || index > lastElInx) {
			System.out.println("Индекс выходит за пределы массива");
			return index;
		}

		for (int i = index; i < lastElInx; i++) {
			arr[i] = arr[i + 1];
		}
		lastElInx--;

		if (arr.length / (double) lastElInx >= 4. / 3. * growFactor) {
			int[] newArr = new int[(int) Math.round(arr.length / growFactor)];
			for (int i = 0; i <= lastElInx; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		return index;
	}

	public int indexOf(int value) {
		for (int i = 0; i <= lastElInx; i++) {
			if (arr[i] == value) return i;
		}
		return -1;
	}

	public void add(int value) {
		lastElInx++;
		if (arr.length - 1 == lastElInx) {
			int[] newArr = new int[(int) Math.round(growFactor * arr.length)];
			for (int i = 0; i < lastElInx; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[lastElInx] = value;

	}

	public int size() {
		return lastElInx + 1;
	}

	public int get(int index) {
		if (index <= lastElInx && index >= 0) return arr[index];
		else {
			System.out.println("Индекс выходит за пределы массива");
			return 0;
		}
	}

	public boolean set(int index, int value) {
		if (index <= lastElInx && index >= 0) {
			arr[index] = value;
			return true;
		}
		else {
			System.out.println("Индекс выходит за пределы массива");
			return false;
		}
	}

	public void printMe() {
		for (int i = 0; i <= lastElInx; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

	public boolean add(int index, int value) {
		if (index < 0) {
			System.out.println("Индекс выходит за пределы массива");
			return false;
		}
		if (index > lastElInx) {
			add(value);
		}
		else {
			lastElInx++;
			int k;
			if (arr.length - 1 == lastElInx) {
				int[] newArr = new int[(int) Math
				                       .round(growFactor * arr.length)];
				for (int i = 0; i < lastElInx; i++) {
					if (i < index) k = i;
					else k = i + 1;
					newArr[k] = arr[i];
				}
				newArr[index] = value;
				arr = newArr;
			}
			else {
				for (int i = lastElInx; i > index; i--) {
					arr[i] = arr[i - 1];
				}
				arr[index] = value;
			}
		}
		return true;
	}
}
