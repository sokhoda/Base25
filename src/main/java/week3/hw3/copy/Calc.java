package week3.hw3.copy;

import week3.hw3.CalcUI;

public class Calc {
	private AbstractProcessor	proc;
	private CalcUI				calcImage;

	public Calc(AbstractProcessor pr) {
		proc = pr;
	}

	public void inSymv(char c) {
		proc.inputChar(c);
		proc.printResult();
	}

}