package week2.lesson4;

public class MainTrack {
	public static void main(String[] args) {
		Track track1 = new Track("AA 5555");
		Track track2 = new Track("KK 8787");

		track1.roll();
		track2.roll();

		track1.roll();

		track1.stop();
		track2.stop();
		track2.stop();

	}
}
