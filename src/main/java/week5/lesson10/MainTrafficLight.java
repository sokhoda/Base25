package week5.lesson10;

public class MainTrafficLight {
	public static void main(String[] args) {
		TrafficLight trLight = new TrafficLight();

		for (int i = 0; i < 10; i++) {
			System.out.println(trLight.switchNextColor());
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
