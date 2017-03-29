package week3.lesson5;

import java.util.Scanner;

public class MainConditioner {
	public static void main(String[] args) {

		BlockConditioners blockCond = new BlockConditioners();
		String[] operationNames = {
				"1. ���������� ��������� ���� �������������",
				"2. �������� ����������� � ��������...",
				"3. ��������� ����������� � ��������...",
				"4. ���������� ����������� ��� ������������ � ��������...",
		"5. �����" };

		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			System.out.println("�������� ��������:");
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
				.println("��������� ��������� ������. ������� �� �����������.");
				break;
			default:
				System.out.println("������������ ����� ��������");
			}
		}
	}
}
