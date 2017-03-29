package week3.lesson6;

public abstract class Phone {
	private String	number;
	private boolean	isCamera;
	private int		sideSize;

	public Phone(String number, boolean isCamera, int sideSize) {
		this.number = number;
		this.isCamera = isCamera;
		this.sideSize = sideSize;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean getIsCamera() {
		return isCamera;
	}

	public void setIsCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public int getSideSize() {
		return sideSize;
	}

	public void setSideSize(int sideSize) {
		this.sideSize = sideSize;
	}

	public void call(Phone ph) {

	}

	public void printModel() {

	}

	public String getModel() {
		return "";
	}
}
