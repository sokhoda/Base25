package week3.lesson5;

public class Square extends Rectangle {

	@Override
	public double getSquare() {
		return Math.pow(getSideA(), 2);
	}

	@Override
	public double getPerimetr() {
		return 4 * getSideA();
	}

	public Square(double xPos, double yPos, double sideA) {
		super(xPos, yPos, sideA, sideA);
		// TODO Auto-generated constructor stub
	}

}
