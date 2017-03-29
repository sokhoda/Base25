package week6.hw6;

public class MainFirma {
	static int	ThreadNum	= 1;
	static int	employeeNum	= 40;
	static int	managerNum	= 10;
	static int	sellerNum	= 10;

	public static void main(String[] args) {
		Firma firma = new Firma(1e6f);
		String[][] sirNames = { { "������", "0" }, { "�������", "10" },
				{ "���������", "10" }, { "����������", "10" },
				{ "������", "10" }, { "������", "10" }, { "�������", "0" },
				{ "��������", "0" }, { "�������������", "0" },
				{ "���������", "10" }, { "ʳ����", "1" },
				{ "�����������", "1" }, { "������", "10" }, { "������", "10" },
				{ "���������", "10" }, { "�����", "10" }, { "�������", "0" },
				{ "�����", "10" }, { "��������", "10" }, { "��������", "10" },
				{ "��������", "0" }, { "�������", "10" }, { "���������", "1" },
				{ "������", "0" }, { "�����", "10" }, { "����������", "0" },
				{ "�����", "10" }, { "��������", "10" }, { "������", "10" },
				{ "��������", "10" }, };

		String[][] names = { { "����", "0" }, { "����", "0" },
				{ "������", "0" }, { "³�����", "0" }, { "³����", "1" },
				{ "������", "0" }, { "������", "1" }, { "������", "0" },
				{ "���������", "0" }, { "�����", "1" }, { "����", "1" },
				{ "����", "1" }, { "��������", "0" }, { "��������", "0" },
				{ "������", "1" }, { "���������", "0" }, { "������", "0" },
				{ "����", "0" }, { "������", "1" }, { "������", "0" },
				{ "������", "0" }, { "���������", "1" }, { "����������", "0" },
				{ "������", "1" }, { "�����", "0" }, { "�����", "1" },
				{ "�����", "1" }, { "�����", "1" }, { "������", "0" },
				{ "������", "0" } };

		String[][] patronymicName = { { "�����볿���", "0" },
				{ "�����������", "1" }, { "�������", "0" },
				{ "���������", "1" }, { "��������", "0" },
				{ "���������", "1" }, { "��������", "0" },
				{ "����������", "1" }, { "³�������", "0" },
				{ "³��������", "1" }, { "������������", "0" },
				{ "�������������", "1" }, { "�����������", "0" },
				{ "������������", "1" }, { "��������", "0" },
				{ "���������", "1" }, { "�������", "0" }, { "��������", "1" },
				{ "������������", "0" }, { "�������������", "1" },
				{ "�������", "0" }, { "��������", "1" },
				{ "������������", "0" }, { "�������������", "1" },
				{ "�������", "0" }, { "��������", "1" }, { "��������", "0" },
				{ "���������", "1" }, { "���㳿���", "0" },
				{ "���������", "1" }, { "�����", "0" }, { "�������", "1" }, };

		String[] departments = { "��������", "������� ���������",
				"������� �������", "���������", "�������������",
				"��'���� � ���������", "�������������", "��������" };
		// Employee e1 = new Employee(sirNames, names, patronymicName,
		// departments, firma);
		// Manager e1 = new Manager(sirNames, names, patronymicName,
		// departments,
		// firma, 3);
		// System.out.println(e1);
		for (int i = 0; i < employeeNum; i++) {
			firma.getEmployee().add(
					new Employee(sirNames, names, patronymicName, departments,
							firma));
		}
		for (int i = 0; i < managerNum; i++) {
			firma.getEmployee().add(
					new Manager(sirNames, names, patronymicName, departments,
							firma, (int) (Math.random() * (employeeNum / 5.))));
		}
		for (int i = 0; i < sellerNum; i++) {
			firma.getEmployee().add(
					new Seller(sirNames, names, patronymicName, departments,
							firma));
		}
		// System.out.println(firma.getEmployee());
		// firma.sortBySalary();
		// System.out
		// .println("\n\n\n------------------ SORT BY SALARY -----------------------");
		// firma.printEmployee();

		firma.sortByID(firma.getEmployee());
		System.out
				.println("\n\n\n------------------ SORT BY ID -----------------------");
		firma.printEmployee();

		// firma.sortBySirName();
		// System.out
		// .println("\n\n\n------------------ SORT BY SurName -----------------------");
		// firma.printEmployee();

		// firma.sellAmount(1500);
		// System.out.println("\n\n\nsold 1000\n");
		// firma.printEmployee();
		//
		// try {
		// firma.paySalary();
		// }
		// catch (FirmaAccNotEnoughtMoneyToPaySalaryException e) {
		// e.printStackTrace();
		// // System.out.println(e.getMessage());
		// }
		// System.out.println("\n\n\nPAY SALARY\n");
		// firma.printEmployee();
		//
		// firma.countVacationDays();
		// System.out
		// .println("\n\n\n----------COUNT VACATION DAYS--------------------\n");
		// firma.printEmployee();
		//
		// firma.raiseSalary();
		// System.out
		// .println("\n\n\n----------RAISE SALARY--------------------\n");
		// firma.printEmployee();
		//
		// firma.dismissal();
		// System.out
		// .println("\n\n\n------------------------------DISMISSAL--------------------\n");
		// firma.printEmployee();

		firma.employ(departments);
		System.out
				.println("\n\n\n------------------------------NEW WORKERS EMPLOYED--------------------\n");
		firma.sortByDeptName();
		firma.printEmployee();

		// while (true) {
		// Scanner d = new Scanner(System.in);
		// int t = d.nextInt();
		//
		// System.out.println(t + ", " + firma.binarySearchByID(t));
		// }
		//
		// int f = firma.binarySearchByID(firma.getEmployee()
		// .get(firma.getEmployee().size() - 1).getSubordId().get(0));
		// System.out.println(f);

	}
}
