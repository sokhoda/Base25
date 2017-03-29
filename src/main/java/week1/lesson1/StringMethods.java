package week1.lesson1;

public class StringMethods {
	public static void main(String[] args) {
		String s = "";
		s.equalsIgnoreCase("a");
		s.endsWith("end");
		s.startsWith("begin");
		s.trim();
		s.toUpperCase();
		s.toLowerCase();
		s.isEmpty();
		String[] arr = s.split(",");// "ab,,cd,ef"
		char[] arr1 = s.toCharArray();
	}
}
