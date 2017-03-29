package week1.lesson2;

import java.util.Scanner;

public class RandArr {
	public static boolean fillRandArr(int row, int col) {
		if ((row < 1) || (col < 1)) {
			System.out.println("Неверный размер массива!");
			return false;
		}
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				double f = Math.random(); // 0..1
				arr[i][j] = (int) (f * 10);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		fillRandArr(i, j);
	}
}
