package week2.lesson3;

public class Phone {
	private static Phone[] phones = new Phone[10];
	private String myNumber;
	private String marka;

	public Phone(String number, String marka) {
		myNumber = number;
		this.marka = marka;
		int j;
		if (!(this.isNumberExist(number))) {
			for (j = 0; j < phones.length; j++)
				if (phones[j] == null)
					break;
			if (j == phones.length)
				System.out.println("\nмассив телефонов уже полностью заполнен");
			else
				phones[j] = this;
		}
	}

	static Phone getRandomPhone() {
		boolean allNull = true;
		for (Phone phone : phones)
			if (phone != null) {
				allNull = false;
				break;
			}
		if (allNull == false) {
			int i;
			do
				i = (int) (phones.length * Math.random());
			while (phones[i] == null);
			return phones[i];
		}
		return null;
	}

	void call(String number) {
		int findIndex = -1;
		int j;
		for (j = 0; j < phones.length; j++)
			if (phones[j] != null)
				if (phones[j].myNumber.equals(number)) {
					findIndex = j;
					break;
				}
		if (findIndex >= 0)
			System.out.println("\nтелефон номер = " + myNumber + ", марка = "
					+ marka + "\nзвонит номеру = " + number + ", марка = "
					+ phones[findIndex].marka);
		else
			System.out.println("телефон с номером " + number + " не найден.");

	}

	static boolean isNumberExist(String number) {
		int i = 0;
		boolean found = false;

		while (i < phones.length) {
			if (phones[i] != null)
				if (phones[i].myNumber.equals(number)) {
					found = true;
					return found;
				}
			i++;
		}
		return found;
	}

	public String getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
}
