package week3.lesson5;

public class Triangle extends Figura {
	private double	sideB;

	public Triangle(double xPos, double yPos, double sideA, double sideB) {
		super(xPos, yPos, sideA);
		this.sideB = sideB;
	}

	@Override
	public double getSquare() {
		double res = sideB * getSideA() / 2;
		return res;
	}

	@Override
	public double getPerimetr() {
		return Math.sqrt(Math.pow(sideB, 2) + Math.pow(getSideA(), 2)) + sideB
				+ getSideA();
	}

	@Override
	public void printAboutMe() {
		System.out.println("сторона = " + getSideA() + ", координаты xPos = "
				+ getxPos() + ", yPos = " + getyPos() + ", сторона B = "
				+ sideB);
	}
}
