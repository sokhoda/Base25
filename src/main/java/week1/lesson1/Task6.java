package week1.lesson1;

public class Task6 {
	public static int MyIndex(String s1, String s2) {
		String s3;
		int result = -1;
		int i1 = s2.length();
		if (i1 == 0) {
			return result;
		}
		for (int i = 0; i <= s1.length() - i1; i++) {

			s3 = s1.substring(i, i + i1);
			if (Task5.myEquals(s3, s2)) {
				return i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = Task4.inputString();
		String str1 = Task4.inputString();
		int i2 = MyIndex(str, str1);
		System.out.println(i2);
	}
}
