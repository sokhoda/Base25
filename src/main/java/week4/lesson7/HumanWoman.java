package week4.lesson7;

public class HumanWoman extends AbstractHuman {

	@Override
	public void printAboutMe() {
		AbstractGlass myGlass = getGlass();
		String s1 = "� �������.";
		if (myGlass != null) {
			s1 += " � ���� ���� ������ ";
			if (myGlass instanceof GlassCircle) s1 += "�������.";
			else s1 += "����������.";
		}

		System.out.println(s1);
	}
}
