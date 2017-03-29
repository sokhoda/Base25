package week3.lesson5;

public class Wing {
	private double	fuelVolumeLeft;
	private double	fuelVolumeRight;

	public Wing(double fuelVolumeLeft, double fuelVolumeRight) {
		this.fuelVolumeLeft = fuelVolumeLeft;
		this.fuelVolumeRight = fuelVolumeRight;
	}

	public double getFuelVolumeLeft() {
		return fuelVolumeLeft;
	}

	public void setFuelVolumeLeft(double fuelVolumeLeft) {
		this.fuelVolumeLeft = fuelVolumeLeft;
	}

	public double getFuelVolumeRight() {
		return fuelVolumeRight;
	}

	public void setFuelVolumeRight(double fuelVolumeRight) {
		this.fuelVolumeRight = fuelVolumeRight;
	}

}
