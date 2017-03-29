package week1.lesson1;

public class Task2 {

	public static void main(String[] args) {
		String s2 = new String("asda");
		String s = "abcdefg";

		// определяет длину строки
		int k = s.length();// 7

		// s.charAt( indexA) - возвращает символ строки s, который находится под
		// индексом indexA
		char c1 = s.charAt(0);// 'a'
		char c2 = s.charAt(2);// 'c'

		// s.indexOf( str) возвращает индекс из строки s , где начинается
		// подстрока str
		int k1 = s.indexOf("ab"); // 0
		int k2 = s.indexOf("de"); // 3
		int k3 = s.indexOf("af"); // -1

		// s.substring(indexA, indexB) - возвращает подстроку, которая
		// начинается с indexA по indexB не включительно
		String s1 = s.substring(2, 6); // "cdef"

		// s.equals(s1) - сравнение строк
		if (s1.equals(s)) {
			System.out.println("строки равные");
		} else {
			System.out.println("строки разные");
		}
	}
}
