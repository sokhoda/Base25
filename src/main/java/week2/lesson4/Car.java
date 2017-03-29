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
			if (moving) return "�����., ��������";
			else return "�����., ����";
		}
		else if (moving) return "�� �����., ��������";
		else return "�� �����., ����";
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
				System.out.println("\n� ���� ����� = " + this.getNumber()
						+ " ����������� ������ ����� = " + track.getNumber());
			}
			else System.out.println("\n�� ���� ������������ ������ ����� = "
					+ track.getNumber()
					+ ", ��� ��� �� ��� ����������� � ���� ����� = "
					+ track.getCar().getNumber());
		}
		else System.out.println("\n�� ���� ������������ ������ ����� = "
				+ track.getNumber() + ", ��� ��� � ���� ����� = "
				+ this.getNumber() + " ��� ����������� ������ ����� = "
				+ this.track.getNumber());
	}

	public void unSetTrack() {
		if (track == null) System.out.println("\n� ���� ����� = "
				+ this.getNumber() + " ��� ��������������� �������");
		else {
			System.out.println("\n� ���� ����� = " + this.getNumber()
					+ " ���������� ������ ����� = " + track.getNumber());
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
		if (started) System.out.println("���� " + number
				+ " �� ���� ��������� ��� ��� ��� ��������");
		else if (moving) System.out.println("���� " + number
				+ " �� ���� ��������� ��� ��� ��� ���");
		else {
			started = true;
			System.out.println("���� " + number + " ��������");
		}
	}

	public void move() {
		if (moving) System.out.println("���� " + number
				+ " �� ���� ����� ��� ��� ��� ���");
		else if (started == false) System.out.println("���� " + number
				+ " �� ���� ����� ��� ��� ��� �� ��������");
		else if (this.track != null) {

			if (this.track.canMove()) {
				moving = true;
				System.out.println("���� " + number + " ������ ��������");
				this.track.roll();
			}
			else System.out.println("���� " + number
					+ " �� ����� ������ ��������, ��� ��� ������ ����� = "
					+ this.track.getNumber() + " �� ����� ������ ��������");
		}
		else {
			moving = true;
			System.out.println("���� " + number + " ������ ��������");
		}
	}

	public void stop() {
		if (!(moving)) System.out.println("���� " + number
				+ " �� ���� ������������ ��� ��� �� ���");
		else if (this.track != null) {

			if (this.track.canStop()) {
				moving = false;
				System.out.println("���� " + number + " ������������");
				this.track.stop();
			}
			else System.out.println("���� " + number
					+ " �� ����� ������������, ��� ��� ������ ����� = "
					+ this.track.getNumber() + " �� ����� ������������");
		}
		else {
			moving = false;
			System.out.println("���� " + number + " ������������");
		}
	}

	public void printAboutMe() {
		System.out.println("� ���������� " + number + ", ��� ���� " + color
				+ ", ���������� ����� " + countHuman);
	}
}
