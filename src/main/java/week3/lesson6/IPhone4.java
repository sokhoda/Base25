package week3.lesson6;

public class IPhone4 extends IPhone {

	public IPhone4(String number, boolean isCamera, int sideSize, int appleId) {
		super(number, isCamera, sideSize, appleId);
	}

	public IPhone4(String number, boolean isCamera, int appleId) {
		super(number, isCamera, 18, appleId);
	}

	public IPhone4(String number, int appleId) {
		super(number, true, 18, appleId);
	}

	@Override
	public String getModel() {
		return "IPhone4";
	}

	@Override
	public void call(Phone ph) {
		System.out.println("телефон IPhone4, No = " + getNumber()
				+ " звонит телефону No = " + ph.getNumber());
	}

	@Override
	public void printModel() {
		System.out.println("я телефон модели IPhone4");
	}

}
