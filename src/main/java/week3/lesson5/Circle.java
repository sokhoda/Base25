package week3.lesson5;

public class Circle extends Figura {

	@Override
	public double getSquare() {
		return Math.PI * Math.pow(getSideA(), 2);
	}

	@Override
	public double getPerimetr() {
		return 2 * Math.PI * getSideA();
	}

	public Circle(double xPos, double yPos, double sideA) {
		super(xPos, yPos, sideA);
	}

}
