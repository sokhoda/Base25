package week7.lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ThreadServer extends Thread {
	private ArrayList<String>	list		= new ArrayList<String>();
	private ArrayList<String>	readFiles	= new ArrayList<String>();
	private String				fileFolder;

	public ThreadServer(String fileFolder) {
		this.fileFolder = fileFolder;
	}

	@Override
	public void run() {
		if (fileFolder.length() == 0) {
			System.out.println("Не валидный путь к фалам чата. " + getName());
			return;
		}
		File myFolder = new File(fileFolder);
		File[] files = myFolder.listFiles();

		for (File file : files) {
			if (!file.isDirectory()
					&& MainTask3.getExtension(file.getName()).equals("cht")) {
				file.delete();
			}
		}

		try {
			while (true) {

				files = myFolder.listFiles();
				for (File file : files) {
					if (!file.isDirectory()) {
						String curFname = file.getName();

						if (MainTask3.getExtension(curFname).equals("cht")
								&& !readFiles.contains(curFname)) {

							FileInputStream fis = null;
							try {
								fis = new FileInputStream(fileFolder + curFname);
								// System.out.println(FNameIn + "\\" +
								// curFname);
							}
							catch (FileNotFoundException e) {
								e.printStackTrace();
							}
							try {
								ObjectInputStream oin;
								oin = new ObjectInputStream(fis);
								try {
									list.add("\n" + (String) oin.readObject());
									readFiles.add(curFname);
									System.out.println(list);
								}
								catch (ClassNotFoundException e) {
									e.printStackTrace();
								}

								finally {
									oin.close();
								}
							}
							catch (IOException e) {
								e.printStackTrace();
							}

						}
					}
				}

				sleep(2000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("завершение работы сервера. спасибо.");
			return;
		}
	}
}
