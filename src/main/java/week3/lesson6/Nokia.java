package week3.lesson6;

public class Nokia extends Phone {

	public Nokia(String number, boolean isCamera, int sideSize) {
		super(number, isCamera, sideSize);
	}

	public Nokia(String number, boolean isCamera) {
		super(number, isCamera, 15);
	}

	public Nokia(String number) {
		super(number, true, 15);
	}

	@Override
	public String getModel() {
		return "Nokia";
	}

	@Override
	public void call(Phone ph) {
		System.out.println("телефон Nokia, No = " + getNumber()
				+ " звонит телефону No = " + ph.getNumber());
	}

	@Override
	public void printModel() {
		System.out.println("я телефон модели Nokia");
	}
}
