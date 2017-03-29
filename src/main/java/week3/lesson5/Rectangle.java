package week3.lesson5;

public class Rectangle extends Figura {
	private double	sideB;

	@Override
	public double getSquare() {
		return getSideA() * sideB;
	}

	@Override
	public double getPerimetr() {
		return 2 * (getSideA() + sideB);
	}

	public Rectangle(double xPos, double yPos, double sideA, double sideB) {
		super(xPos, yPos, sideA);
		this.sideB = sideB;
	}

}
