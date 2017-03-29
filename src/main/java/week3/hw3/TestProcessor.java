package week3.hw3;

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

	private BigDecimal			secondOperand;
	private String				allZeros;

	public TestProcessor() {
		super();
		this.secondOperand = new BigDecimal("0");
		exp = 0;
		oper = '\u0000';
		allZeros = "";
	}

	@Override
	public void setResult(BigDecimal r) {
		// System.out.println("r.precision() = " + r.precision()
		// + ", r.scale() = " + r.scale());
		super.setResult(r.setScale(digits - (r.precision() - r.scale()),
				RoundingMode.CEILING).stripTrailingZeros());
	}

	@Override
	public void printResult(CalcUI calcUI) {
		// System.out.println("Result = " + result);
		if (getAllZeros().length() == 0) {
			DecimalFormat df = new DecimalFormat();
			df.setMinimumFractionDigits(0);
			int dig = (int) (Math.log10(getResult().doubleValue())) + 1;

			df.setMaximumFractionDigits(digits - dig);
			df.setGroupingUsed(false);
			System.out.println("Result: " + df.format(getResult()));
			calcUI.setDisplayFieldText(df.format(getResult()));

			// return Double.parseDouble(df.format(val));
		}
		else {
			System.out.println("Result: " + getAllZeros());
			calcUI.setDisplayFieldText(getAllZeros());
		}
	}

	@Override
	public void inputChar(char c) {
		String retValue = "";
		BigDecimal res = getResult();
		BigDecimal tmp = getTemp();
		System.out.println("Введено " + c);
		if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) {
			if (getOper() != '\u0000' && getOper() == c && getPrevChar() != '=') {
				if (c == '+') setResult(tmp.add(res));
				if (c == '-') setResult(tmp.subtract(res));
				if (c == '*') setResult(tmp.multiply(res));
				if (c == '/') setResult(tmp.divide(res, digits,
						RoundingMode.CEILING));
			}
			setTemp(getResult());
			setOper(c);
			setResetResult(true);
		}
		else if (c == '.') {
			setExp(1);
		}
		else if (c == '=') {
			if (getPrevChar() != '=') setSecondOperand(getResult());
			if (getPrevChar() == '=') {
				switch (getOper()) {
				case '+':
					setResult(res.add(secondOperand));
					break;
				case '-':
					setResult(res.subtract(secondOperand));
					break;
				case '*':
					setResult(res.multiply(secondOperand));
					break;
				case '/':
					if (secondOperand.compareTo(BigDecimal.ZERO) != 0) {
						setResult(res.divide(secondOperand, digits,
								RoundingMode.CEILING));
					}
					else setResult(BigDecimal.ZERO);
					break;
				}
			}
			else {
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
				// setOper('\u0000');
				setTemp(BigDecimal.ZERO);
			}
		}
		// backSpace
		else if (c == 8) {

			// double decPart = Math.abs(res.doubleValue() - res.intValue());
			BigDecimal decPart = res.subtract(
					new BigDecimal(res.toBigInteger())).abs();
			setExp(getExp() / 10);
			if (getExp() == 1) setExp(0);

			if (decPart.compareTo(BigDecimal.ZERO) != 0) { // double
				String s1 = res.toString();
				setResult(new BigDecimal(String.valueOf(s1.substring(0,
						s1.length() - 1))));
				// setExp(getExp() / 10);
				// if (getExp() == 1) setExp(0);
			}
			else { // Integer
				setExp(0);
				String s1 = res.toString();
				if ((s1.length() == 1)
						|| (s1.length() == 2 && s1.charAt(0) == '-')) {
					setResult(BigDecimal.ZERO);
				}
				else setResult(new BigDecimal(String.valueOf(s1.substring(0,
						s1.length() - 1))));
			}
			setOper('\u0000');

		}
		// MS
		else if (c == 14) {
			setMem(getResult());
		}
		// MR
		else if (c == 15) {
			setResult(getMem());

			// setOper(' ');
			setResetResult(true);
		}
		// MC
		else if (c == 16) {
			setResult(BigDecimal.ZERO);
		}
		// M+
		else if (c == 17) {
			setMem(getMem().add(getResult()));
		}
		// M-
		else if (c == 18) {
			setMem(getMem().subtract(getResult()));
		}
		// C -all
		else if (c == 19) {
			setTemp(BigDecimal.ZERO); // new BigDecimal("0")
			setResult(BigDecimal.ZERO);
			setExp(0);
			setOper('\u0000');
			setAllZeros("");
		}
		// CE
		else if (c == 20) {
			setResult(BigDecimal.ZERO);
			setExp(0);
			setAllZeros("");
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
				BigDecimal res1 = getResult();
				// десяткова частина числа
				BigDecimal decPart = res1.subtract(
						new BigDecimal(res1.toBigInteger())).abs();

				// (getResult().compareTo(BigDecimal.ZERO) == 0
				if (bd1.compareTo(BigDecimal.ZERO) == 0
						&& decPart.compareTo(BigDecimal.ZERO) == 0) {

					DecimalFormat df = new DecimalFormat("0");
					df.setMaximumFractionDigits(digits);

					String s1 = df.format(res1.toBigInteger().longValue()
							+ Math.pow(getExp(), -1));

					setAllZeros(s1.substring(0, s1.length() - 1) + "0");
				}
				else setAllZeros("");

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

	public BigDecimal getSecondOperand() {
		return secondOperand;
	}

	public void setSecondOperand(BigDecimal secondOperand) {
		this.secondOperand = secondOperand;
	}

	public String getAllZeros() {
		return allZeros;
	}

	public void setAllZeros(String allZeros) {
		this.allZeros = allZeros;
	}

}