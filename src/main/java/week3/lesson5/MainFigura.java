package week3.lesson5;

public class MainFigura {
	public static void main(String[] args) {
		// Figura fig1 = new Figura(0, 0, 10);

		Triangle trig1 = new Triangle(1, 1, 10, 20);
		Circle cir1 = new Circle(100, 100, 20);
		Square square1 = new Square(1, 1, 40);
		Rectangle rect1 = new Rectangle(5, 15, 10, 25);
		System.out.println("������� ����� = " + trig1.getSquare()
				+ ", �������� = " + trig1.getPerimetr());

		System.out.println("������� ����� = " + cir1.getSquare()
				+ ", �������� = " + cir1.getPerimetr());

		System.out.println("������� �������� = " + square1.getSquare()
				+ ", �������� = " + square1.getPerimetr());
		System.out.println("������� ����� = " + rect1.getSquare()
				+ ", �������� = " + rect1.getPerimetr());
	}
}
