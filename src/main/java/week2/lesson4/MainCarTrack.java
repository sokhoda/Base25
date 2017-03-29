package week2.lesson4;

public class MainCarTrack {
	public static void main(String[] args) {
		Track track1 = new Track("AA 5555");
		Track track2 = new Track("KK 8787");

		Car car1 = new Car("¿≈ 1005");
		Car car2 = new Car("¿≈ 9009");
		car1.setTrack(track1);
		car2.setTrack(track1);

		car1.setTrack(track2);
		// car1.unSetTrack();
		car2.setTrack(track2);
		// car2.unSetTrack();

		car1.start();
		car2.start();

		car1.move();
		track1.roll();
		// track2.roll();
		car2.move();

		car1.stop();
		car2.stop();
		track2.stop();

	}
}
