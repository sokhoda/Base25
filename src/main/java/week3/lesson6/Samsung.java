package week3.lesson6;

public class Samsung extends Phone {
	public Samsung(String number, boolean isCamera, int sideSize) {
		super(number, isCamera, sideSize);
	}

	public Samsung(String number, boolean isCamera) {
		super(number, isCamera, 13);
	}

	public Samsung(String number) {
		super(number, true, 13);
	}

	@Override
	public String getModel() {
		return "Samsung";
	}

	@Override
	public void call(Phone ph) {
		System.out.println("телефон Samsung, No = " + getNumber()
				+ " звонит телефону No = " + ph.getNumber());
	}

	@Override
	public void printModel() {
		System.out.println("я телефон модели Samsung");
	}
}
