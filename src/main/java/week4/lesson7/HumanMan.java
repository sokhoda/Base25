package week4.lesson7;

public class HumanMan extends AbstractHuman {
	@Override
	public void printAboutMe() {
		AbstractGlass myGlass = getGlass();
		String s1 = "Я мужчина.";
		if (myGlass != null) {
			s1 += " У меня есть стакан ";
			if (myGlass instanceof GlassCircle) s1 += "круглый.";
			else s1 += "квадратный.";
		}

		System.out.println(s1);
	}
}
