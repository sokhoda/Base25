package week5.hw8.sort;

public class Student {
	private String	name;

	private String	surname;
	private String	middleName;
	private int[]	marks;

	public Student(String name, String surname, String middleName, int[] marks) {
		this.name = name;
		this.surname = surname;
		this.middleName = middleName;
		this.setMarks(marks);
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
