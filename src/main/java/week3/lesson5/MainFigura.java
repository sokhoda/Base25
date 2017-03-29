package week3.lesson5;

public class MainFigura {
	public static void main(String[] args) {
		// Figura fig1 = new Figura(0, 0, 10);

		Triangle trig1 = new Triangle(1, 1, 10, 20);
		Circle cir1 = new Circle(100, 100, 20);
		Square square1 = new Square(1, 1, 40);
		Rectangle rect1 = new Rectangle(5, 15, 10, 25);
		System.out.println("площадь треуг = " + trig1.getSquare()
				+ ", периметр = " + trig1.getPerimetr());

		System.out.println("площадь круга = " + cir1.getSquare()
				+ ", периметр = " + cir1.getPerimetr());

		System.out.println("площадь квадрата = " + square1.getSquare()
				+ ", периметр = " + square1.getPerimetr());
		System.out.println("площадь круга = " + rect1.getSquare()
				+ ", периметр = " + rect1.getPerimetr());
	}
}
