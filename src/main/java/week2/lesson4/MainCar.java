package week2.lesson4;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("BB 2222");
		Car car3 = new Car("CC 3333", "magenta", false);

		car1.setNumber("AA 1111");
		car1.setColor("желтый");

		// car2.number = "BB 2222";
		car2.setColor("зеленый");

		car1.start();
		car2.start();
		car3.start();

		car1.move();
		car2.move();

		car1.stop();
		car2.stop();
		car3.stop();
		//
		// System.out.println();
		//
		// car1.addHuman(-2);
		// car2.addHuman(-2);
		// car3.addHuman(-1);

	}

}
