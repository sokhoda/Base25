package week3.lesson5;

public class MainPlane {
	public static void main(String[] args) {
		Plane plane1 = new Plane(20, 20);
		plane1.takeoff();
		System.out.println("состояние самолета = " + plane1.getState());
		// int[][] coord = new int[2][3];
		int[][] coord = { { -9, 1, 0 }, { 4, 1, 1 } };
		plane1.selectRoute(coord);
		plane1.printRoute();

	}
}
