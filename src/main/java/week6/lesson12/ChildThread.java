package week6.lesson12;

public class ChildThread extends Thread {
	private String	nameTh;

	public String getnameTh() {
		return nameTh;
	}

	public void setnameTh(String nameTh) {
		this.nameTh = nameTh;
	}

	public ChildThread(String nameTh) {
		this.nameTh = nameTh;
	}

	@Override
	public void run() {
		System.out.println(getnameTh() + " ����� ������. �������.");
		while (true) {
			if (isInterrupted()) {
				System.out.println(getnameTh() + " �������� ������. �������.");
				return;
			}
		}
	}
}
