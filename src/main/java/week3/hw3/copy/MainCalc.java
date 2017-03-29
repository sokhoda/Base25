package week3.hw3.copy;

import java.util.Locale;

public class MainCalc {

	public static void main(String[] args) {
		Locale EngLocale = new Locale("en", "UK");
		Locale.setDefault(EngLocale);
		AbstractProcessor processor = new TestProcessor();
		AbstractProcessor processor1 = new TestProcessor();
		Calc calc = new Calc(processor);

		calc.inSymv('1');
		calc.inSymv('3');
		calc.inSymv('.');
		calc.inSymv('7');
		calc.inSymv('5');
		calc.inSymv((char) (8));
		calc.inSymv((char) (8));
		calc.inSymv('+');
		calc.inSymv('1');
		calc.inSymv('2');
		calc.inSymv('9');
		calc.inSymv('7');
		calc.inSymv('5');
		calc.inSymv((char) (8));
		calc.inSymv('=');
		calc.inSymv('+');
		calc.inSymv('0');
		calc.inSymv('.');
		calc.inSymv('2');
		calc.inSymv('=');
		calc.inSymv('-');
		calc.inSymv('0');
		calc.inSymv('0');
		calc.inSymv('=');
		calc.inSymv('*');
		calc.inSymv('7');
		calc.inSymv('.');
		calc.inSymv('1');
		calc.inSymv('1');
		calc.inSymv((char) (8));
		calc.inSymv((char) (8));
		calc.inSymv('.');
		calc.inSymv('2');
		calc.inSymv('=');
		calc.inSymv((char) (8));
		calc.inSymv((char) (8));
		calc.inSymv((char) (8));
		calc.inSymv((char) (8));
		calc.inSymv('+');
		calc.inSymv('1');
		calc.inSymv('1');
		calc.inSymv('1');
		calc.inSymv('1');
		calc.inSymv('=');
		calc.inSymv('/');
		calc.inSymv('1');
		calc.inSymv('3');
		calc.inSymv('.');
		calc.inSymv('7');
		calc.inSymv('8');
		calc.inSymv('8');
		calc.inSymv((char) (8));
		calc.inSymv((char) (8));
		calc.inSymv('1');
		calc.inSymv('=');

	}
}