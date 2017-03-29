package week4.lesson7;

public abstract class AbstractTable implements Tableable {
	private boolean	dry;

	@Override
	public boolean isDry() {
		return dry;
	}

	public void setDry(boolean dry) {
		this.dry = dry;
	}

}
