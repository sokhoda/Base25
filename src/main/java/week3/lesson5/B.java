package week3.lesson5;

public class B extends A {

	{
		System.out.println("Ѕлок инициализ. наследника");
	}
	static {
		System.out.println("—татический блок инициализ. наследника");
	}

	public B() {
		System.out.println("конструктор наследника");
	}

}
