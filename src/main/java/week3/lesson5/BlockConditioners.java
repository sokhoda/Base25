package week3.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class BlockConditioners {
	private ArrayList<Conditioner>	block		= new ArrayList<Conditioner>();
	private static int				width		= 18;
	private final int				blockSize	= 10;

	public BlockConditioners() {
		for (int i = 0; i < blockSize; i++) {
			block.add(new Conditioner());
		}
	}

	private void formattedPrint(int width, String... Stri) {
		for (String element : Stri) {
			String format = "%-" + width + "s";
			System.out.printf(format, element);
		}
		System.out.println();
	}

	public void showConditionerState() {

		formattedPrint(width, "№пор.", "состояние", "температура");
		for (int i = 0; i < block.size(); i++) {
			formattedPrint(width, Integer.toString(i), block.get(i).getTurn(),
					Integer.toString(block.get(i).getTemperature()));
		}
	}

	public void turnOnConditioner() {
		int inx = checkIndex();
		if (inx > -1) block.get(inx).turnOn();
	}

	public void turnOffConditioner() {
		int inx = checkIndex();
		if (inx > -1) block.get(inx).turnOff();
	}

	public void setConditionerTemperature() {
		int inx = checkIndex();
		if (inx > -1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Задайте новую температуру кондиционера:");
			int temperature = scan.nextInt();
			block.get(inx).setTemperature(temperature);
		}
	}

	private int checkIndex() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Выберите индекс кондиционера:");
		int inx = scan.nextInt();
		while (inx > blockSize - 1 || inx <= -1) {
			System.out
					.println("Некорректный индекс кондиционера. Повторите выбор.");
			inx = scan.nextInt();
		}
		if (inx < blockSize && inx > -1) return inx;
		else {
			System.out.println("невалидный индекс кондиционера");
			return -1;
		}
	}
}
