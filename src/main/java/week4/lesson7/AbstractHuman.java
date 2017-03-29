package week4.lesson7;

public abstract class AbstractHuman implements Humanable {
	AbstractGlass	glass;

	public AbstractHuman() {
		this.glass = null;
	}

	@Override
	public void takeGlass(AbstractGlass glass) {
		this.glass = glass;
	}

	@Override
	public void putGlass() {
		this.glass = null;
	}

	@Override
	public void pourWaterOnTable(AbstractTable table) {
		table.setDry(false);
	}

	@Override
	public void fillGlass() {
		glass.setEmpty(false);
	}

	@Override
	public void printAboutMe() {
	}

	public AbstractGlass getGlass() {
		return glass;
	}

	public void setGlass(AbstractGlass glass) {
		this.glass = glass;
	}
}
