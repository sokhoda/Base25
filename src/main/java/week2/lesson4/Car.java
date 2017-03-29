package week2.lesson4;

public class Car {
	private String	number;
	private String	color;
	private int		countHuman;
	private boolean	started;
	private boolean	moving;

	public void setColor(String color) {
		this.color = color;
	}

	private Track	track;

	public Car() {
		this("default");
	}

	public String getState() {
		if (started) {
			if (moving) return "завед., двигаюсь";
			else return "завед., стою";
		}
		else if (moving) return "не завед., двигаюсь";
		else return "не завед., стою";
	}

	public String getColor() {
		return color;
	}

	public Track getTrack() {
		return track;
	}

	public Car(String number, String color, boolean started) {
		this.number = number;
		this.color = color;
		this.countHuman = 0;
		this.started = started;
		this.moving = false;
	}

	public Car(String number, String color) {
		this(number, color, false);
	}

	public Car(String number) {
		this(number, "white", false);
	}

	public Car(String number, String color, int countHuman) {
		this(number, color, false);
		this.countHuman = countHuman;
	}

	public Car(String number, String color, Track track) {
		this(number, color, false);
		setTrack(track);
	}

	public void setTrack(Track track) {
		if (track == null) return;
		if (this.track == null) {
			if (track.getCar() == null) {
				this.track = track;
				track.setCar(this);
				System.out.println("\nк авто номер = " + this.getNumber()
						+ " присоединен прицеп номер = " + track.getNumber());
			}
			else System.out.println("\nне могу присоединить прицеп номер = "
					+ track.getNumber()
					+ ", так как он уже присоединен к авто номер = "
					+ track.getCar().getNumber());
		}
		else System.out.println("\nне могу присоединить прицеп номер = "
				+ track.getNumber() + ", так как к авто номер = "
				+ this.getNumber() + " уже присоединен прицеп номер = "
				+ this.track.getNumber());
	}

	public void unSetTrack() {
		if (track == null) System.out.println("\nу авто номер = "
				+ this.getNumber() + " нет присоединенного прицепа");
		else {
			System.out.println("\nу авто номер = " + this.getNumber()
					+ " отсоединен прицеп номер = " + track.getNumber());
			track.setCar(null);
			track = null;
		}
	}

	public String getNumber() {
		return "\"" + number + "\"";
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void addHuman(int count) {
		countHuman = countHuman + count;
	}

	public void start() {
		if (started) System.out.println("авто " + number
				+ " не могу завестись так как уже заведена");
		else if (moving) System.out.println("авто " + number
				+ " не могу завестись так как уже еду");
		else {
			started = true;
			System.out.println("авто " + number + " завелась");
		}
	}

	public void move() {
		if (moving) System.out.println("авто " + number
				+ " не могу ехать так как уже еду");
		else if (started == false) System.out.println("авто " + number
				+ " не могу ехать так как еще не заведена");
		else if (this.track != null) {

			if (this.track.canMove()) {
				moving = true;
				System.out.println("авто " + number + " начала движение");
				this.track.roll();
			}
			else System.out.println("авто " + number
					+ " не может начать движение, так как прицеп номер = "
					+ this.track.getNumber() + " не может начать движение");
		}
		else {
			moving = true;
			System.out.println("авто " + number + " начала движение");
		}
	}

	public void stop() {
		if (!(moving)) System.out.println("авто " + number
				+ " не могу остановиться так как не еду");
		else if (this.track != null) {

			if (this.track.canStop()) {
				moving = false;
				System.out.println("авто " + number + " остановилась");
				this.track.stop();
			}
			else System.out.println("авто " + number
					+ " не может остановиться, так как прицеп номер = "
					+ this.track.getNumber() + " не может остановиться");
		}
		else {
			moving = false;
			System.out.println("авто " + number + " остановилась");
		}
	}

	public void printAboutMe() {
		System.out.println("Я автомобиль " + number + ", мой цвет " + color
				+ ", количество людей " + countHuman);
	}
}
