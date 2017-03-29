package week5.lesson10;

import java.util.Scanner;

public enum ColorEnum {
	brown, green, white, black;

	boolean isExist(String s) {
		ColorEnum[] color = ColorEnum.values();
		for (ColorEnum colorEnum : color) {
			if (s.equalsIgnoreCase(colorEnum.toString())) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите цвет");
		String s = scan.next();
		if (ColorEnum.black.isExist(s)) System.out.println("есть");
		else System.out.println("нет");

	}
}
