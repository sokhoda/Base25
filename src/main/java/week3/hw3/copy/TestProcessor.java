package week3.hw3.copy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestProcessor extends AbstractProcessor {
	// public TestProcessor() {
	// System.out.println("temp = " + getTemp() + ", result = " + getResult());
	// }
	private char				oper;
	private boolean				resetResult;

	private long				exp;
	private static final int	digits	= 10;

	public TestProcessor() {
		super();
		exp = 0;
	}

	@Override
	public void setResult(BigDecimal r) {
		super.setResult(r.setScale(digits - (r.precision() - r.scale()),
				RoundingMode.CEILING).stripTrailingZeros());
	}

	@Override
	public void printResult() {
		// System.out.println("Result = " + result);
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(0);
		int dig = (int) (Math.log10(getResult().doubleValue())) + 1;

		df.setMaximumFractionDigits(digits - dig);
		df.setGroupingUsed(false);
		System.out.println("Result: " + df.format(getResult()));
		// return Double.parseDouble(df.format(val));
	}

	@Override
	public void inputChar(char c) {
		System.out.println("¬ведено " + c);
		if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) {
			setTemp(getResult());
			setOper(c);
			setResetResult(true);
		}
		else if (c == '.') {
			setExp(1);
		}
		else if (c == '=') {
			BigDecimal res = getResult();
			BigDecimal tmp = getTemp();
			switch (getOper()) {
			case '+':
				setResult(tmp.add(res));
				break;
			case '-':
				setResult(tmp.subtract(res));
				break;
			case '*':
				setResult(tmp.multiply(res));
				break;
			case '/':
				if (res.compareTo(BigDecimal.ZERO) != 0) {
					setResult(tmp.divide(res, digits, RoundingMode.CEILING));
				}
				else setResult(BigDecimal.ZERO);
				break;
			}
			setTemp(BigDecimal.ZERO);

		}
		// backSpace
		else if (c == 8) {
			BigDecimal res = getResult();

			// double decPart = Math.abs(res.doubleValue() - res.intValue());
			BigDecimal decPart = res.subtract(
					new BigDecimal(res.toBigInteger())).abs();
			if (decPart.compareTo(BigDecimal.ZERO) != 0) { // double
				String s1 = res.toString();
				setResult(new BigDecimal(String.valueOf(s1.substring(0,
						s1.length() - 1))));
				setExp(getExp() / 10);
				if (getExp() == 1) setExp(0);
			}
			else { // Integer
				setExp(0);
				String s1 = res.toString();
				if (s1.length() == 1) {
					setResult(BigDecimal.ZERO);
				}
				else setResult(new BigDecimal(String.valueOf(s1.substring(0,
						s1.length() - 1))));
			}

		}
		// MS
		else if (c == 14) {

		}
		// MR
		else if (c == 15) {

		}
		// MC
		else if (c == 16) {

		}
		// M+
		else if (c == 17) {

		}
		// M-
		else if (c == 18) {

		}
		// C
		else if (c == 19) {
			setTemp(BigDecimal.ZERO); // new BigDecimal("0")
			setResult(BigDecimal.ZERO);
			setExp(0);
		}
		// CE
		else if (c == 20) {
			setResult(BigDecimal.ZERO);
			setExp(0);
		}

		else {

			if (getResetResult()) {
				setResult(BigDecimal.ZERO);
				setExp(0);
				setResetResult(false);
			}

			BigDecimal bd1 = new BigDecimal(String.valueOf((c - '0')));
			if (getExp() > 0) {
				setExp(getExp() * 10);
				BigDecimal bd2 = new BigDecimal(String.valueOf(getExp()));

				setResult(getResult().add(
						bd1.divide(bd2, digits, RoundingMode.CEILING)));
			}
			else setResult((getResult().multiply(BigDecimal.TEN)).add(bd1));

		}
	}

	public char getOper() {
		return oper;
	}

	public void setOper(char oper) {
		this.oper = oper;
	}

	public long getExp() {
		return exp;
	}

	public void setExp(long exp) {
		this.exp = exp;
	}

	public boolean getResetResult() {
		return resetResult;
	}

	public void setResetResult(boolean resetResult) {
		this.resetResult = resetResult;
	}
}