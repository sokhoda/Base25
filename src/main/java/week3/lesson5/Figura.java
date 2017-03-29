package week3.lesson5;

public abstract class Figura {
	private double	xPos;
	private double	yPos;
	private double	sideA;

	public Figura(double xPos, double yPos, double sideA) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.sideA = sideA;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getxPos() {
		return xPos;
	}

	public void setxPos(double xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(double yPos) {
		this.yPos = yPos;
	}

	public double getSquare() {
		return 0;
	}

	abstract public double getPerimetr();

	public void printAboutMe() {
		System.out.println("сторона = " + sideA + ", координаты xPos = " + xPos
				+ ", yPos = " + yPos);
	}
}
