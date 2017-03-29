package week1.lesson1;

import java.io.FileWriter;

public class Task7 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("file1.txt");
		fw.write("stroka 1\n          strok2\n");// \r \r\n
		fw.write("\t\tstroka 3");
		fw.flush();
		fw.close();
	}
}
