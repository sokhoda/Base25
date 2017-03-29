package week1.lesson2;

public class Car {
	String number;
	String color;
	int countHuman;
	boolean started;
	boolean moving;
	boolean stopped;

	public Car() {
		number = "default";
	}

	public Car(String number, String color, boolean started) {
		this.number = number;
		this.color = color;
		this.countHuman = 0;
		this.started = started;
		this.moving = false;
		this.stopped = false;
	}

	public Car(String number, String color) {
		this(number, color, false);

	}

	public Car(String number) {
		this(number, "white", false);
	}

	public Car(String number, String color, int countHuman) {
		this(number, color);
		this.countHuman = countHuman;
	}

	public void addHuman(int count) {
		countHuman = countHuman + count;
	}

	public void start() {
		if (started) {
			System.out.println("���� " + number
					+ " �� ���� ��������� ��� ��� ��� ��������");
		} else if (moving) {
			System.out.println("���� " + number
					+ " �� ���� ��������� ��� ��� ��� ���");
		} else {
			started = true;
			System.out.println("���� " + number + " ��������");
		}
	}

	public void move() {
		if (moving) {
			System.out.println("���� " + number
					+ " �� ���� ����� ��� ��� ��� ���");
		} else if (started == false) {
			System.out.println("���� " + number
					+ " �� ���� ����� ��� ��� ��� �� ��������");
		} else {
			moving = true;
			System.out.println("���� " + number + " ������ ��������");
		}
	}

	public void stop() {
		if (moving == false) {
			System.out.println("���� " + number
					+ " �� ���� ������������ ��� ��� �� ���");
		} else {
			stopped = true;
			System.out.println("���� " + number + " ������������");
		}
	}

	public void printAboutMe() {
		System.out.println("� ���������� " + number + ", ��� ���� " + color
				+ ", ���������� ����� " + countHuman);
	}
}
