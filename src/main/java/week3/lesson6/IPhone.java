package week3.lesson6;

public abstract class IPhone extends Phone {
	private int	appleId;

	public IPhone(String number, boolean isCamera, int sideSize, int appleId) {
		super(number, isCamera, sideSize);
		this.appleId = appleId;
	}

	public IPhone(String number, boolean isCamera, int appleId) {
		super(number, isCamera, 18);
		this.appleId = appleId;
	}

	public IPhone(String number, int appleId) {
		super(number, true, 18);
		this.appleId = appleId;
	}

	public int getAppleId() {
		return appleId;
	}

	public void setAppleId(int appleId) {
		this.appleId = appleId;
	}

	@Override
	public void call(Phone ph) {

	}

	@Override
	public void printModel() {

	}

	public void printAppleId() {
		System.out.println("appleId = " + appleId);
	}
}
