package week4.lesson7;

public abstract class AbstractGlass implements Glassable {
	private boolean	empty;

	public AbstractGlass() {
		this.empty = true;
	}

	@Override
	public void pourFromMe() {
	}

	public boolean getEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
}
