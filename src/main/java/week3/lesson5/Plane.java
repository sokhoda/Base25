package week3.lesson5;

public class Plane extends Wing {
	private final double	MinFuelVol	= 20;
	private String			state;

	public void takeoff() {
		if (getFuelVolumeLeft() < MinFuelVol) {
			System.out
			.println("������� �� ����� ��������: ������������ ������� � ����� �����.");
			state = "���� �� �����";
			return;
		}
		else if (getFuelVolumeRight() < MinFuelVol) {
			System.out
			.println("������� �� ����� ��������: ������������ ������� � ������ �����.");
			state = "���� �� �����";
			return;
		}
		else {
			System.out.println("������� ������� �������...");
			state = "�������";
		}
	}

	public Plane(double fuelVolumeLeft, double fuelVolumeRight) {
		super(fuelVolumeLeft, fuelVolumeRight);
		state = "���� �� �����";
	}

	public void selectRoute(int[][] coordinates) {
		System.out.println("������� � ������������");
		printCoordinates(coordinates);
		System.out.println("������� ������.");
	}

	private void printCoordinates(int[][] coordinates) {
		for (int i = 0; i < coordinates[0].length; i++) {
			System.out.println("(" + coordinates[0][i] + ", \t"
					+ coordinates[1][i] + ")");
		}
		return;
	}

	public void printRoute() {
		System.out.println("����� ��������");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
