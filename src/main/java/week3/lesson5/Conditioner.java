package week3.lesson5;

public class Conditioner {
	private int		temperature;
	private String	state;

	public Conditioner() {
		this(20, "выкл.");
	}

	public Conditioner(int temperature, String state) {
		super();
		this.temperature = temperature;
		this.state = state;
	}

	public void setTemperature(int k) {
		temperature = k;
	}

	public void turnOn() {
		state = "вкл.";
	}

	public void turnOff() {
		state = "выкл.";
	}

	public int getTemperature() {
		return temperature;
	}

	public String getTurn() {
		return state;
	};

}
