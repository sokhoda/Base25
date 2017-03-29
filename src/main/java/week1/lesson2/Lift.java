package week1.lesson2;

public class Lift {
	int curFloor; // ������� ����
	int countFloor; // ����� ���������� ������ �����������
	int countPeople; // ����� ���������� ������������ �����
	int curPeople;

	public Lift(int curFloor, int curPeople) {
		this.curFloor = curFloor;
		this.curPeople = curPeople;
		this.countFloor = 0;
		this.countPeople = 0;
	}

	public Lift(int curPeople) {
		this(1, curPeople);
	}

	public Lift() {
		this(1, 0);
	}

	public boolean move(int nextFloor, int countHuman) {
		if (nextFloor < 1) {
			System.out.println("�� ���������� ����� �����.");
			return false;
		}
		if (countHuman < 0) {
			System.out.println("�� ���������� ���������� �����.");
			return false;
		}

		if ((countHuman > curPeople) && (curFloor > 1)) {
			System.out
					.println("� ���� �� ����� ����� ���������� ����� �������, ��� ���������� ����� ����������� � ������ ������ � ����.");
			return false;
		}
		if ((curPeople == 0) && (curFloor > 1)) {
			if (nextFloor != 1) {
				System.out
						.println("���� �� ����� ����� �� ���� "
								+ nextFloor
								+ ", ��� ��� ���������� ����� ����������� � ������ ������ � ���� ="
								+ curPeople);
				return false;
			}
		}
		if (curFloor == nextFloor) {
			return true;
		} else if (curFloor == 1) {
			setCurPeople(curPeople + countHuman);
		} else if (nextFloor == 1) {
			setCurPeople(curPeople - countHuman);
		}
		setCountPeople(countPeople + countHuman);
		setCountFloor(countFloor + Math.abs(nextFloor - curFloor));
		setCurFloor(nextFloor);

		return true;
	}

	public void printAboutMe() {
		// DecimalFormat decForm = new DecimalFormat("#");
		System.out.println("��������� �����:\n������� ���� = " + curFloor
				+ "\n����� ���������� ������ ����������� = " + countFloor
				+ "\n����� ���������� ������������ ����� = " + countPeople
				+ "\n���������� ����� ����������� � ������ ������ � ���� = "
				+ curPeople);

	}

	public void setCurFloor(int curFloor) {
		this.curFloor = curFloor;
	}

	public void setCountFloor(int countFloor) {
		this.countFloor = countFloor;
	}

	public void setCountPeople(int countPeople) {
		this.countPeople = countPeople;
	}

	public void setCurPeople(int curPeople) {
		this.curPeople = curPeople;
	}

}
