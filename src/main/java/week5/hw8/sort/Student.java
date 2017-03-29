package week5.hw8.sort;

import lombok.Data;

@Data
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
}
