package pratice_02;

public class Quiz_01 {
	public static void main(String[] args) {
		BiTest test = (a, b) -> a + "�� " + b + "�� �Ű������� �Ѿ�Խ��ϴ�.";
		
		String a = "����";
		String b = "�̸޷�";
		System.out.println(test.apply(a, b));
	}
}

interface BiTest{
	abstract String apply(String a, String b);
}
