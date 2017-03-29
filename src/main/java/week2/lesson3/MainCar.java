package week2.lesson3;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setMarka("Chevrolet");
		car1.setNumber("AA 1111");
		car1.printAboutMe();
		Car.printCountObj();

		Car car2 = new Car();
		car2.printAboutMe();
		Car.printCountObj();
		Car[] car3 = new Car[10];
		System.out.println(car3[0].getMarka());
	}
}
