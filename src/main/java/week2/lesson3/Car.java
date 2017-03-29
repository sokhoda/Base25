package week2.lesson3;

public class Car {
	private String number;
	private String marka;
	private static String name;
	private static int ObjNum;

	public Car() {
		ObjNum += 1;
	}

	public static int getCountObj() {
		return ObjNum;
	}

	public static void printCountObj() {
		System.out.println("\nколичество объектов = " + getCountObj());
	}

	void printAboutMe() {
		System.out.println("Номер = " + number + "\nмарка = " + marka);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	};

}
