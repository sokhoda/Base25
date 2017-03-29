package week2.lesson3;

public class MainPhone {
	public static void main(String[] args) {

		Phone tel1 = new Phone("099 123 45 67", "Siemens");

		Phone tel2 = new Phone("095 765 43 21", "Alcatel");
		Phone tel3 = new Phone("067 333 22 11", "LG");

		// System.out.println(Phone.isNumberExist("067 313 22 11"));
		// System.out.println(Phone.isNumberExist("099 123 45 67"));
		Phone tel4 = new Phone("063 111 22 00", "Vodafone");
		Phone tel5 = new Phone("099 123 02 01", "LG");
		Phone tel6 = new Phone("067 996 98 98", "Nokia");

		Phone tel9 = new Phone("099 053 02 01", "LG");
		Phone tel10 = new Phone("067 918 98 98", "Nokia");

		Phone tel11 = new Phone("099 233 02 01", "LG");
		Phone tel12 = new Phone("067 911 98 98", "Nokia");
		Phone tel13 = new Phone("050 998 98 98", "Nokia");

		Phone tel7 = Phone.getRandomPhone();
		Phone tel8 = Phone.getRandomPhone();

		System.out.println("\nномер = " + tel7.getMyNumber() + ", марка = "
				+ tel7.getMarka());

		System.out.println("\nномер = " + tel8.getMyNumber() + ", марка = "
				+ tel8.getMarka());

		tel7.call(tel8.getMyNumber());

	}
}
