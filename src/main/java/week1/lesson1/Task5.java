package week1.lesson1;

public class Task5 {
	public static void main(String[] args) {
		String str = Task4.inputString();
		String str1 = Task4.inputString();
		System.out.println(myEquals(str, str1));
	}

	public static boolean myEquals(String s, String s1) {
		if (s.length() != s1.length()) {
			return false;
		} else {
			char[] c1 = s1.toCharArray();
			char[] c = s.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] != c1[i]) {
					return false;
				}
			}
			return true;
		}

	}
}