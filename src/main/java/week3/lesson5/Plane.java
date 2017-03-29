package week3.lesson5;

public class Plane extends Wing {
	private final double	MinFuelVol	= 20;
	private String			state;

	public void takeoff() {
		if (getFuelVolumeLeft() < MinFuelVol) {
			System.out
			.println("самолет не может взлететь: недостаточно топлива в левом крыле.");
			state = "стою на земле";
			return;
		}
		else if (getFuelVolumeRight() < MinFuelVol) {
			System.out
			.println("самолет не может взлететь: недостаточно топлива в правом крыле.");
			state = "стою на земле";
			return;
		}
		else {
			System.out.println("самолет успешно взлетел...");
			state = "взлетел";
		}
	}

	public Plane(double fuelVolumeLeft, double fuelVolumeRight) {
		super(fuelVolumeLeft, fuelVolumeRight);
		state = "стою на земле";
	}

	public void selectRoute(int[][] coordinates) {
		System.out.println("маршрут с координатами");
		printCoordinates(coordinates);
		System.out.println("успешно выбран.");
	}

	private void printCoordinates(int[][] coordinates) {
		for (int i = 0; i < coordinates[0].length; i++) {
			System.out.println("(" + coordinates[0][i] + ", \t"
					+ coordinates[1][i] + ")");
		}
		return;
	}

	public void printRoute() {
		System.out.println("вывод маршрута");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
