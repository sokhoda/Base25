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
		if (isRolling) return "двигаюсь";
		else return "стою";
	}

	public boolean canMove() {
		if (!(isRolling)) return true;
		else {
			System.out.println("прицеп номер = " + number
					+ " не может начать движение, так как уже едет");
			return false;
		}
	}

	public boolean canStop() {
		if (isRolling) return true;
		else System.out.println("прицеп номер = " + number
				+ " не может остановиться, так как уже остановлен");
		return false;
	}

	public void roll() {
		if (isRolling) System.out.println("\nЯ прицеп с номером = \"" + number
				+ "\"" + " не могу катиться, так как уже качусь");
		else {
			isRolling = true;
			System.out.println("\nЯ прицеп с номером = \"" + number + "\""
					+ " начал катиться");
		}
	}

	public String getNumber() {
		return "\"" + number + "\"";
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void stop() {
		if (!(isRolling)) System.out.println("\nЯ прицеп с номером = \""
				+ number + "\""
				+ " не могу остановиться, так как уже остановлен");
		else {
			isRolling = false;
			System.out.println("\nЯ прицеп с номером = \"" + number + "\""
					+ " остановился");
		}
	}

}
