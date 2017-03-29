package week3.lesson6;

public class IPhone5 extends IPhone {

	public IPhone5(String number, boolean isCamera, int sideSize, int appleId) {
		super(number, isCamera, sideSize, appleId);
	}

	public IPhone5(String number, boolean isCamera, int appleId) {
		super(number, isCamera, 18, appleId);
	}

	public IPhone5(String number, int appleId) {
		super(number, true, 18, appleId);
	}

	@Override
	public String getModel() {
		return "IPhone5";
	}

	@Override
	public void call(Phone ph) {
		System.out.println("телефон IPhone4, No = " + getNumber()
				+ " звонит телефону No = " + ph.getNumber());
	}

	@Override
	public void printModel() {
		System.out.println("я телефон модели IPhone5");
	}

}
