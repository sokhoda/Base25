package week2.lesson3;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	MyInteger plus(MyInteger MyInt2) {
		MyInteger MyIntResult = new MyInteger(this.value + MyInt2.value);
		return MyIntResult;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
