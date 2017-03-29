package week2.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {
	private static String[]		operationNames			= {
		"1. �������� ����� ����������",
		"2. �������� ����� ������",
		"3. ��������� � ���� ������(������ �������� ���� � ��������)",
		"4. ��������� �� ���� ������(������ ������� ����)",
		"5. ���������� ������ ����",
		"6. ���������� ������ ��������",
		"7. ���������� ����������� ���� �� ���������",
		"8*. ������� ����� start ��� ���� (������ ������� ����)",
		"9*. ������� ����� move ��� ���� (������ ������� ����)",
		"10*. ������� ����� stop ��� ���� (������ ������� ����)",
		"11**. ���������� ������ ���� ���� � �������� � ������������� � ����������� ���� � ��������",
	"12. �����"								};

	private final int			width					= 17;
	private final String		NotAplicable			= "----";
	private static String[]		statusNames				= { "\"�������.\"",
	"\"�� �������.\""							};

	private ArrayList<Car>		cars					= new ArrayList<Car>();		;
	private ArrayList<Track>	tracks					= new ArrayList<Track>();	;

	private ArrayList<Integer>	FreeTracksArrInx		= new ArrayList<Integer>();
	private ArrayList<Integer>	FreeCarsArrInx			= new ArrayList<Integer>();
	private ArrayList<Integer>	CarsWithTracksArrInx	= new ArrayList<Integer>();

	private String replaceNull(Car car) {
		return (car == null) ? statusNames[1] : car.getNumber();
	}

	private String replaceNull(Track track) {
		return (track == null) ? statusNames[1] : track.getNumber();
	}

	public Car addNewCar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� ����:");
		String number = scan.nextLine();
		System.out.println("������� ���� ����:");
		String color = scan.nextLine();
		refreshFreeTracksArrInx();
		if (FreeTracksArrInx.size() > 0) {

			System.out.println("������ ��������� ������ ? (y/n):");
			char trackAnswer = (char) Character.toLowerCase((int) scan.next()
					.charAt(0));
			if (trackAnswer == 'y') {
				listFreeTracks();
				System.out.println("�������� ������ �� ��� ������� �� ������.");
				int inxTrack = scan.nextInt();

				while (inxTrack > FreeTracksArrInx.size() - 1 || inxTrack < -1) {
					System.out
					.println("������������ ������ �������. ��������� ����� (��� \'-1\' ��� ������ ����������� �������)");
					inxTrack = scan.nextInt();
				}
				if (inxTrack != -1) {
					cars.add(new Car(number, color, tracks.get(FreeTracksArrInx
							.get(inxTrack))));
					System.out.println("������ ���������");
				}
				else {
					cars.add(new Car(number, color, null));
					System.out.println("����������� ������� ��������.");
				}
			}
			else cars.add(new Car(number, color, null));
		}
		else cars.add(new Car(number, color, null));

		System.out.println("���� ������� ���������");
		return cars.get(cars.size() - 1);
	}

	private void refreshFreeTracksArrInx() {
		FreeTracksArrInx.clear();
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).getCar() == null) FreeTracksArrInx.add(i);
		}
	}

	private void refreshCarsWithTracksArrInx() {
		CarsWithTracksArrInx.clear();
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getTrack() != null) CarsWithTracksArrInx.add(i);
		}
	}

	private void refreshFreeCarsArrInx() {
		FreeCarsArrInx.clear();
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getTrack() == null) FreeCarsArrInx.add(i);
		}
	}

	public void listTracks() {
		if (tracks.size() == 0) {
			System.out.println("������ �������� ����.");
			return;
		}
		System.out.println("������ ��������:");
		formattedPrint(width, "����", "� �������", "� ������. ����");
		for (int i = 0; i < tracks.size(); i++) {
			formattedPrint(width, i + ".", tracks.get(i).getNumber(),
					replaceNull(tracks.get(i).getCar()));
		}
	}

	public int listFreeTracks() {
		refreshFreeTracksArrInx();
		if (FreeTracksArrInx.size() == 0) {
			System.out.println("������ ��������� �������� ����.");
			return FreeTracksArrInx.size();
		}
		System.out.println("������ ��������� ��������:");
		formattedPrint(width, "����", "� �������", "� ������. ����");
		for (int i = 0; i < FreeTracksArrInx.size(); i++) {
			formattedPrint(width, i + ".", tracks.get(FreeTracksArrInx.get(i))
					.getNumber(),
					replaceNull(tracks.get(FreeTracksArrInx.get(i)).getCar()));
		}
		return FreeTracksArrInx.size();
	}

	public int listFreeCars() {
		refreshFreeCarsArrInx();
		if (FreeCarsArrInx.size() == 0) {
			System.out.println("������ ��������� ���� ����.");
			return FreeCarsArrInx.size();
		}
		System.out.println("������ ��������� ����:");
		formattedPrint(width, "����", "� ����", "���� ����", "� ������. ����.");
		for (int i = 0; i < FreeCarsArrInx.size(); i++) {
			formattedPrint(width, i + ".", cars.get(FreeCarsArrInx.get(i))
					.getNumber(), cars.get(FreeCarsArrInx.get(i)).getColor(),
					replaceNull(cars.get(FreeCarsArrInx.get(i)).getTrack()));
		}
		return FreeCarsArrInx.size();
	}

	public int listCarsWithTrack() {
		refreshCarsWithTracksArrInx();
		if (CarsWithTracksArrInx.size() == 0) {
			System.out.println("������ ���� � ������������� ��������� ����.");
			return CarsWithTracksArrInx.size();
		}
		formattedPrint(width, "����", "� ����", "���� ����", "� ������. ����.");
		for (int i = 0; i < CarsWithTracksArrInx.size(); i++) {
			formattedPrint(width, i + ". ",
					cars.get(CarsWithTracksArrInx.get(i)).getNumber(), cars
							.get(CarsWithTracksArrInx.get(i)).getColor(), cars
							.get(CarsWithTracksArrInx.get(i)).getTrack()
					.getNumber());
		}
		return CarsWithTracksArrInx.size();
	}

	public void listCarsTrackState() {
		int i = 0;
		if (cars.size() != 0) {
			formattedPrint(width, "����", "� ����", "���� ����",
					"� ������. ����.", "��������� ����", "� �������",
					"� ������. ����", "��������� �������");

			for (i = 0; i < cars.size(); i++) {
				if (cars.get(i).getTrack() != null) {
					formattedPrint(width, i + ". ", cars.get(i).getNumber(),
							cars.get(i).getColor(), replaceNull(cars.get(i)
									.getTrack()), cars.get(i).getState(), cars
									.get(i).getTrack().getNumber(), cars.get(i)
									.getTrack().getCar().getNumber(),
									cars.get(i).getTrack().getState());
				}
				else formattedPrint(width, i + ". ", cars.get(i).getNumber(),
						cars.get(i).getColor(), replaceNull(cars.get(i)
								.getTrack()), cars.get(i).getState(),
								NotAplicable, NotAplicable, NotAplicable);
			}
		}
		refreshFreeTracksArrInx();
		if (FreeTracksArrInx.size() != 0) {
			if (cars.size() == 0) formattedPrint(width, "����", "� ����",
					"���� ����", "� ������. ����.", "��������� ����",
					"� �������", "� ������. ����", "��������� �������");

			for (int j = 0; j < FreeTracksArrInx.size(); j++) {
				formattedPrint(width, j + i + ".", NotAplicable, NotAplicable,
						NotAplicable, NotAplicable,
						tracks.get(FreeTracksArrInx.get(j)).getNumber(),
						replaceNull(tracks.get(FreeTracksArrInx.get(j))
								.getCar()), tracks.get(FreeTracksArrInx.get(j))
								.getState());
			}
		}
	}

	private void formattedPrint(int width, String... Stri) {
		for (String element : Stri) {
			String format = "%-" + width + "s";
			System.out.printf(format, element);
		}
		System.out.println();
	}

	public int listCars() {
		if (cars.size() == 0) {
			System.out.println("������ ���� ����.");
			return cars.size();
		}
		formattedPrint(width, "����", "� ����", "���� ����", "� ������. ����.");
		for (int i = 0; i < cars.size(); i++) {
			formattedPrint(width, i + ". ", cars.get(i).getNumber(), cars
					.get(i).getColor(), replaceNull(cars.get(i).getTrack()));
		}
		return cars.size();
	}

	public void startCar() {
		int inxCar = CarInx();
		if (inxCar != -1) cars.get(inxCar).start();
	}

	public void moveCar() {
		int inxCar = CarInx();
		if (inxCar != -1) cars.get(inxCar).move();
	}

	public void stopCar() {
		int inxCar = CarInx();
		if (inxCar != -1) cars.get(inxCar).stop();
	}

	private int CarInx() {
		if (listCars() == 0) return -1;
		Scanner scan = new Scanner(System.in);
		System.out
				.println("�������� ���� �� ��� ������� �� ������ (��� \'-1\' ��� ������ ����������� �������).");

		int inxCar = scan.nextInt();

		while (inxCar > cars.size() - 1 || inxCar < -1) {
			System.out
					.println("������������ ������ ����. ��������� ����� (��� \'-1\' ��� ������ ����������� �������)");
			inxCar = scan.nextInt();
		}
		return inxCar;
	}

	public void setTrack() {
		if (listFreeCars() == 0) return;
		refreshFreeTracksArrInx();
		if (FreeTracksArrInx.size() == 0) {
			System.out.println("������ ��������� �������� ����.");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out
		.println("�������� ���� �� ��� ������� �� ������ (��� \'-1\' ��� ������ ����������� �������).");

		int inxCar = scan.nextInt();

		while (inxCar > FreeCarsArrInx.size() - 1 || inxCar < -1) {
			System.out
			.println("������������ ������ ����. ��������� ����� (��� \'-1\' ��� ������ ����������� �������)");
			inxCar = scan.nextInt();
		}
		if (inxCar != -1) {

			System.out
			.println("�������� ������ �� ��� ������� �� ������ (��� \'-1\' ��� ������ ����������� �������).");
			listFreeTracks();
			int inxTrack = scan.nextInt();

			while (inxTrack > FreeTracksArrInx.size() - 1 || inxTrack < -1) {
				System.out
				.println("������������ ������ �������. ��������� ����� (��� \'-1\' ��� ������ ����������� �������)");
				inxTrack = scan.nextInt();
			}
			if (inxTrack != -1) {
				cars.get(FreeCarsArrInx.get(inxCar)).setTrack(
						tracks.get(FreeTracksArrInx.get(inxTrack)));
				System.out.println("������ ������� ���������");
				return;
			}
		}
		System.out.println("�������� ��������.");
	}

	public void unSetTrack() {
		if (listCarsWithTrack() == 0) return;
		Scanner scan = new Scanner(System.in);
		System.out
		.println("�������� ���� �� ��� ������� �� ������ (��� \'-1\' ��� ������ ����������� �������).");

		int inxCar = scan.nextInt();

		while (inxCar > CarsWithTracksArrInx.size() - 1 || inxCar < -1) {
			System.out
			.println("������������ ������ ����. ��������� ����� (��� \'-1\' ��� ������ ����������� �������)");
			inxCar = scan.nextInt();
		}
		if (inxCar != -1) {
			cars.get(CarsWithTracksArrInx.get(inxCar)).unSetTrack();
			System.out.println("������ ������� ���������");
			return;
		}
		System.out.println("�������� ��������.");
	}

	public Track addNewTrack() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� �������:");
		String number = scan.nextLine();

		tracks.add(new Track(number));
		System.out.println("������ ������� ��������");
		refreshFreeCarsArrInx();
		if (FreeCarsArrInx.size() > 0) {

			System.out.println("������ ��������� ������ ? (y/n):");
			char trackAnswer = (char) Character.toLowerCase((int) scan.next()
					.charAt(0));
			if (trackAnswer == 'y') {
				listFreeCars();
				System.out.println("�������� ���� �� ��� ������� �� ������.");
				int inxCar = scan.nextInt();

				while (inxCar > FreeCarsArrInx.size() - 1 || inxCar < -1) {
					System.out
					.println("������������ ������ ����. ��������� ����� (��� \'-1\' ��� ������ ����������� �������)");
					inxCar = scan.nextInt();
				}

				if (inxCar != -1) {
					cars.get(FreeCarsArrInx.get(inxCar)).setTrack(
							tracks.get(tracks.size() - 1));
					System.out.println("������ ������� ���������");
					return (tracks.get(tracks.size() - 1));
				}

			}
		}

		return (tracks.get(tracks.size() - 1));
	}

	public void start() {
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			System.out.println("�������� ��������:");
			printMenu();
			int k = scan.nextInt();
			switch (k) {
			case 1: {
				addNewCar();
				break;
			}
			case 2:
				addNewTrack();
				break;
			case 3:
				setTrack();
				break;
			case 4:
				unSetTrack();
				break;
			case 5:
				listCars();
				break;
			case 6:
				listTracks();
				break;
			case 7:
				listCarsWithTrack();
				break;
			case 8:
				startCar();
				break;
			case 9:
				moveCar();
				break;
			case 10:
				stopCar();
				break;
			case 11:
				listCarsTrackState();
				break;
			case 12:
				runWhile = false;
				System.out
				.println("��������� ��������� ������. ������� �� ����������� �����������.");
				break;
			default:
				System.out.println("������������ ����� ��������");
			}
		}
	}

	public static void printMenu() {
		for (String m : operationNames)
			System.out.println(m);
	}
}
