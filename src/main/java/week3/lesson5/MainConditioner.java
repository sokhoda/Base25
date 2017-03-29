package week3.lesson5;

import java.util.Scanner;

public class MainConditioner {
	public static void main(String[] args) {

		BlockConditioners blockCond = new BlockConditioners();
		String[] operationNames = {
				"1. Отобразить состояние всех кондиционеров",
				"2. Включить кондиционер с индексом...",
				"3. Выключить кондиционер с индексом...",
				"4. Установить температуру для кондиционера с индексом...",
		"5. Выход" };

		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			System.out.println("Выберите операцию:");
			for (String m : operationNames)
				System.out.println(m);

			int k = scan.nextInt();
			switch (k) {
			case 1: {
				blockCond.showConditionerState();
				break;
			}
			case 2:
				blockCond.turnOnConditioner();
				break;
			case 3:
				blockCond.turnOffConditioner();
				break;
			case 4:
				blockCond.setConditionerTemperature();
				break;
			case 5:
				runWhile = false;
				System.out
				.println("Программа завершает работу. Спасибо за пользование.");
				break;
			default:
				System.out.println("Некорректный номер операции");
			}
		}
	}
}
