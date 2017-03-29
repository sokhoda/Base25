package week1.lesson2;

public class MainLift {
	public static void main(String[] args) {
		Lift myLift = new Lift();
		for (int i = 0; i < 10; i++) {
			double nextFloor = Math.random();
			double countHuman = Math.random();
			int nextFloorInt = (int) (nextFloor * 9) + 1;
			int countHumanInt = (int) (countHuman * 10);
			System.out.println("Перевозка №" + i + ":\nслед. этаж="
					+ nextFloorInt + "\nкол-ство людей в лифте="
					+ countHumanInt);
			myLift.move(nextFloorInt, countHumanInt);
			myLift.printAboutMe();
			System.out.println();
		}

	}
}
