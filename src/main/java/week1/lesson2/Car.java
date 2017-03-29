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
			System.out.println("авто " + number
					+ " не могу завестись так как уже заведена");
		} else if (moving) {
			System.out.println("авто " + number
					+ " не могу завестись так как уже еду");
		} else {
			started = true;
			System.out.println("авто " + number + " завелась");
		}
	}

	public void move() {
		if (moving) {
			System.out.println("авто " + number
					+ " не могу ехать так как уже еду");
		} else if (started == false) {
			System.out.println("авто " + number
					+ " не могу ехать так как еще не заведена");
		} else {
			moving = true;
			System.out.println("авто " + number + " начала движение");
		}
	}

	public void stop() {
		if (moving == false) {
			System.out.println("авто " + number
					+ " не могу остановиться так как не еду");
		} else {
			stopped = true;
			System.out.println("авто " + number + " остановилась");
		}
	}

	public void printAboutMe() {
		System.out.println("Я автомобиль " + number + ", мой цвет " + color
				+ ", количество людей " + countHuman);
	}
}
