package week2.lesson4;

public class Track {
	private String	number;
	private boolean	isRolling;

	private Car		car;

	public Track(String number) {
		this.number = number;
	}

	public Car getCar() {
		return this.car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getState() {
		if (isRolling) return "��������";
		else return "����";
	}

	public boolean canMove() {
		if (!(isRolling)) return true;
		else {
			System.out.println("������ ����� = " + number
					+ " �� ����� ������ ��������, ��� ��� ��� ����");
			return false;
		}
	}

	public boolean canStop() {
		if (isRolling) return true;
		else System.out.println("������ ����� = " + number
				+ " �� ����� ������������, ��� ��� ��� ����������");
		return false;
	}

	public void roll() {
		if (isRolling) System.out.println("\n� ������ � ������� = \"" + number
				+ "\"" + " �� ���� ��������, ��� ��� ��� ������");
		else {
			isRolling = true;
			System.out.println("\n� ������ � ������� = \"" + number + "\""
					+ " ����� ��������");
		}
	}

	public String getNumber() {
		return "\"" + number + "\"";
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void stop() {
		if (!(isRolling)) System.out.println("\n� ������ � ������� = \""
				+ number + "\""
				+ " �� ���� ������������, ��� ��� ��� ����������");
		else {
			isRolling = false;
			System.out.println("\n� ������ � ������� = \"" + number + "\""
					+ " �����������");
		}
	}

}
