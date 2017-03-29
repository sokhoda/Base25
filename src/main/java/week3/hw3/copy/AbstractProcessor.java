package week3.hw3.copy;

import java.math.BigDecimal;

public abstract class AbstractProcessor implements Processorable {
	private BigDecimal	result;
	private BigDecimal	temp;

	public AbstractProcessor() {
		this.result = new BigDecimal("0");
		this.temp = new BigDecimal("0");
	}

	public BigDecimal getTemp() {
		return temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	@Override
	public void printResult() {
		System.out.println("Result = " + result);
	}

	public void setResult(BigDecimal r) {
		result = r;
	}

	public BigDecimal getResult() {

		return result;

	}
}
