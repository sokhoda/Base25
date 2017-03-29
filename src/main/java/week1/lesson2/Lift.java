package week1.lesson2;

public class Lift {
	int curFloor; // текущий этаж
	int countFloor; // общее количество этажей перемещения
	int countPeople; // общее количество перевезенных людей
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
			System.out.println("Не корректный номер этажа.");
			return false;
		}
		if (countHuman < 0) {
			System.out.println("Не корректное количество людей.");
			return false;
		}

		if ((countHuman > curPeople) && (curFloor > 1)) {
			System.out
					.println("В лифт не может зайти количество людей большее, чем количество людей находящихся в данный момент в доме.");
			return false;
		}
		if ((curPeople == 0) && (curFloor > 1)) {
			if (nextFloor != 1) {
				System.out
						.println("Лифт не может ехать на этаж "
								+ nextFloor
								+ ", так как количество людей находящихся в данный момент в доме ="
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
		System.out.println("Состояние лифта:\nтекущий этаж = " + curFloor
				+ "\nобщее количество этажей перемещения = " + countFloor
				+ "\nобщее количество перевезенных людей = " + countPeople
				+ "\nколичество людей находящихся в данный момент в доме = "
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
