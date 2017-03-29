package week2.lesson4;

public class A {
	public A() {
		System.out.println("запуск конструктора");
	}

	{
		System.out.println("нестатический блок инициализации");
	}
	static {
		System.out.println("статический блок инициализации");
	}
}
